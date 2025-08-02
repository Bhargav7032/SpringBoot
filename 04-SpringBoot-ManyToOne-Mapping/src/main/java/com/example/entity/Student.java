package com.example.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student_Tab")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "sid_id")
	private long sid;
    @Column(name = "sid_name")
	private String name;
	@Column(name = "sid_fee")
	private double fee;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
	private List<Course> courses;

	
	
	
	
}
