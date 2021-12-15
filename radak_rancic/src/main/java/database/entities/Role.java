package database.entities;

import javax.persistence.*;
import java.util.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Role")
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roleId")
	private UUID id;
	@Column(name="roleName")
	private String roleName;
	
	public Role(String roleName) {
		this.roleName = roleName;
	}
	
	
}
