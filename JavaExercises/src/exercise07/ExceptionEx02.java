package exercise07;

//인출 금액이 잔액보다 크면 예외를 발생하는 로직
public class ExceptionEx02 {
    public static void main(String[] args) {
        BankAcoount ba = new BankAcoount();
        ba.deposit(2000);
        try {
            ba.withdraw(3000);
        } catch (NegativeBalanceException e){
            System.out.println(e);
        } finally {
            System.out.println("end");
        }
    }
}

class BankAcoount {
    private int balance;

    public void deposit(int price){
        balance += price;
    }

    public void withdraw(int price) throws NegativeBalanceException{
        if(price > balance)
            throw new NegativeBalanceException();
        else balance -= price;
    }
}

class NegativeBalanceException extends Exception{
    public NegativeBalanceException(){
        super("잔액보다 인출 금액이 큽니다.");
    }
}
