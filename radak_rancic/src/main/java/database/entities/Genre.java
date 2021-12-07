package database.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="Genre")
public class Genre {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="genreId")
	private Long id;
	@Column(name="genreName")
	private String genreName;
	
}
