package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
  private MovieItem[] movies = new MovieItem[0];
  private int numberOfMovies = 10;

  public void add(MovieItem movie) {
    // создаём новый массив размером на единицу больше
    int length = movies.length + 1;
    MovieItem[] tmp = new MovieItem[length];
    // itar + tab
    // копируем поэлементно
    // for (int i = 0; i < items.length; i++) {
    //   tmp[i] = items[i];
    // }
    System.arraycopy(movies, 0, tmp, 0, movies.length);
    // кладём последним наш элемент
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = movie;
    movies = tmp;
  }

  public MovieItem[] showLastMovies() {
    MovieItem[] result = new MovieItem[movies.length];
    MovieItem[] numberOfMovies = new MovieItem[this.numberOfMovies];
    for (int i = 0; i < result.length; i++) {
      int index = movies.length - i - 1;
      result[i] = movies[index];
    }
    for (int i = 0; i < this.numberOfMovies; i++) {
      numberOfMovies[i] = result[i];
    }
    return numberOfMovies;
  }

  public MovieManager() {
  }

  public MovieManager(int numberOfMovies) {
    if (numberOfMovies > 10) {
      return;
    }
    this.numberOfMovies = numberOfMovies;
  }
}
