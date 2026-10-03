package com.redabensaad.vitassure.Mapper;

import com.redabensaad.vitassure.Entity.Utilisateur;
import com.redabensaad.vitassure.DTO.request.UtilisateurRequestDTO;
import com.redabensaad.vitassure.DTO.response.UtilisateurResponseDTO;
import com.redabensaad.vitassure.DTO.request.UtilisateurUpdateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper {

    @Mapping(target = "id", ignore = true)
    Utilisateur toEntity(UtilisateurRequestDTO requestDTO);

    UtilisateurResponseDTO toDto(Utilisateur utilisateur);

    @Mapping(target = "id", ignore = true)
    void updateEntity(UtilisateurRequestDTO requestDTO, @MappingTarget Utilisateur utilisateur);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "role", ignore = true)
    @Mapping(target = "valider", ignore = true)
    Utilisateur toEntity(UtilisateurUpdateDTO updateDTO);

    @Mapping(target = "id", ignore = true)
    void updateUtilisateur(UtilisateurUpdateDTO updateDTO, @MappingTarget Utilisateur utilisateur);
} 