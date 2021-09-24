public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Dell", "Alienware Aurora", "Intel i9", "64GB", "2TB", "Radeon RX 6800");
        Monoblock monoblock = new Monoblock("Apple", "iMac", "ARM M1", "32GB", "1TB", new Display("4480x2520", "24"));
        Laptop laptop = new Laptop("MSI", "Raider", "Intel i7", "8GB", "512GB", new Keyboard("Russian, English", "Membrane"), new Display("1920x1080", "15.6"));
        Netbook netbook = new Netbook("Huawei", "Matebook 14", "Intel i7", "8GB", "256GB", new Keyboard("Russian, English", "Membrane"), new Display("1920x1080", "14"));
        Nettop nettop = new Nettop("Intel", "Computer Card", "Pentium N4200", "4GB", "64GB");
        Server server = new Server("Supermicro", "SYS 6017R", "Intel Xeon", "32GB", "4TB");
        ComputerImpl[] Computer = {pc, monoblock, laptop, netbook, nettop, server};
        for (int i = 0; i < Computer.length; i++) {
            System.out.println(Computer[i].turnOn());;
            System.out.println(Computer[i].connect());
            System.out.println(Computer[i].turnOff());
            System.out.println("---");
        }
    }
}
