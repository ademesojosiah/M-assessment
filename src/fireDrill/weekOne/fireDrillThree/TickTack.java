package fireDrill.weekOne.fireDrillThree;

public class TickTack {
    public static void main(String[] args) {
        char[][] tick = {{'X','O','X'},{'X','X','O'},{'O','X','X'}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                char currChar = tick[i][j];

                if (currChar == 'X') {
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
