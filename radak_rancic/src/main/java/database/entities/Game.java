package database.entities;

import javax.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@Table(name="Game")
public class Game {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="gameId",nullable=false)
	private Long id;
	@Column(name="gameName")
	private String name;
	/* stara verzija
	@ManyToMany(targetEntity=Genre.class,cascade= {CascadeType.ALL})
	@JoinTable(name="game_genre",
			joinColumns = { @JoinColumn(name = "gameId") },
            inverseJoinColumns = { @JoinColumn(name = "genreId")}  
	)
	*/
//	@ManyToMany(mappedBy="GameGenre",fetch=FetchType.EAGER)
//	@Column(name="genre",nullable=false)
//	private Set<Genre> genres;
	@Column(name="price",nullable=false)
	private double price;
	@Column(name="description")
	private String description;
	
	public Game(String name,double price,String description) {
		this.name=name;
		//this.genres=genres;
		this.price=price;
		this.description=description;
	}

}
