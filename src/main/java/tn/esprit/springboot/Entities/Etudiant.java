package tn.esprit.springboot.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Etudiant {
    @Id
    private Long id;

  private String  nomEt ;
  private String prenomEt ;
  private Long cin ;
  private  String ecole ;

  @Temporal(TemporalType.DATE)
  private Date dateNaissance ;

    @ManyToMany
    Set<Reservation> reservations ;



}
