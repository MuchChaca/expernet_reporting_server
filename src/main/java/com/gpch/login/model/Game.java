package com.gpch.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "game")
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "game_id")
	private int id;

	@Column(name = "name")
	@NotEmpty(message = "*Please provide the game name")
	private String name;

	// public int getId() {
	// return this.id;
	// }

	// public void setId(int id) {
	// this.id = id;
	// }

	// public String getName() {
	// return this.name;
	// }

	// public void setName(String name) {
	// this.name = name;
	// }

}