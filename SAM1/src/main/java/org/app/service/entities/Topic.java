package org.app.service.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;

@Entity
@Inheritance
public class Topic {
	@Id
	private Integer id_topic;
	private String nume_topic;
	private String nume_tag;
	
	@ManyToOne
	private Meeting meeting;

	public Integer getId_topic() {
		return id_topic;
	}

	public void setId_topic(Integer id_topic) {
		this.id_topic = id_topic;
	}

	public String getNume_topic() {
		return nume_topic;
	}

	public void setNume_topic(String nume_topic) {
		this.nume_topic = nume_topic;
	}

	public String getNume_tag() {
		return nume_tag;
	}

	public void setNume_tag(String nume_tag) {
		this.nume_tag = nume_tag;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}

	public Topic(Integer id_topic, String nume_topic, String nume_tag, Meeting meeting) {
		super();
		this.id_topic = id_topic;
		this.nume_topic = nume_topic;
		this.nume_tag = nume_tag;
		this.meeting = meeting;
	}

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
