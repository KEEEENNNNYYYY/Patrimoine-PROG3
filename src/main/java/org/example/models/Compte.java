package org.example.models;

import java.time.LocalDate;

public final class Compte extends Possession {
    private final Set <TrainDeVie> trainDeVies;
    private final LocalDate dateDeCreation ;

    public Compte(String nomDeLaPossession, LocalDate aDateDe, Argent valeur  , LocalDate dateDeCreation) {
        super(nomDeLaPossession, aDateDe, valeur);
        this.traindeDeVies = new HashSet<>();
        this.dateDeCreation = dateDeCreation;
    }

    @Override
    public Possession projectionFuture(LocalDate dateFuture) {
       if(dateDeCreation.isAfter(dateFuture)){
        return new Compte(
            nom,
            dateFuture,
            ariary(0.0),
            dateDeCreation);
       }
        Argent sommeTrainDeVie = trainDeVie.stream().map(traindeDeVie -> traindeDeVie.projectionFuture(dateFuture)).valeur.reduce(Argent::additionner).orElse(ariary(0))
        
        return  new Compte(
            nom,
            dateFuture,
            valeur.soustraire(sommeTrainDeVie),
            dateDeCreation
        )

    }
    public void financer(traindeDeVie trainDeVie){
        this.traindeDeVie.add(traindeDeVie);
        return this;
    }
}
