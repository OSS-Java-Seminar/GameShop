package database.entities;

import java.util.*;
import javax.persistence.*;

import org.hibernate.annotations.Type;

import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Type(type = "uuid-char")
	@Column(name="invoiceId")
	private UUID id;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<KeyStorage> keys;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Payment payment;
}