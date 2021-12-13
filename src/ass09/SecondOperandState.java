package ass09;

public class SecondOperandState implements State{
    CalcV2 calc;

    public SecondOperandState(CalcV2 calc) {
        this.calc = calc;
    }

    @Override
    public void processNumber(String ch) {
        System.out.println("두 개의 정수가 있는 상태입니다. = 입력해주세요.");
    }

    @Override
    public void processOperator(char ch) {
        calc.printOutResult();
        calc.setState(calc.startState);
    }
}
