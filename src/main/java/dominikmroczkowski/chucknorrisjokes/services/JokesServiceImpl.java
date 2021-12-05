package dominikmroczkowski.chucknorrisjokes.services;

import org.springframework.stereotype.Service;

import dominikmroczkowski.chucknorrisjokes.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService {
	private final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

	public Joke getJoke() {
		Joke joke = new Joke();
		joke.setJoke(quotes.getRandomQuote());
		return joke;
	}
}
