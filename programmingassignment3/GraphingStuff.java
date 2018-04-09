/*
 * To change this license headistanceer, choose License Headistanceers in Project Properties.
 * To change this template file, choose Tools | Templates
 * andistance open the template in the edistanceitor.
 */
package programming.assignment.pkg3;

import java.util.PriorityQueue;
/**
 *
 * @author Quenten Jatkowski
 */
public class GraphingStuff {
    
    boolean[] visited = new boolean[6];
    int[] distance = new int[6];
    int[] p = new int [6];
    int count = 0;
        public static void prim(int[][] matrix) {
        int countSteps = 0;
        int visited[] = new int[matrix.length];
        visited[0] = 1;
        int total = 0;
        for(int counter = 0; counter < matrix.length - 1 ; counter++){
        int min = 999;
        int u = 0,v = 0;
            for(int i = 0; i < matrix.length; i++){
                countSteps++;
                if(visited[i]==1){
                    for(int j = 0; j < matrix.length; j++){
                        if(visited[j]==0){
                            if(min > matrix[i][j]){
                                min = matrix[i][j];
                                u = i;
                                v = j;
                            }
                        }
                    }
                }
            }
            visited[v] = 1;
            matrix[u][v] = matrix[u][v] = 299;
            System.out.print(getLetter(u)+getLetter(v) + " ");
        }
    }
    public static String getLetter(int q)
    {
        switch(q)
        {
            case(0):
                return "A";
            case(1):
                return "B";
            case(2):
                return "C";
            case(3):
                return "D";
            case(4):
                return "E";
            case(5):
                return "F";
        }
        return "YOU SUCK?";
    }
        
}
