package com.redabensaad.vitassure.DTO.response;

import com.redabensaad.vitassure.Enum.LienParente;
import lombok.Data;

@Data
public class MembreFamilleResponseDTO {
    private Long id;
    private String nom;
    private String prenom;
    private LienParente lienParente;
    private Long assureId;
}
