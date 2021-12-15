package database.entities;

import java.util.*;
import javax.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="invoiceId")
	private UUID id;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="keyId")
	private List<KeyStorage> keystorage;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(
			name="payment_Id",
			referencedColumnName="paymentId"					
			)
	private Payment payment;
}