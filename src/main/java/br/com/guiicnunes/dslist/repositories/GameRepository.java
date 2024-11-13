package br.com.guiicnunes.dslist.repositories;

import br.com.guiicnunes.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
