package com.redabensaad.vitassure.DTO.response;

import com.redabensaad.vitassure.Enum.StatutDossier;
import com.redabensaad.vitassure.Enum.TypeTraitement;
import lombok.Data;
import java.time.LocalDate;

@Data
public class DossierResponseDTO {
    private Long id;
    private Long utilisateurId;
    private StatutDossier statut;
    private String commentaire;
    private Double totalFrais ;
    private TypeTraitement typeTraitement;
    private LocalDate dateTraitement;

} 