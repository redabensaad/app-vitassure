package com.redabensaad.vitassure.Mapper;

import com.redabensaad.vitassure.Entity.MembreFamille;
import com.redabensaad.vitassure.DTO.request.MembreFamilleRequestDTO;
import com.redabensaad.vitassure.DTO.response.MembreFamilleResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface MembreFamilleMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "utilisateur.id", source = "userId")
    MembreFamille toEntity(MembreFamilleRequestDTO requestDTO);

    @Mapping(source = "utilisateur.id", target = "assureId")
    MembreFamilleResponseDTO toDto(MembreFamille membreFamille);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "utilisateur.id", source = "userId")
    void updateEntity(MembreFamilleRequestDTO requestDTO, @MappingTarget MembreFamille entity);
}
