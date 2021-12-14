package database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="KeyStorage")
public class KeyStorage {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="keyId")
	private Long keyId;
	private String SteamKey;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(
			name="game_id",
			referencedColumnName="gameId"					
			)
	private Game g;
}