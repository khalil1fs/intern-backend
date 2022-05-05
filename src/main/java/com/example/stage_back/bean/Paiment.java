package com.example.stage_back.bean;


import com.example.stage_back.enums.TypePaiment;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paiment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double prix;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date datePaiement;

    @Enumerated(EnumType.STRING)
    private TypePaiment typePaiment;

    @OneToOne
    private CommandeItem commandeItem;

    @ManyToOne
    private Client client;



}
