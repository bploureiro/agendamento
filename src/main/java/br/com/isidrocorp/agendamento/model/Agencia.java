package br.com.isidrocorp.agendamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itmn032_agencia")
public class Agencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome_agencia", length=100)
	private String nome;
	
	@Column(name="hora_inicio")
	private int horaInicio;
	
	@Column(name="hora_fim")
	private int horaFim;
	
}


