package utils;

import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinningNumberFomatter {
    private final static String COMMA = ",";
    public final static List<Integer> formedWinningNumbers = new ArrayList<>();

    public static void formWinningNumbers(String inputWinningNumbers) {
        formedWinningNumbers.clear();
        formedWinningNumbers.addAll(
                Arrays.stream(inputWinningNumbers.split(COMMA)) // "1,2,3,4,5" → ["1", "2", "3", "4", "5"]
                        .map(Integer::parseInt) // ["1", "2", "3", "4", "5"] → [1, 2, 3, 4, 5]
                        .sorted() // 오름차순으로 정렬
                        .toList() // [1, 2, 3, 4, 5]
        );
    }

}
