package database.entities;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.util.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="role")
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Type(type = "uuid-char")
	@Column(name="roleId")
	private UUID id;
	
	@Column(name="roleName")
	private String roleName;
}
