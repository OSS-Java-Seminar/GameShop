package database.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="Role")
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roleId")
	private int id;
	@Column(name="roleName")
	private String roleName;
	
	public Role(String roleName) {
		this.roleName = roleName;
	}
	
	
}
