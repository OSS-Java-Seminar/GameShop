package com.Radak_Rancic.entitites;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Games")
public class Game {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int GameID;
	String Name;
	int GenreID;
	double Price;
	String Description;
}
