package database.entities;

import javax.persistence.*;

import lombok.Data;
@Entity
@Data
@Table(name="Genre")
public class Genre {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="genreId")
	private int GenreID;
	@Column(name="genreName")
	private String GenreName;
}
