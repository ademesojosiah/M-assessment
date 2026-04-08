package morningDrills.weekFour.dayThree;

public class Matrix {

    public boolean sum(int[][] arr){

        int n = arr.length-1;
        int sum = 0;

        while(n >= 0){
            sum += arr[1][n];
            n--;
        }

        n = arr.length-1;

        for(int i = 0; i < arr.length ; i++){
            int verticalSum = 0;
            int horizontalSum = 0;
            int firstDiagonalSum = 0;
            int secondDiagonalSum = 0;
            int diagonal = 0;
            for(int j = 0; j < arr.length ; j++ ){
                verticalSum += arr[i][j];
                horizontalSum += arr[j][i];
                firstDiagonalSum += arr[diagonal][j];
                secondDiagonalSum += arr[n-diagonal][j];
                diagonal++;
            }


            if(verticalSum != sum){
                return false;
            }

            if(horizontalSum != sum){
                return false;
            }

            if(firstDiagonalSum != sum){
                return false;
            }

            if(secondDiagonalSum != sum){
                return false;
            }
        }

        return true;
    }

}
