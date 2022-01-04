package database.entities;

import java.util.*;
import javax.persistence.*;

import org.hibernate.annotations.Type;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Type(type = "uuid-char")
	@Column(name="userId")
	private UUID id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Game>games;
	
	@Column(name="loyaltyPoints")
	private int loyaltyPoints;
	
	@ManyToOne(fetch = FetchType.EAGER)
	Role role;
	
	@ManyToMany(fetch=FetchType.EAGER)
	Set<Invoice> invoices;
}