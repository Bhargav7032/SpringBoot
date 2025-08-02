package com.example.entity;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Course", joinColumns = { @JoinColumn(name = "sid_id") }, 
	inverseJoinColumns = {@JoinColumn(name = "course_id") })
	private Set<Course> courses;

	
	
	
	
}
