package br.com.ada.programacaowebIsb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_veiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //toda tabela precisa de um identificador no JPA

    @Column(unique = true)
    private String placa;

    private String marca;

    private String modelo;

    private String tipo;

    private Boolean disponivel;


}
