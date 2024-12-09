package vendingmachine.view.output;

import static vendingmachine.view.output.OutputMessage.AMOUNT_OF_INPUT;
import static vendingmachine.view.output.OutputMessage.INPUT_AMOUNT_OF_COIN;
import static vendingmachine.view.output.OutputMessage.INPUT_COIN_IN_POSSESSION;
import static vendingmachine.view.output.OutputMessage.INPUT_PRODUCT_NAME_PRICE_AMOUNT;
import static vendingmachine.view.output.OutputMessage.INPUT_PRODUCT_NAME_TO_PURCHASE;

public class OutputView {
    public static void printCoinInPossession() {
        System.out.println(INPUT_COIN_IN_POSSESSION.getMessage());
    }

    public static void printProductNamePriceAmount() {
        System.out.println(INPUT_PRODUCT_NAME_PRICE_AMOUNT.getMessage());
    }

    public static void printAmountOfCoin() {
        System.out.println(INPUT_AMOUNT_OF_COIN.getMessage());
    }

    public static void printProductNameToPurchase(Integer input) {
        System.out.printf(AMOUNT_OF_INPUT.getMessage(), input);
        System.out.println(INPUT_PRODUCT_NAME_TO_PURCHASE.getMessage());
    }
}
