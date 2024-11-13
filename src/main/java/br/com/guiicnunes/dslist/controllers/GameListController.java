package br.com.guiicnunes.dslist.controllers;

import br.com.guiicnunes.dslist.dto.GameListDTO;
import br.com.guiicnunes.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        var result = gameListService.findAll();
        return result;
    }
}
