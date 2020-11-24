package br.com.isidrocorp.agendamento.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                                                // esta anotação diz que a classe uruário é uma classe armazenável em banco
@Table(name="tbl_usuario")                             // a anotação @table permite definir o nome da tabela que existe no banco
public class Usuario {
	
	@Id                                               // @Id indica que o atributo corresponde a uma PK na tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY) // indica que o campo da tabela é AUTO_INCREMENT
	@Column(name="id_user")                           // defino o nome da coluna na tabela
	private int id;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	@Column(name="email", length = 100)
	private String email;
	
	@Column(name="racf", length = 7)
	private String racf;
	
	@Column(name="senha", length = 50)
	private String senha;
	
	@Column(name="link_foto", length = 255)
	private String linkFoto;

}
