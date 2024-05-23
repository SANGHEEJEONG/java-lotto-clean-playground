package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String inputMoney() {

        System.out.println("구입금액을 입력해 주세요.");
        String inputText = scanner.nextLine();

        return inputText;
    }

    public static String inputCollectedNumber() {

        System.out.println('\n' + "지난 주 당첨 번호를 입력해 주세요.");
        String number = scanner.nextLine();

        return number;
    }

    public static String inputBonusBallNumber() {

        System.out.println('\n' + "보너스 볼을 입력해 주세요.");
        String bonusNumber = scanner.nextLine();

        return bonusNumber;
    }

    public static String inputDirectCount() {

        System.out.println('\n' + "수동으로 구매할 로또 수를 입력해 주세요.");
        String directNumber = scanner.nextLine();

        return directNumber;
    }

    public static List<String> inputDirectNumber(final int directCount) {

        List<String> directNumbers = new ArrayList<>();

        if (directCount == 0) return directNumbers;

        System.out.println('\n' + "수동으로 구매할 번호를 입력해 주세요.");

        for (int i = 0; i < directCount; i++) {
            directNumbers.add(makeDirectText());
        }
        return directNumbers;
    }

    private static String makeDirectText() {

        String directText = scanner.nextLine();
        return directText;
    }
}
