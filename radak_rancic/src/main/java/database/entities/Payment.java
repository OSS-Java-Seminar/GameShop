package database.entities;

import javax.persistence.*;
import java.util.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="paymentId")
	private UUID id;
	@Column(name="paymentType")
	private String type;
	
	public Payment(String type) {
		this.type=type;	
	}
}
