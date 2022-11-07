package br.com.etechoracio.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TBL_POST")
public class Post {
	@Id
	@Column(name = "ID_POST")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "TX_TITULO")
	private String titulo;
	@Column(name = "TX_CONTEUDO")
	private String conteudo;
	@Column(name = "DT_CRIACAO")
	private LocalDateTime dataCriacao;
}
