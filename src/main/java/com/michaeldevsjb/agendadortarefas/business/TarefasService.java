package com.michaeldevsjb.agendadortarefas.business;

import com.michaeldevsjb.agendadortarefas.business.dto.TarefasDTO;
import com.michaeldevsjb.agendadortarefas.business.mapper.TarefasConverter;
import com.michaeldevsjb.agendadortarefas.infrastructure.entity.TarefasEntity;
import com.michaeldevsjb.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import com.michaeldevsjb.agendadortarefas.infrastructure.repository.TarefasRepository;
import com.michaeldevsjb.agendadortarefas.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefaConverter;
    private final JwtUtil jwtUtil;


    public TarefasDTO gravarTarefa(String token, TarefasDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity entity = tarefaConverter.paraTarefaEntity(dto);

        return tarefaConverter.paraTarefaDTO(tarefasRepository.save(entity));
    }

}
