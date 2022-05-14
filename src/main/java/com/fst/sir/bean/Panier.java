package com.fst.sir.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fst.sir.enums.EtatCommande;
import com.fst.sir.security.bean.User;
import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reference;

    private double prixTotal;

    private EtatCommande etatCommande;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateAjout;

    @ManyToOne
    private User user;

    @OneToOne
    private Formation formation;

    @OneToMany(mappedBy = "panier")
    private List<ProduitPanierItem> produitPanierItems;


}