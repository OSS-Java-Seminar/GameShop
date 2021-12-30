package database.entities;

import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="keyStorage")
public class KeyStorage {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Type(type = "uuid-char")
	@Column(name="keyId")
	private UUID id;
	
	@Column(name= "steamKey")
	private String key;
	
	@ManyToOne
	private Game game;
}