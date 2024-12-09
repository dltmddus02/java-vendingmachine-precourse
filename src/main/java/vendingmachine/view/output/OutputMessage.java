package vendingmachine.view.output;

public enum OutputMessage {
    INPUT_COIN_IN_POSSESSION("자판기가 보유하고 있는 금액을 입력해 주세요."),
    COINS_HELD_BY_VENDING_MACHINE("자판기가 보유한 동전"),
    INPUT_PRODUCT_NAME_PRICE_AMOUNT("상품명과 가격, 수량을 입력해 주세요."),
    INPUT_AMOUNT_OF_COIN("투입 금액을 입력해 주세요."),
    AMOUNT_OF_INPUT("투입 금액: %d원\n"),
    INPUT_PRODUCT_NAME_TO_PURCHASE("구매할 상품명을 입력해 주세요.");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
