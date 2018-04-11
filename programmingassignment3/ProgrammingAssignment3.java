/*
Authors:Quenten Franc Jatkowski, Ashlan Elizabeth Olson.
Date:04/10/2018
Overview:Runs the 3 methods for minimun spanning tree reads in Input file from src named Input.txt
Sources: 
*/
package programming.assignment.pkg3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Quenten Jatkowski and Ashlan Olson
 */
public class ProgrammingAssignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                //char[][] inputArray = new char[7][6];
                final Path IN_PATH = FileSystems.getDefault().getPath("src/Input/Input.txt");
		Charset charset = Charset.forName("US-ASCII");
                String line = null;
                int i =0;
                int p =0;
                GraphingStuff waffles = new GraphingStuff();
                int[][] inputArray = new int[0][0];
                int[] intToInsert = new int[6]; 
                inputArray = new int[6][6];
                try (BufferedReader reader = Files.newBufferedReader(IN_PATH, charset)) 
                {
                    while ((line = reader.readLine()) != null)
                    {
                        if(p==0)
                        {
                            System.out.println(line);
                            line = reader.readLine();
                        }
                        System.out.println(line);
                        p++;
                        String[] pathArray = line.split(",");
                        for(int s =0; s<6;s++)
                        {
                            intToInsert[s] = Integer.parseInt(pathArray[s]);
                        }
                        for(int q = 0; q<6; q++)
                        {
                           inputArray[i][q]= Integer.parseInt(pathArray[q]);  
                        }
                        i++;
                    }

                    waffles.prim(inputArray);
                    System.out.println();
                    for(int w = 0; w<6; w++)
                    {
                        for(int t = 0;t<6; t++)
                        {
                            System.out.print(inputArray[w][t]+",");
                        }
                        System.out.println();
                    }
                    waffles.floydWarshall(inputArray);
                }
               catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}
             
    }   
    
}
