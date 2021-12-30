package database.entities;

import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="picture")
public class Picture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type = "uuid-char")
	private UUID pictureId;
	
	@ManyToOne
	private Game game;
	
	private String png;
}