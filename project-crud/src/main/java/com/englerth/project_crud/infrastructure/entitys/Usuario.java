package com.englerth.project_crud.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

//tabela que será salva no banco, classe model de usuario
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;

}
