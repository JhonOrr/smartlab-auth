package com.smartlab.auth.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;
    private String dni;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;

    //cliente

    private String Rol;
    private String estado;
    private String password;
    private String email;
    private String usuaarioCreate;
    private Timestamp dateCreate;
    private String usuarioUpdate;
    private Timestamp dateUpdate;
    private String usuarioDelete;
    private Timestamp dateDelete;
}
