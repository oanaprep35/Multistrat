package org.app.service.entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance
public class Member {
	@Id
    private Integer id_member;
	private String nume_membru;
	private String prenume_membru;

    @Temporal(TemporalType.DATE)
    private Date data_nasterii;
    
    private String telefon;
    private String email;
    private String functia;
    
    @ManyToOne
    private Team team;
    
    @OneToMany(mappedBy="member", cascade=CascadeType.ALL)
    private List <Task> task= new ArrayList<Task>();

	public Integer getId_member() {
		return id_member;
	}

	public void setId_member(Integer id_member) {
		this.id_member = id_member;
	}

	public String getNume_membru() {
		return nume_membru;
	}

	public void setNume_membru(String nume_membru) {
		this.nume_membru = nume_membru;
	}

	public String getPrenume_membru() {
		return prenume_membru;
	}

	public void setPrenume_membru(String prenume_membru) {
		this.prenume_membru = prenume_membru;
	}

	public Date getData_nasterii() {
		return data_nasterii;
	}

	public void setData_nasterii(Date data_nasterii) {
		this.data_nasterii = data_nasterii;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFunctia() {
		return functia;
	}

	public void setFunctia(String functia) {
		this.functia = functia;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

	public Member(Integer id_member, String nume_membru, String prenume_membru, Date data_nasterii, String telefon,
			String email, String functia, Team team, List<Task> task) {
		super();
		this.id_member = id_member;
		this.nume_membru = nume_membru;
		this.prenume_membru = prenume_membru;
		this.data_nasterii = data_nasterii;
		this.telefon = telefon;
		this.email = email;
		this.functia = functia;
		this.team = team;
		this.task = task;
	}

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

    

}
