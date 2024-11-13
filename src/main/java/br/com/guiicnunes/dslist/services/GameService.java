package br.com.guiicnunes.dslist.services;

import br.com.guiicnunes.dslist.dto.GameMinDTO;
import br.com.guiicnunes.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
       var result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
       return dto;
    }
}
