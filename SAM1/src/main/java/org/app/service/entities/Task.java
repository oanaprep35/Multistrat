package org.app.service.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance

public class Task {
	@Id
	private Integer id_task;
	
	@Temporal(TemporalType.DATE)
	private Date start_task;

	@Temporal(TemporalType.DATE)
	private Date end_task;

	private String Descriere;
	
	@ManyToOne
	private Member member;
	
	@ManyToOne
	private Project project;

	public Integer getId_task() {
		return id_task;
	}

	public void setId_task(Integer id_task) {
		this.id_task = id_task;
	}

	public Date getStart_task() {
		return start_task;
	}

	public void setStart_task(Date start_task) {
		this.start_task = start_task;
	}

	public Date getEnd_task() {
		return end_task;
	}

	public void setEnd_task(Date end_task) {
		this.end_task = end_task;
	}

	public String getDescriere() {
		return Descriere;
	}

	public void setDescriere(String descriere) {
		Descriere = descriere;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Task(Integer id_task, Date start_task, Date end_task, String descriere, Member member, Project project) {
		super();
		this.id_task = id_task;
		this.start_task = start_task;
		this.end_task = end_task;
		Descriere = descriere;
		this.member = member;
		this.project = project;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
