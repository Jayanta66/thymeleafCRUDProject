package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "day")
	private String day;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "emaila")
	private String emaila;
	
	
	
	@Column(name = "emailb")
	private String emailb;
	
	@Column(name = "emailc")
	private String emailc;	
	
	@Column(name = "emaild")
	private String emaild;
	
	
	@Column(name = "emaile")
	private String emaile;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmaila() {
		return emaila;
	}


	public void setEmaila(String emaila) {
		this.emaila = emaila;
	}


	public String getEmailb() {
		return emailb;
	}


	public void setEmailb(String emailb) {
		this.emailb = emailb;
	}


	public String getEmailc() {
		return emailc;
	}


	public void setEmailc(String emailc) {
		this.emailc = emailc;
	}


	public String getEmaild() {
		return emaild;
	}


	public void setEmaild(String emaild) {
		this.emaild = emaild;
	}


	public String getEmaile() {
		return emaile;
	}


	public void setEmaile(String emaile) {
		this.emaile = emaile;
	}



	
	
	
	
	
}
