public class Computer {

    DisplayModule displayModule;

    public void setDisplayModule(DisplayModule displayModule) {
        this.displayModule = displayModule;
    }

    public void display() {
        displayModule.display();
    }

    public static void main(String args[]) {
        Computer computer = new Computer();
        DisplayModule displayModule1 = new Monitor();
        DisplayModule displayModule2 = new Projector();

        computer.setDisplayModule(displayModule1);
        computer.display();

        computer.setDisplayModule(displayModule2);
        computer.display();
    }


}
