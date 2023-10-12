package tn.esprit.springboot.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Universite {
    @Id
    private Long idUniversite;

    private String nomUniversite ;

    private  String adresse ;

}
