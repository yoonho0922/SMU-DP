package ass09;

public class StartState implements State{

    CalcV2 calc;

    public StartState(CalcV2 calc) {
        this.calc = calc;
    }

    @Override
    public void processNumber(String ch) {
        // operand1 에 값을 넣음
        calc.setOperand1(Integer.parseInt(ch));
        calc.setState(calc.firstOperandState);
    }

    @Override
    public void processOperator(char ch) {
        System.out.println("초기 상태입니다. 정수를 입력해주세요.");
    }
}
