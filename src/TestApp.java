import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cardNumber = sc.nextLine();
        try {
            processCard(cardNumber);
        }catch (CardNumberInvaliException e){
            System.out.println(e.getMessage());
            System.out.println("номер карты введн неверно "+e.getCardNumber());
            //e.printStackTrace();1
            String clientNumber = sc.nextLine();
            processNumber(clientNumber);
        }


    }

    private static void processNumber(String clientNumber) {
        System.out.println("Введен номер счета " + clientNumber);
    }

    private static void processCard(String cardNumber) throws CardNumberInvaliException {

            if (cardNumber.length() > 7) {
                throw new CardNumberInvaliException("число больше 5:" +cardNumber, cardNumber);
            } else if (cardNumber.length() < 4) {
                throw new CardNumberInvaliException("число меньше 2:" +cardNumber, cardNumber);
            }

    }
}
