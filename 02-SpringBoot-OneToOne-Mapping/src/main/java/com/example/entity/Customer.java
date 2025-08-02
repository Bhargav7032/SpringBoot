package com.example.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Customer_Tab")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Customer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "customer_id")
	private int id;
	@Column(name = "customer_name")
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	private Items items;

	
	

}
