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

public class Project {
	@Id
	private Integer id_project;
	
	@Temporal(TemporalType.DATE)
	private Date start_project;

	@Temporal(TemporalType.DATE)
	private Date end_project;

	public String Detaliu;
	@ManyToOne
	private Team team;
	
	@OneToMany(mappedBy="project", cascade=CascadeType.ALL)
    private List <Meeting> meeting= new ArrayList<Meeting>();
	
	@OneToMany(mappedBy="project", cascade=CascadeType.ALL)
    private List <Task> task= new ArrayList<Task>();

	public Integer getId_project() {
		return id_project;
	}

	public void setId_project(Integer id_project) {
		this.id_project = id_project;
	}

	public Date getStart_project() {
		return start_project;
	}

	public void setStart_project(Date start_project) {
		this.start_project = start_project;
	}

	public Date getEnd_project() {
		return end_project;
	}

	public void setEnd_project(Date end_project) {
		this.end_project = end_project;
	}

	public String getDetaliu() {
		return Detaliu;
	}

	public void setDetaliu(String detaliu) {
		Detaliu = detaliu;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<Meeting> getMeeting() {
		return meeting;
	}

	public void setMeeting(List<Meeting> meeting) {
		this.meeting = meeting;
	}

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

	public Project(Integer id_project, Date start_project, Date end_project, String detaliu, Team team,
			List<Meeting> meeting, List<Task> task) {
		super();
		this.id_project = id_project;
		this.start_project = start_project;
		this.end_project = end_project;
		Detaliu = detaliu;
		this.team = team;
		this.meeting = meeting;
		this.task = task;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
