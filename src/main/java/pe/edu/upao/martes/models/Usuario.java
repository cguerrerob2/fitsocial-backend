package pe.edu.upao.martes.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name = "usuario_seq", sequenceName = "usuario_seq", allocationSize = 1)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    private Long id;

    private String email;

    private String password;

    private String country;

    private Double height;

    private Double weight;
}
