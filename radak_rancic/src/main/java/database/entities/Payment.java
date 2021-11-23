package database.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@Table(name="Payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="paymentId")
	private int id;
	@Column(name="paymentType")
	private String type;
	
	public Payment(String type) {
		this.type=type;	
	}
}
