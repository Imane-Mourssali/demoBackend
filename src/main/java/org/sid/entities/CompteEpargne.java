package org.sid.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@NoArgsConstructor
public class CompteEpargne extends Compte {
    private double taux;


    public CompteEpargne(String idCompte, String codeCompte, Date dateCreation, double solde, Client client, double taux) {
        super(idCompte,codeCompte, dateCreation, solde, client);
        this.taux = taux;
    }
}
