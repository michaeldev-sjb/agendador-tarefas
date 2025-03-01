package com.michaeldevsjb.agendadortarefas.business.mapper;

import com.michaeldevsjb.agendadortarefas.business.dto.TarefasDTO;
import com.michaeldevsjb.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
