package database.entities;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.util.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Type(type = "uuid-char")
	@Column(name="paymentId")
	private UUID id;
	
	@Column(name="paymentType")
	private String type;
	
	public Payment(String type) {
		this.type=type;	
	}
}
