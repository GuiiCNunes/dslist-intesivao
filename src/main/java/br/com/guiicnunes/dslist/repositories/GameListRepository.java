package br.com.guiicnunes.dslist.repositories;

import br.com.guiicnunes.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
