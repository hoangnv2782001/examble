package composite;

public class Main {
    public static void main(String[] args) {
        Component cpu = new Leaf("CPU", 500);
        Component ram = new Leaf("RAM", 200);
        Component hdd = new Leaf("HDD", 300);

        Composite motherboard = new Composite("Motherboard");
        motherboard.addComponent(cpu);
        motherboard.addComponent(ram);
        motherboard.addComponent(hdd);

        Component mouse = new Leaf("Mouse", 20);
        Component keyboard = new Leaf("Keyboard", 30);

        Composite peripherals = new Composite("Peripherals");
        peripherals.addComponent(mouse);
        peripherals.addComponent(keyboard);

        Composite computer = new Composite("Computer");
        computer.addComponent(motherboard);
        computer.addComponent(peripherals);

        computer.showPrice();
    }
}
