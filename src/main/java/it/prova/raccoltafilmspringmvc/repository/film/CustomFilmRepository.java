package it.prova.raccoltafilmspringmvc.repository.film;

import java.util.List;

import it.prova.raccoltafilmspringmvc.model.Film;

public interface CustomFilmRepository {
	List<Film> findByExample(Film example);
}
