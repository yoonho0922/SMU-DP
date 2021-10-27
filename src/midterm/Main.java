package midterm;// 201910812, 안윤호, snow09

public class Main {
    public static void main(String[] args) {
        System.out.println("노트북 생성. 요구 공간: 250");
        AbstractNotebookComputer computer = new NotebookComputer("Yoonho");
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());

        System.out.println("\n외부 모니터 추가. 요구 공간: 150 추가");
        computer = new LEDMonitor("midterm.LEDMonitor", computer);
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());

        System.out.println("\n두 번째 외부 모니터 추가. 요구 공간: 150 추가");
        computer = new LEDMonitor("LEDMonitor2", computer);
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());

        System.out.println("\n외부 키보드 추가. 요구 공간: 80 추가");
        computer = new Keyboard("midterm.Keyboard", computer);
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());

        System.out.println("\n외부 마우스 추가. 요구 공간: 30 추가");
        computer = new Mouse("midterm.Mouse", computer);
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());

        System.out.println("\n하드 드라이브 추가. 요구 공간: 40추가");
        computer = new HardDrive("midterm.HardDrive", computer);
        System.out.println("Devices: " + computer.toString());
        System.out.println("Required space: " + computer.requiredSpace());
    }
}
