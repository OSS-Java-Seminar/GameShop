package database.entities;

import java.util.UUID;

import javax.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="KeyStorage")
public class KeyStorage {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="keyId")
	private UUID id;
	private String SteamKey;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(
			name="game_id",
			referencedColumnName="gameId"					
			)
	private Game game;
}