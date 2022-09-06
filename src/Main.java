public class Main {
    public static void main(String[] args) {
      BonusMileService service = new BonusMileService();
      int price = 1000;
      int mile = service.calculate(price);
        System.out.println(mile);
    }
}
