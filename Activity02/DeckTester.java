package Activity02;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        // Regular deck
        String[] ranks = {"ace","two","three","four","five","six","seven","eight","nine","ten","jack", "queen", "king"};
        String[] suits = {"clubs", "spades", "hearts", "diamonds"};
        int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Deck d = new Deck(ranks, suits, pointValues);
        System.out.println(d.size());
        System.out.println(d.toString());
        while (!d.isEmpty()) {
            d.deal();
        }
        System.out.println(d.toString());
        

        //mini deck
        String[] ranks2 = {"jack", "queen", "king"};
        String[] suits2 = {"blue", "red"};
        int[] pointValues2 = {11, 12, 13};
        d = new Deck(ranks2, suits2, pointValues2);
        System.out.println(d.size());
        System.out.println(d.toString());
        while (!d.isEmpty()) {
            d.deal();
        }
        System.out.println(d.toString());
        
        String[] ranks3 = {"horse", "rabbit"};
        String[] suits3 = {"black", "white"};
        int[] pointValues3 = {1, 2};
        d = new Deck(ranks3, suits3, pointValues3);
        System.out.println(d.size());
        System.out.println(d.toString());
        while (!d.isEmpty()) {
            d.deal();
        }
        System.out.println(d.toString());
        
    }
}
