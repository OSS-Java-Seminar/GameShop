package database.entities;

import javax.persistence.*;

import lombok.*;
@Entity
@Data
@Table(name="Payment")
public class Payment {
	@Column(name="paymentId")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="paymentType")
	private String type;
	public Payment(String type) {
		this.type=type;	
	}
}
