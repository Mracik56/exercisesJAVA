public class Uloha14 {
    public static void main(String[] args) {
        int sirkaH = 6;
        int dlzkaH = 11;

        for (int i = 0; i < sirkaH; i++) {
            for (int j = 0; j < dlzkaH; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ==================================");
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("==============================================");
        }
    }
}

