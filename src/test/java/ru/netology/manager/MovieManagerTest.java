package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

  @Test
  public void showLessThanTenMovies() {
    MovieManager movieManager = new MovieManager(5);
    MovieItem one = new MovieItem(1, 1, "one", "action");
    MovieItem two = new MovieItem(2, 2, "two", "cartoon");
    MovieItem three = new MovieItem(3, 3, "three", "comedy");
    MovieItem four = new MovieItem(4, 4, "four", "action");
    MovieItem five = new MovieItem(5, 5, "five", "horror");
    movieManager.add(one);
    movieManager.add(two);
    movieManager.add(three);
    movieManager.add(four);
    movieManager.add(five);
    MovieItem[] actual = movieManager.showLastMovies();
    MovieItem[] expected = new MovieItem[]{five, four, three, two, one};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void showLastTenMovies() {
    MovieManager movieManager = new MovieManager();
    MovieItem one = new MovieItem(1, 1, "one", "action");
    MovieItem two = new MovieItem(2, 2, "two", "cartoon");
    MovieItem three = new MovieItem(3, 3, "three", "comedy");
    MovieItem four = new MovieItem(4, 4, "four", "action");
    MovieItem five = new MovieItem(5, 5, "five", "horror");
    MovieItem six = new MovieItem(6, 6, "six", "cartoon");
    MovieItem seven = new MovieItem(7, 7, "seven", "comedy");
    MovieItem eight = new MovieItem(8, 8, "eight", "action");
    MovieItem nine = new MovieItem(9, 9, "nine", "cartoon");
    MovieItem ten = new MovieItem(10, 10, "ten", "comedy");
    movieManager.add(one);
    movieManager.add(two);
    movieManager.add(three);
    movieManager.add(four);
    movieManager.add(five);
    movieManager.add(six);
    movieManager.add(seven);
    movieManager.add(eight);
    movieManager.add(nine);
    movieManager.add(ten);
    MovieItem[] actual = movieManager.showLastMovies();
    MovieItem[] expected = new MovieItem[]{ten, nine, eight, seven, six, five, four, three, two, one};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void showMoreThanTenMovies() {
    MovieManager movieManager = new MovieManager();
    MovieItem one = new MovieItem(1, 1, "one", "action");
    MovieItem two = new MovieItem(2, 2, "two", "cartoon");
    MovieItem three = new MovieItem(3, 3, "three", "comedy");
    MovieItem four = new MovieItem(4, 4, "four", "action");
    MovieItem five = new MovieItem(5, 5, "five", "horror");
    MovieItem six = new MovieItem(6, 6, "six", "cartoon");
    MovieItem seven = new MovieItem(7, 7, "seven", "comedy");
    MovieItem eight = new MovieItem(8, 8, "eight", "action");
    MovieItem nine = new MovieItem(9, 9, "nine", "cartoon");
    MovieItem ten = new MovieItem(10, 10, "ten", "comedy");
    MovieItem eleven = new MovieItem(11, 11, "eleven", "action");
    MovieItem twelve = new MovieItem(12, 12, "twelve", "horror");
    movieManager.add(one);
    movieManager.add(two);
    movieManager.add(three);
    movieManager.add(four);
    movieManager.add(five);
    movieManager.add(six);
    movieManager.add(seven);
    movieManager.add(eight);
    movieManager.add(nine);
    movieManager.add(ten);
    movieManager.add(eleven);
    movieManager.add(twelve);
    MovieItem[] actual = movieManager.showLastMovies();
    MovieItem[] expected = new MovieItem[] {twelve, eleven, ten, nine, eight, seven, six, five, four, three};
    assertArrayEquals(expected, actual);
  }
}