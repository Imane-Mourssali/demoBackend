package org.sid.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Document
@Data
@AllArgsConstructor
public abstract class Compte implements Serializable {
    @Id
    private String idCompte;
    private String codeCompte;
    private Date dateCreation;
    private double solde;
    private Client client;
    @DBRef
    private Collection<Operation> operations;

    public Compte() {
    }

    public Compte(String idCompte,String codeCompte, Date dateCreation, double solde, Client client) {
        this.idCompte = idCompte;
        this.codeCompte = codeCompte;
        this.dateCreation = dateCreation;
        this.solde = solde;
        this.client = client;
    }
}
