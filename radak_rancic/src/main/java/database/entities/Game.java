package database.entities;

import javax.persistence.*;
import lombok.*;
import java.util.*;


@Entity
@Data
@Table(name="Game")
public class Game {
	//Proba 2
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="gameId")
	private int id;
	@Column(name="name")
	private String name;
	@ManyToMany(targetEntity=Genre.class,cascade= {CascadeType.ALL})
	@JoinTable(name="game_genre",
			joinColumns = { @JoinColumn(name = "gameId") },   
            inverseJoinColumns = { @JoinColumn(name = "genreId")}  
	)
	@Column(name="genre")
	private Set<Genre> genres;
	@Column(name="price")
	private double price;
	@Column(name="description")
	private String description;
	public Game(String name,Set<Genre>genres,double price,String description) {
		this.name=name;
		this.genres=genres;
		this.price=price;
		this.description=description;
	}
}
