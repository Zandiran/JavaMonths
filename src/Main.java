public class Main {
    public static void main(String[] args) {

        int InitialInvoice = 212300;
        int addition = 15950;
        int limit = 1000;
        int bonusrubbles;

        if (addition > limit) {
            bonusrubbles = addition / 100;
        } else {
            bonusrubbles = 0;
        }
        int GrandFinale = InitialInvoice + addition + bonusrubbles ;
        System.out.println("Yours invoice is: " + GrandFinale);
        System.out.println("bonus points: " + bonusrubbles);}
}
