package hello.springtx.order;

// 결제 잔고가 부족한 것은 비즈니스 예외이므로, 롤백 해야하는 복구 불가능한 시스템 장애가 아니다.
public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException(String message) {
        super(message);
    }

}
