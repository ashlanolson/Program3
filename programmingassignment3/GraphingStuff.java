/*
Authors:Quenten Franc Jatkowski, Ashlan Elizabeth Olson.
Date:04/10/2018
Overview:Runs the 3 methods for minimun spanning tree reads in Input file from src named Input.txt
Sources: 
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
    int[] path = new int [6];
    int x = 0;
    public static void prim(int[][] ADJmatrix)
    {
        int distances[][] = new int[6][6];
        for (int w = 0; w < 6; w++)
        {
            for (int y = 0; y < 6; y++)
            {
                distances[w][y] = ADJmatrix[w][y];
            }
        }
        int countSteps = 0;
        int visited[] = new int[distances.length];
        visited[0] = 1;
        int x = 0;
        for(int counter = 0; counter < distances.length - 1 ; counter++)
        {
            int min = 999;
            int temp1 = 0;
            int temp2 = 0;
            for(int a = 0; a < distances.length; a++){
                countSteps++;
                if(visited[a]==1){
                    for(int q = 0; q < distances.length; q++){
                        if(visited[q]==0){
                            if(min > distances[a][q]){
                                min = distances[a][q];
                                temp2 = a;
                                temp1 = q;
                            }
                        }
                    }
                }
            }
            visited[temp1] = 1;
            distances[temp2][temp1] = distances[temp2][temp1] = 999;
            System.out.print(getLetter(temp2)+getLetter(temp1) + " ");
        }
    }
    public void floydWarshall(int[][] a)
    {
        int distances[][] = new int[6][6];
        System.out.println();
        for (int w = 0; w < 6; w++)
        {
            for (int y = 0; y < 6; y++)
            {
                distances[w][y] = a[w][y];
            }
        }
        for (int l = 0; l < 6; l++)
        {
            for (int i = 0; i < 6; i++)
            {
                for (int o = 0; o < 6; o++)
                {
                    if (distances[i][l] != 999 && distances[l][o]!= 999 & (distances[i][l]) + (distances[l][o]) < distances[i][o])
                    {
                        distances[i][o] = distances[i][l] + distances[l][o];
                        System.out.println(" A  B  C  D  E  F");
                        for (int r=0; r<6; ++r)
                        {
                            
                            System.out.print(getLetter(r) + " ");
                            for (int m=0; m<6; ++m)
                            {
                                if (distances[r][m]==999)
                                    System.out.print("INF ");
                                else if(r==m)
                                {
                                    System.out.print(0 + "  ");
                                }
                                else
                                    System.out.print(distances[r][m]+" ");
                            }
                        System.out.println();
                        }
                        System.out.println("------------------------");
                    }
                }
            }
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
