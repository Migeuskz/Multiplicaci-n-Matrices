/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacionmatrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mikey
 */
public class MultiplicacionMatrices {
 public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
 public static String entrada;
 
 public static boolean multiplicables(int rowsA, int renglonesB) {
        if (rowsA == renglonesB) {
            return true;
        }
        return false;
    }
 
 public static int[][] rellenarMatrices(int nRow, int nCol) throws IOException{
     int[][] array = new int[nRow][nCol];
     
     for(int i = 0; i<array.length; i++){
         for(int j =0; j<array[0].length;j++){
             System.out.println("Escribe un valor [" + i + " ] [ " + j + "]: ");
             entrada = bufer.readLine();
             array[i][j] = Integer.parseInt(entrada);
         }
         
     }
     return array;
 }
 
 
 
 public static int[][] multiplicacionMatrices ( int[][] matrizA, int[][] matrizB) {
      int[][] matrizC = new int[matrizA.length][matrizB[0].length];
      
      for (int i= 0; i<matrizC.length; i++)
          for (int j=0; j<matrizC[0].length; j++)
              for (int k=0; k<matrizA.length; k++)
                  matrizC[i][j] = matrizC[i][j] + matrizA[i][k] * matrizB[k][j];
      return matrizC;
   }
 
 public static void imprimirMatrices(int[][]array){
     for(int i = 0; i<array.length; i++){
         for(int j= 0; j<array[0].length; j++){
             System.out.printf("%3d", array[i][j]);
         }
         System.out.println();
     }
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int[][] matrizA, matrizB, matrizC;
        int rowsA, colsA, rowsB, colsB;
        boolean esIgual;
        int nCol =0;
        int nRow = 0;
        
        System.out.println("=======////////////Programa que multiplica matrices////////////=======");
        System.out.println("Ingresa el número de renglones de la MATRIZ A");
        entrada = bufer.readLine();
        rowsA = Integer.parseInt(entrada);
        System.out.println("Ingresa el número de columnas de la MATRIZ A");
        entrada = bufer.readLine();
        colsA = Integer.parseInt(entrada);
        System.out.println("Ingresa el número de renglones de la MATRIZ B");
        entrada = bufer.readLine();
        rowsB = Integer.parseInt(entrada);
        System.out.println("Ingresa el número de columnas de la MATRIZ B");
        entrada = bufer.readLine();
        colsB = Integer.parseInt(entrada);

        esIgual = multiplicables(colsA, rowsB);
        
    
        if(!esIgual){
            System.out.println("Uy Tus matrices no son multiplicables");
            System.out.println("ya que columnas de matrizA no es igual que renglones de matrizB");
            
            matrizA = rellenarMatrices(rowsA, colsA);
            matrizB = rellenarMatrices(rowsB, colsB);
            matrizC = multiplicacionMatrices(matrizA, matrizB);
            System.out.println("============================");
            imprimirMatrices(matrizC);
        }else{
            System.out.println("Si jalo xddd, ahora lo cálculo... Espera un poco: ");
            System.out.println("=============================");
            System.out.println("Rellenando la MatrizA...");
            matrizA = rellenarMatrices(rowsA, colsA);
            System.out.println("Rellenando la MatrizB...");
            matrizB = rellenarMatrices(rowsB, colsB);
            
            System.out.println("================");
            matrizC = multiplicacionMatrices(matrizA, matrizB);
        
            System.out.println("---------------------------------");
            imprimirMatrices(matrizC);    
        }
        
    }
    
}
