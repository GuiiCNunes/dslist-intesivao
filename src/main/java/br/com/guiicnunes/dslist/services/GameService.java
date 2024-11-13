package br.com.guiicnunes.dslist.services;

import br.com.guiicnunes.dslist.dto.GameDTO;
import br.com.guiicnunes.dslist.dto.GameMinDTO;
import br.com.guiicnunes.dslist.entities.Game;
import br.com.guiicnunes.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
       var result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
       return dto;
    }
}
