package org.sid.entities;

import lombok.*;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.Date;

@Document
@Data
@NoArgsConstructor
@Builder
public class CompteCourant extends Compte{
    private double decouvert;

    public CompteCourant(String idCompte,String codeCompte, Date dateCreation, double solde, Client client, Collection<Operation> operations, double decouvert) {
        super(idCompte,codeCompte, dateCreation, solde, client, operations);
        this.decouvert = decouvert;
    }

    public CompteCourant(double decouvert) {
        this.decouvert = decouvert;
    }

    public CompteCourant(String idCompte,String codeCompte, Date dateCreation, double solde, Client client, double decouvert) {
        super(idCompte,codeCompte, dateCreation, solde, client);
        this.decouvert = decouvert;
    }
}
