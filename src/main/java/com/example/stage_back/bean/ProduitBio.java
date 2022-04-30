package com.example.stage_back.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class ProduitBio {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nom;
        private String type;
        @Lob
        private String labele;
        private Integer QuantiteDisponible;


    }