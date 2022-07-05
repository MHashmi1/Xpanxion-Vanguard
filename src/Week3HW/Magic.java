package Week3HW;

//This program returns true or false depending on whether the array has the same row sum for all rows

public class Magic {
    public static void main(String[] args) {

        int[][] array1 = {
                {4, 9, 5,2},
                {3, 10, 1, 6},
                {13, 1, 2, 4}
        };

        int [][] array2 = {
                {31, 1, -1, 15, 10},
                {21, 18, 5, 4, 8}
        };

        int [][] array3= {
                {4, 8, 7},
                {2, 9, 6}
        };

        System.out.println(isRowMagic(array1));
        System.out.println(isRowMagic(array2));
        System.out.println(isRowMagic(array3));


    }

    public static boolean isRowMagic(int[][] arr) {

        int sum=0;
        for (int col = 0; col< arr[0].length; col++){
            sum+=arr[0][col];
        }

        for (int row = 1; row< arr.length; row++){
            int checkSum=0;
            for (int col=0; col<arr[row].length; col++){
                checkSum+=arr[row][col];
            }
            if (checkSum != sum)
                return false;
        }
        return true;

    }
}


