package database.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="invoiceId")
	private Long id;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="keyId")
	private List<KeyStorage> keystorage;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(
			name="payment_Id",
			referencedColumnName="paymentId"					
			)
	private Payment p;
}
