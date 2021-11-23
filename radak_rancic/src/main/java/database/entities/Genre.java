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
	private int id;
	@Column(name="genreName")
	private String genreName;
	
	public Genre(String genreName) {
		this.genreName = genreName;
	}
	
}
