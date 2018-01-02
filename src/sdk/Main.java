package sdk;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vertex katowice = new Vertex( "Katowice");
        Vertex wroclaw = new Vertex( "Wrocław");
        Vertex lodz = new Vertex( "Łódź");
        Vertex warszawa = new Vertex( "Warszawa");
        Vertex poznan = new Vertex( "Poznań");
        Vertex krakow = new Vertex( "Kraków");
        Vertex gdynia = new Vertex( "Gdynia");
        Vertex newYork = new Vertex( "New York");
        Vertex boston = new Vertex( "Boston");

        wroclaw.link(lodz,216.8f);
        wroclaw.link(poznan,184.4f);
        wroclaw.link(katowice,194.5f);
        krakow.link(katowice,80.36f);
        krakow.link(warszawa,294.8f);
        krakow.link(lodz,266.8f);
        lodz.link(warszawa,139.1f);
        poznan.link(lodz,217.8f);

        List<Vertex> citiesList = Arrays.asList(wroclaw, katowice, lodz, warszawa, poznan,
                krakow, gdynia, newYork, boston);
        Graph cities = new Graph(citiesList);

        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
        System.out.println(dijkstra.calculateDistance(cities, wroclaw, lodz));
    }
}