package database.entities;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import lombok.*;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="game")
public class Game {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Type(type = "uuid-char")
	@Column(name="gameId")
	private UUID id;
	
	@Column(name="gameName")
	private String name;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Genre> genres;
	
	@Column(name="price")
	private double price;
	
	@Column(name="description")
	private String description;
}