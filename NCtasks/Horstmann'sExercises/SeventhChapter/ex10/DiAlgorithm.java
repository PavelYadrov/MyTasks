package com.exercises.ex10;

import java.util.*;

public class DiAlgorithm {
    private int vertices;
    private int[] shortestRoads;
    private PriorityQueue<Neighbor> neighbors;
    private List<Integer> setted;
    private List<List<Neighbor>> map;

    public DiAlgorithm(int vertices) {
        this.vertices = vertices;
        shortestRoads = new int[vertices];
        setted = new ArrayList<Integer>();
        neighbors = new PriorityQueue<Neighbor>(vertices, (i, j) -> j.dist - i.dist);
    }

    public static class Neighbor {
        public int name;
        public int dist;

        public Neighbor() {
        }

        public Neighbor(int number, int dist) {
            this.name = number;
            this.dist = dist;
        }
    }

    public void algorithm(List<List<Neighbor>> map, int startTown) {
        this.map = map;
        for (int i = 0; i < vertices; i++) {
            shortestRoads[i] = Integer.MAX_VALUE;
        }
        neighbors.add(new Neighbor(startTown, 0));
        shortestRoads[startTown] = 0;
        while (setted.size() != vertices) {
            int name = neighbors.remove().name;
            setted.add(name);

            int oldDistance=0;
            int newDistance=0;

            for (int i = 0; i < map.get(name).size(); i++) {
                Neighbor neighbor = map.get(name).get(i);
                if(!setted.contains(neighbor)) {
                    oldDistance = neighbor.dist;
                    newDistance = shortestRoads[name] + oldDistance;
                }
                if (newDistance<shortestRoads[neighbor.name]){
                    shortestRoads[neighbor.name]=newDistance;
                }
                neighbors.add(new Neighbor(neighbor.name, shortestRoads[neighbor.name]));
            }
        }
        System.out.println("Shortest path from town:");
        for (int i = 0; i < this.shortestRoads.length; i++)
            System.out.println(startTown + " to " + i + " is "
                    + this.shortestRoads[i]);
    }
}
