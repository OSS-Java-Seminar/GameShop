package database.entities;

import java.util.*;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="Game_User")
public class GameUser {
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="gameId")
	private Long gameId;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userId")
	private Long userId;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="Game_User")
	private int paymentId;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="Game_User")
	private Set<String> keys;
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String invoiceNumber;
}
