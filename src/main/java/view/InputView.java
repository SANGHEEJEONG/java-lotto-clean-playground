package view;

import java.util.Scanner;

public class InputView {

    private final Scanner input = new Scanner(System.in);

    public int getLottoMoney() {
        return input.nextInt();
    }

    public String inputLastWeekLottoNumber() {
        return input.next();
    }

    public int inputBonusBall() {
        return input.nextInt();
    }
}
