package database.entities;

import java.util.*;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="Game_User")
public class GameUser {
	@ManyToOne
	@JoinColumn(name="gameId")
	private int gameId;
	@ManyToOne
	@JoinColumn(name="userId")
	private int userId;
	@OneToMany
	@JoinColumn(name="paymentId")
	private int paymentId;
	@OneToMany
	@JoinColumn(name="steamKey")
	private Set<String> keys;
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String invoiceNumber;

}
