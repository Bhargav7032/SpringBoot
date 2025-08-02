package com.example.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Course_Tab")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "course_id")
	private long id;
	@Column(name = "course_name")
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sid_id")
	private Student student;

}
