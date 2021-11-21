package database.entities;

import java.util.*;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name="GameUser")
public class GameUser {
	@ManyToOne
	@JoinColumn(name="gameId")
	private int gameId;
	@ManyToOne
	@JoinColumn(name="userId")
	private int userId;
	@OneToMany
	@JoinColumn(name="paymentId")
	private int paymentID;
	@OneToMany
	@JoinColumn(name="steamKey")
	private Set<String> keys;
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String invoice_number;

}
