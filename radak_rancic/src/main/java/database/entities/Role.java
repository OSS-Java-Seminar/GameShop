package database.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="Role")
public class Role {
	@Column(name="roleId")
	private int roleId;
	private String roleName;
}
