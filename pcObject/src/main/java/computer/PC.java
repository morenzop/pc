package computer;


public class PC {
    private static Case Case;
    private static Monitor monitor;
    private static Motherboard motherboard;

    public PC(Case Case, Monitor monitor, Motherboard motherboard){
        this.Case=Case;
        this.monitor=monitor;
        this.motherboard=motherboard;


    }

    public PC() {

    }

    private static void drawLogo(){
       Monitor.drawPixelAt(7,9,"green");
    }
    public static void description(){
        System.out.println(Case);
        System.out.println(monitor);
        System.out.println(motherboard);
    }
    public static void powerUp(){
        Case.pressPowerButton();
        drawLogo();
        Motherboard.loadProgram("Get Schwifty");

        }

    public computer.Case getCase() {
        return Case;
    }

    public void setCase(computer.Case aCase) {
        Case = aCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "PC{" +
                "Case=" + Case +
                ", monitor=" + monitor +
                ", motherboard=" + motherboard +
                '}';
    }
}
