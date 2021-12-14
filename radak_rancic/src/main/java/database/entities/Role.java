package database.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Role")
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roleId")
	private Long id;
	@Column(name="roleName")
	private String roleName;
	
	public Role(String roleName) {
		this.roleName = roleName;
	}
}
