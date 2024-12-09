package vendingmachine.domain;

import static vendingmachine.view.output.OutputMessage.COINS_HELD_BY_VENDING_MACHINE;

import vendingmachine.view.input.exception.InputErrorMessage;
import vendingmachine.view.input.exception.InputException;

public enum Coin {
    COIN_500(500, "%d개"),
    COIN_100(100, "%d개"),
    COIN_50(50, "%d개"),
    COIN_10(10, "%d개");

    final int amount;
    final String message;
    private int count;

    Coin(final int amount, String message) {
        this.amount = amount;
        this.message = message;
        this.count = 0;
    }

    public int getAmount() {
        return amount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private static Integer validate(String input) {
        if (Integer.parseInt(input) < 100 || Integer.parseInt(input) % 10 != 0) {
            throw new InputException(InputErrorMessage.INVALID_AMOUNT_RANGE);
        }
        return Integer.parseInt(input);
    }

    public static void printCoinInPossession(String input) {
        System.out.println(COINS_HELD_BY_VENDING_MACHINE.getMessage());
        int amount = validate(input);

        for (Coin coin : Coin.values()) {
            int count = 0;
            while (amount >= coin.amount) {
                amount -= coin.amount;
                count++;
            }
            coin.setCount(count);
            System.out.printf("%d원 - %d개%n", coin.amount, count);
        }
    }


    public static void printChangeOfMoney(Integer amount) {
        System.out.println("잔돈");

        for (Coin coin : Coin.values()) {
            int coinCount = 0;
            while (amount > 0 && coin.getCount() > 0) {
                amount -= coin.getAmount();
                coin.setCount(coin.getCount() - 1);
                coinCount++;
            }
            if (coinCount > 0) {
                System.out.printf("%d원 - %d개%n", coin.amount, coinCount);
            }
        }
    }
}
