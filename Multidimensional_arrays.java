public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int[][] matrice = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);

        int[] number1 = new int [5];

        String [][] strings = new String[2][3];  //массив из строк, 2 строки и 3 столбца
        strings [0][1] = "Hello"; // инициализация массива
        System.out.println(strings [0] [1]);

        System.out.println();
        for (int i = 0; i< matrice.length; i++){
            for (int j = 0; j< matrice.length; j++){
                System.out.print(matrice [i][j]+" ");
            }
            System.out.println();
        }
    }
}
