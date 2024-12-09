package vendingmachine.view.input.exception;

public enum InputErrorMessage {
    INVALID_INPUT("유효하지 않은 입력 값입니다. 다시 입력해 주세요."),
    MUST_BE_INTEGER("금액은 숫자여야 합니다."),
    INVALID_AMOUNT_RANGE("상품 가격은 100원 이상, 10원으로 나누어 떨어져야 합니다."),
    NON_EXISTENT_PRODUCT("존재하지 않는 상품명입니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    InputErrorMessage(String message) {
        this.message = PREFIX + message;
    }

    public String getMessage() {
        return message;
    }
}
