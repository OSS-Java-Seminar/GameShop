package database.entities;

import javax.persistence.*;
import java.util.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Genre")
public class Genre {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="genreId")
	private UUID id;
	@Column(name="genreName")
	private String genreName;
	
	public Genre(String genreName) {
		this.genreName = genreName;
	}
	
}
