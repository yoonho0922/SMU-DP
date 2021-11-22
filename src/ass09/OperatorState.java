package ass09;

public class OperatorState implements State {
    CalcV2 calc;

    public OperatorState(CalcV2 calc) {
        this.calc = calc;
    }

    @Override
    public void processNumber(String ch) {
        calc.setOperand2(Integer.parseInt(ch));
        calc.setState(new SecondOperandState(calc));
    }

    @Override
    public void processOperator(char ch) {
        System.out.println("정수를 입력해주세요.");
    }
}
