package ass09;

public class FirstOperandState implements State{

    CalcV2 calc;

    public FirstOperandState(CalcV2 calc) {
        this.calc = calc;
    }

    @Override
    public void processNumber(String ch) {
        System.out.println("하나의 정수가 있는 상태입니다. 연산자를 입력해주세요.");
    }

    @Override
    public void processOperator(char ch) {
        calc.setOperator(ch);
        calc.setState(new OperatorState(calc));
    }
}
