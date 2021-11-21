package database.entities;

import javax.persistence.*;

import lombok.Data;

//treba vidit kako dodat slozeni primarni kljuc
@Entity
@Data
@Table(name="Key")
public class Key {
	
	private int id;
	@Column(name="steamKey")
	private String steamKey;
}
