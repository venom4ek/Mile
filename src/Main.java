public class Main {
    public static void main(String[] args) {
        int bonus = 5; // бонус, начислемый за каждые 20 рублей = 1 миля
        int price = 156300; // цена с копейками
        int mile = bonus * price /100 /100; // расчет полученных миль
     System.out.println(mile);
    }
}
