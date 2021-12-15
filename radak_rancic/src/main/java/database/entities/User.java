package database.entities;

import java.util.*;
import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userId")
	private UUID id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@ManyToMany(
			fetch = FetchType.EAGER
			)
	@JoinTable(
			name="Game_User",
			joinColumns=@JoinColumn(
					name="user_Id",
					referencedColumnName = "userId"
					),
			inverseJoinColumns = @JoinColumn(
					name="game_Id",
					referencedColumnName = "gameId"
					)
			)
	private Set<Game>games;
	@Column(name="loyaltyPoints")
	private int loyaltyPoints;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(
			name="role_Id",
			referencedColumnName="roleId"					
			)
	Role role;
	public User(String username, String password, String email, int loyaltyPoints) {
		this.username = username;
		this.password = password;
		this.email = email;
		//this.games = games;
		this.loyaltyPoints = loyaltyPoints;
//		this.roleId = roleId;
	}
	
	
}