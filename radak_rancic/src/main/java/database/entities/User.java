package database.entities;

import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userId")
	private Long userId;
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
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="User")
	@JoinColumn(name="roleId")
	private int roleId;
	
	public User(String username, String password, String email, Set<Game> games, int loyaltyPoints, int roleId) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.games = games;
		this.loyaltyPoints = loyaltyPoints;
		this.roleId = roleId;
	}
	
	
}
