package com.redabensaad.vitassure.Mapper;

import com.redabensaad.vitassure.Entity.PriseEnCharge;
import com.redabensaad.vitassure.DTO.request.PriseEnChargeRequestDTO;
import com.redabensaad.vitassure.DTO.response.PriseEnChargeResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PriseEnChargeMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "utilisateur.id", source = "utilisateurId")
    PriseEnCharge toEntity(PriseEnChargeRequestDTO requestDTO);

    @Mapping(source = "utilisateur.id", target = "utilisateurId")
    PriseEnChargeResponseDTO toDto(PriseEnCharge priseEnCharge);
} 