package database.entities;

import java.util.Set;

import javax.persistence.*;

import lombok.*;
@Data
@Entity
@Table(name="User")
public class User {
	@Column(name="userId")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="games")
	private Set<Game>games;
	@Column(name="loyaltyPoints")
	private int loyaltyPoints;
	@Column(name="role")
	@OneToMany
	@JoinColumn(name="roleId")
	private int roleId;
}
