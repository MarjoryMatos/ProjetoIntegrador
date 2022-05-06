package com.example.generation.educa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_postagem")
public class Postagem {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public long id;
		
		@NotNull
		public String titulo;
		
		@NotNull
		public String descricao;
		
		
		public String foto;
		
		@Temporal(TemporalType.TIMESTAMP)
		public Date data = new java.sql.Date(System.currentTimeMillis());
		
		@ManyToOne
		@JsonIgnoreProperties("postagem")
		private Tema tema;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTítulo() {
			return titulo;
		}

		public void setTítulo(String título) {
			this.titulo = título;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public Tema getTema() {
			return tema;
		}

		public void setTema(Tema tema) {
			this.tema = tema;
		}
		
		
		
		
		

}
