package com.redabensaad.vitassure.DTO.request;

import com.redabensaad.vitassure.Enum.StatutDossier;
import com.redabensaad.vitassure.Enum.TypeTraitement;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DossierRequestDTO {
    @NotNull(message = "L'ID de l'utilisateur est obligatoire")
    private Long utilisateurId;

    private TypeTraitement typeTraitement = TypeTraitement.HOSPITALISATION;


    private String commentaire;

    private StatutDossier statut = StatutDossier.EN_ATTENTE;

    private Double totalFrais ;
} 