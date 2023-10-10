package Practika4;

enum Computer {
    HP(new ComputerProcessor("Intel","Core i5",4,3.45,65),
            new ComputerMemory("Kingston","c8ecc",8,3.2),
            new ComputerMonitor(15.6,75)),
    ASUS(new ComputerProcessor("AMD","Ryzen 5",8,2.5,100),
            new ComputerMemory("Samsung", "M471B5273BH1-CF8",4,1.66),
            new ComputerMonitor(31.5,120,"4k")),
    MSI(new ComputerProcessor("Intel","Core i9",12,4.5,120),
            new ComputerMemory("HyperX","Fury",16,3.2,true),
            new ComputerMonitor(31.5,120,"2k")),
    LENOVO(new ComputerProcessor("AMD","Ryzen 7", 12,4.5,85),
            new ComputerMemory("Samsung","459disa-24",16,2.4),
            new ComputerMonitor(31.5,100)),
    ACER(new ComputerProcessor("Intel","Pentium",2,1.2,20),
            new ComputerMemory("Hynix","8435tads-45-a",2,1.2),
            new ComputerMonitor(16.5,30,"для учёбы"));
    private ComputerMonitor monitor;
    private  ComputerMemory  memory;
    private ComputerProcessor processor;
    Computer(ComputerProcessor processor,ComputerMemory memory, ComputerMonitor monitor){
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    public void setMemory(ComputerMemory memory) {
        this.memory = memory;
    }

    public void setMonitor(ComputerMonitor monitor) {
        this.monitor = monitor;
    }

    public void setProcessor(ComputerProcessor processor) {
        this.processor = processor;
    }

    public ComputerMemory getMemory() {
        return memory;
    }

    public ComputerMonitor getMonitor() {
        return monitor;
    }

    public ComputerProcessor getProcessor() {
        return processor;
    }
}
