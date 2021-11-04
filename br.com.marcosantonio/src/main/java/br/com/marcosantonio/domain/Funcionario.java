package br.com.marcosantonio.domain;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true)
	private String nome;
	
	@Column(nullable = false, columnDefinition =   "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;
	
	@Column(name = "data_entrada", nullable = false, columnDefinition =  "DATE")
	private LocalDate dataEntrada;

	@Column(name = "data_saída", nullable = false, columnDefinition =  "DATE")
	private LocalDate datasaída;
	
	@OneToOne
	@JoinColumn(name = "endereço_id_fk")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name = "cargo")
}
