package database.entities;

import javax.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="Game")
public class Game {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="gameId",nullable=false)
	private Long id;
	@Column(name="gameName")
	private String name;
	@ManyToMany(
			fetch = FetchType.EAGER
			)
	@JoinTable(
			name="Game_Genre",
			joinColumns=@JoinColumn(
					name="game_Id",
					referencedColumnName = "gameId"
					),
			inverseJoinColumns = @JoinColumn(
					name="genre_Id",
					referencedColumnName = "genreId"
					)
			)
	private Set<Genre> genres;
	@Column(name="price",nullable=false)
	private double price;
	@Column(name="description")
	private String description;
}
