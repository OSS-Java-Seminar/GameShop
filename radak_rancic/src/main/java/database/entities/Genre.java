package database.entities;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.util.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="genre")
public class Genre {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Type(type = "uuid-char")
	@Column(name="genreId")
	private UUID id;
	
	@Column(name="genreName")
	private String genreName;
	
	
}
