public class Answer {

    public static void main(String[] args) {
        System.out.println("Klasa to " + ColorString.BLUE + "definicja zestawu cech i funkcjonalnosci danego elementu."
                + ColorString.RESET);
        System.out.println("Obiekt to " + ColorString.BLUE + "reprezentacja klasy." + ColorString.RESET);
        System.out.println("Zmienna to " + ColorString.BLUE + "podstawowy element do przechowywania danych w kodzie \n"
                + "programu, pozwala zapamiętać w w pamięci komputera dowolną informację." + ColorString.RESET);
        System.out.println("Każda zmienna musi mieć określony " + ColorString.BLUE + "typ" + ColorString.RESET
            + ", np. int, albo String.");
        System.out.println("Jeżeli deklarację zmiennej poprzedzimy słowem final, to" + ColorString.BLUE
                + " po deklaracji \ni inicjalizacji ta zmienna już nie zmieni wartości." + ColorString.RESET);
        System.out.println("W klasie mogą się znajdować " + ColorString.BLUE + "pola, metody" + ColorString.RESET
                + " i " + ColorString.BLUE + " konstruktory" + ColorString.RESET);
        System.out.println(ColorString.BLUE + "Typy obiektowe " + ColorString.RESET + "są wywoływane przez operator"
            + ColorString.BLUE + " new " + ColorString.RESET + "i służą do tworzenia nowych obiektów.");
        System.out.println("Jeśli w klasie zdefiniowano chociaż jeden" + ColorString.BLUE + " zdefiniowany przez nas "
                + "konstrukctor " + ColorString.RESET + " to kompilator nie wygeneruje dla nas" + ColorString.BLUE
                + " konstruktora "+ ColorString.RESET + "domyślnego");
        System.out.println("Zakładając, że istnieje klasa Car, to przy zapisie:\n"
                + "Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);\nCar car2 = car1;\n"
                + "car1 i car2 to dwie "+ ColorString.BLUE + "referencje " + ColorString.RESET + "wskazujące na ten sam"
                + ColorString.BLUE + " obiekt");
/*
Klasa to definicja zestawu cech i funkcjonalnosci danego elementu.
Obiekt to reprezentacja klasy.
Zmienna to podstawowy element do przechowywania danych w kodzie
programu, pozwala zapamiętać w w pamięci komputera dowolną informację.
Każda zmienna musi mieć określony typ, np. int, albo String.
Jeżeli deklarację zmiennej poprzedzimy słowem final, to po deklaracji
i inicjalizacji ta zmienna już nie zmieni wartości.
W klasie mogą się znajdować pola, metody i  konstruktory
Typy obiektowe są wywoływane przez operator new i służą do tworzenia nowych obiektów.
Jeśli w klasie zdefiniowano chociaż jeden zdefiniowany przez nas konstrukctor  to kompilator nie wygeneruje dla nas konstruktora domyślnego
Zakładając, że istnieje klasa Car, to przy zapisie:
Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);
Car car2 = car1;
car1 i car2 to dwie referencje wskazujące na ten sam obiekt
*/
    }
}
