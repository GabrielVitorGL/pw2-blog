package br.com.etechoracio.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TBL_COMENTARIO")
public class Comentario {
	@Id
	@Column(name = "ID_COMENTARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "TX_CONTEUDO")
	private String conteudo;
	@Column(name = "TX_AUTOR")
	private String autor;
	@Column(name = "DT_CRIACAO")
	private LocalDateTime dataCriacao;
	@ManyToOne
	private Post post;
}
