package com.gpch.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.Date;

import com.gpch.login.model.User;
import com.gpch.login.model.Game;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "score")
public class Score {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "score_id")
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	private Game game;

	@ManyToOne(cascade = CascadeType.ALL)
	private User user;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "scored_at", nullable = false, updatable = false)
	@CreatedDate
	private Date scoredAt;

	@Column(name = "value")
	private double value;
}