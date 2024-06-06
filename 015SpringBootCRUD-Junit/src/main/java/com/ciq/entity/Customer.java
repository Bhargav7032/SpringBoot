package com.ciq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "Customer")
public class Customer {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
    private String cFname;
	private String cLname;
	private int  cAge;
	private String cEmail;
	private long  cPnumber;
	
	
	
}
