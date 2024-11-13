package br.com.guiicnunes.dslist.controllers;

import br.com.guiicnunes.dslist.dto.GameDTO;
import br.com.guiicnunes.dslist.dto.GameMinDTO;
import br.com.guiicnunes.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "{id}")
    public GameDTO findById(@PathVariable Long id) {
        var result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        var result = gameService.findAll();
        return result;
    }
}
