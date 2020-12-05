package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

  @Test
  public void showLessThanTenItems1() {
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
    MovieItem[] actual = movieManager.showLastItems();
    MovieItem[] expected = new MovieItem[]{five, four, three, two, one};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void showLessThanTenItems2() {
    MovieManager movieManager = new MovieManager(1);
    MovieItem one = new MovieItem(1, 1, "one", "action");
    movieManager.add(one);
    MovieItem[] actual = movieManager.showLastItems();
    MovieItem[] expected = new MovieItem[]{one};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void showLessThanTenItems3() {
    MovieManager movieManager = new MovieManager(9);
    MovieItem one = new MovieItem(1, 1, "one", "action");
    MovieItem two = new MovieItem(2, 2, "two", "cartoon");
    MovieItem three = new MovieItem(3, 3, "three", "comedy");
    MovieItem four = new MovieItem(4, 4, "four", "action");
    MovieItem five = new MovieItem(5, 5, "five", "horror");
    MovieItem six = new MovieItem(6, 6, "six", "cartoon");
    MovieItem seven = new MovieItem(7, 7, "seven", "comedy");
    MovieItem eight = new MovieItem(8, 8, "eight", "action");
    MovieItem nine = new MovieItem(9, 9, "nine", "cartoon");
    movieManager.add(one);
    movieManager.add(two);
    movieManager.add(three);
    movieManager.add(four);
    movieManager.add(five);
    movieManager.add(six);
    movieManager.add(seven);
    movieManager.add(eight);
    movieManager.add(nine);
    MovieItem[] actual = movieManager.showLastItems();
    MovieItem[] expected = new MovieItem[]{nine, eight, seven, six, five, four, three, two, one};
    assertArrayEquals(expected, actual);
  }




  @Test
  public void showLastTenItems() {
    MovieManager movieManager = new MovieManager(10);
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
    MovieItem[] actual = movieManager.showLastItems();
    MovieItem[] expected = new MovieItem[]{ten, nine, eight, seven, six, five, four, three, two, one};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void showMoreThanTenItems() {
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
    MovieItem[] actual = movieManager.showLastItems();
    MovieItem[] expected = new MovieItem[] {eleven, ten, nine, eight, seven, six, five, four, three, two};
    assertArrayEquals(expected, actual);
  }
}