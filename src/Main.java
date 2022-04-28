interface Street{
    void StreetName();
}

class BlokOfFlats {

    static Street street = new Street() {
        @Override
        public void StreetName() {
            System.out.println("Nemiga Street");
        }
    };

    public void getStreet(){
        street.StreetName();
    }

    private final int numOfWindows = 35;
    private boolean smartHouse;

    public boolean getSmartHouse() {
        return smartHouse;
    }

    public void setSmartHouse(boolean smartHouse) {
        this.smartHouse = smartHouse;
    }

    public BlokOfFlats(){}

    public BlokOfFlats(boolean smartHouse) {
        this.smartHouse = smartHouse;
    }

    public class Window{
        public int getNumOfWindows(){
            System.out.println("Number of windows in the house");
            return numOfWindows;
        }
    }

    public final static class Flats {
        public int numOfFlats = 10;

        public int getNumOfFlats(){
            return numOfFlats;
        }

    }

    void isSmartHouse() {

        // Локальный метод внутреннего класса
        class SmartThings{
            public void print(){
                System.out.println("is Smart house\n");
            }
        }

        if(smartHouse){
            SmartThings smartThings = new SmartThings();
            smartThings.print();
        }

    }
}


public class Main {

    public static void main(String args[]) {
        // Создание внешнего класса
        BlokOfFlats blokOfFlats = new BlokOfFlats(false);

        // Создание внутреннего класса
        BlokOfFlats.Window window = blokOfFlats.new Window();
        System.out.println(window.getNumOfWindows());

        BlokOfFlats.Flats flats = new BlokOfFlats.Flats();
        int num = flats.getNumOfFlats();
        System.out.println("Number of flats \n" + num);

        blokOfFlats.isSmartHouse();
        blokOfFlats.getStreet();
    }
}