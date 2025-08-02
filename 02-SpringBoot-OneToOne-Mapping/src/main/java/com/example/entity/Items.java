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
@Table(name = "Items_Tab")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Items {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name ="items_id")
	private int id;
	@Column(name ="items_name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "items" )
	@JoinColumn(name = "items_id")
    private Customer customer;
	
	
	
	
}
