package tn.esprit.springboot.Entities;

import jakarta.persistence.*;

import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idChambre;
    Long numeroChambre ;
    @Enumerated(EnumType.STRING)
    TypeChambre  typeC  ;
    @OneToMany
    Set<Reservation>  reservations ;

}
