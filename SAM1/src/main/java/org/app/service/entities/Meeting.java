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

public class Meeting {
	@Id
	private Integer id_meeting;

	@Temporal(TemporalType.DATE)
	private Date start_meeting;

	@Temporal(TemporalType.DATE)
	private Date end_meeting;

	private String rezumat;
	@ManyToOne
	private Team team;
	
	@ManyToOne
	private Project project;
	
	@OneToMany(mappedBy="meeting", cascade=CascadeType.ALL)
    private List <Topic> topic= new ArrayList<>();

	public Integer getId_meeting() {
		return id_meeting;
	}

	public void setId_meeting(Integer id_meeting) {
		this.id_meeting = id_meeting;
	}

	public Date getStart_meeting() {
		return start_meeting;
	}

	public void setStart_meeting(Date start_meeting) {
		this.start_meeting = start_meeting;
	}

	public Date getEnd_meeting() {
		return end_meeting;
	}

	public void setEnd_meeting(Date end_meeting) {
		this.end_meeting = end_meeting;
	}

	public String getRezumat() {
		return rezumat;
	}

	public void setRezumat(String rezumat) {
		this.rezumat = rezumat;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Topic> getTopic() {
		return topic;
	}

	public void setTopic(List<Topic> topic) {
		this.topic = topic;
	}

	public Meeting(Integer id_meeting, Date start_meeting, Date end_meeting, String rezumat, Team team, Project project,
			List<Topic> topic) {
		super();
		this.id_meeting = id_meeting;
		this.start_meeting = start_meeting;
		this.end_meeting = end_meeting;
		this.rezumat = rezumat;
		this.team = team;
		this.project = project;
		this.topic = topic;
	}

	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
