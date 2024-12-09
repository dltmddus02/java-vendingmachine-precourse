package vendingmachine.view.input;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String inputCoinInPossession() {
        String coinInPossession = Console.readLine();
        InputValidator.validatePositiveInteger(coinInPossession);
        return coinInPossession;
    }

    public static String inputProductNamePriceAmount() {
        String productNamePriceAmount = Console.readLine();
        InputValidator.validateFormat(productNamePriceAmount);
        return productNamePriceAmount;
    }

    public static String inputAmountOfCoin() {
        String amountOfCoin = Console.readLine();
        InputValidator.validatePositiveInteger(amountOfCoin);
        return amountOfCoin;
    }

    public static String inputProductNameToPurchase() {
        return Console.readLine();
    }

}
