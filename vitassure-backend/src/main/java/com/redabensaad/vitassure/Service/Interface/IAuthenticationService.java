package com.redabensaad.vitassure.Service.Interface;

import com.redabensaad.vitassure.DTO.request.LoginRequestDTO;
import com.redabensaad.vitassure.DTO.request.RegisterRequestDTO;
import com.redabensaad.vitassure.DTO.response.AuthResponseDTO;

public interface IAuthenticationService {
    AuthResponseDTO register(RegisterRequestDTO request);
    AuthResponseDTO login(LoginRequestDTO request);
    void validateUser(Long userId);
} 