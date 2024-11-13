package br.com.guiicnunes.dslist.services;

import br.com.guiicnunes.dslist.dto.GameListDTO;
import br.com.guiicnunes.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
       var result = gameListRepository.findAll();
       return result.stream().map(GameListDTO::new).toList();
    }
}
