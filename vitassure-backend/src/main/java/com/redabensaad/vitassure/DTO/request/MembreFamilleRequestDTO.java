package com.redabensaad.vitassure.DTO.request;


import com.redabensaad.vitassure.Enum.LienParente;
import lombok.Data;

@Data
public class MembreFamilleRequestDTO {
    private String nom;
    private String prenom;
    private LienParente lienParente;
    private Long userId;
}
