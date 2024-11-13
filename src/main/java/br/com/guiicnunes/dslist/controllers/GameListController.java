package br.com.guiicnunes.dslist.controllers;

import br.com.guiicnunes.dslist.dto.GameListDTO;
import br.com.guiicnunes.dslist.dto.GameMinDTO;
import br.com.guiicnunes.dslist.services.GameListService;
import br.com.guiicnunes.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        var result = gameListService.findAll();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        var result = gameService.findByList(listId);
        return result;
    }
}
