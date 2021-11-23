package database.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="Key")
public class Key {
	@Id
	@Column(name="keyId")
	private int id;
	@Id
	@Column(name="steamKey")
	private String steamKey;
	
	
}
