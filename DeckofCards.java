package blackjack;
import java.util.Arrays;
public class DeckofCards {
    private Card[] cards;

    public DeckofCards() {
        this.cards = new Card[52];
        for (int i = 1; i < 14; i++) {
            for (int j = 0; j < 4; j++) {
                int count = 0;
                while (count <= 51)
                    Card card = new Card(i,j);
                    this.cards[count] = new Card(i, j);
                count++;
            }
        }
    }

    public void f(){
        String s = Arrays.toString(this.cards);
        System.out.println(s);
    }

}
