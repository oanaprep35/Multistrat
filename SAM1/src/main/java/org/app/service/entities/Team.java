package org.app.service.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;

@Entity
@Inheritance
public class Team {
	@Id
	@GeneratedValue
		private Integer id_team;
		private String nume_echipa;
		private String leader;
		
	@OneToMany(mappedBy="team", cascade=CascadeType.ALL)
	private List <Member> member= new ArrayList<Member>();
	
	@OneToMany(mappedBy="team", cascade=CascadeType.ALL)
    private List <Meeting> meeting= new ArrayList<Meeting>();
	
	@OneToMany(mappedBy="team", cascade=CascadeType.ALL)
    private List <Project> project= new ArrayList<Project>();

	public Integer getId_team() {
		return id_team;
	}

	public void setId_team(Integer id_team) {
		this.id_team = id_team;
	}

	public String getNume_echipa() {
		return nume_echipa;
	}

	public void setNume_echipa(String nume_echipa) {
		this.nume_echipa = nume_echipa;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public List<Member> getMember() {
		return member;
	}

	public void setMember(List<Member> member) {
		this.member = member;
	}

	public List<Meeting> getMeeting() {
		return meeting;
	}

	public void setMeeting(List<Meeting> meeting) {
		this.meeting = meeting;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Team(Integer id_team, String nume_echipa, String leader, List<Member> member, List<Meeting> meeting,
			List<Project> project) {
		super();
		this.id_team = id_team;
		this.nume_echipa = nume_echipa;
		this.leader = leader;
		this.member = member;
		this.meeting = meeting;
		this.project = project;
	}

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
