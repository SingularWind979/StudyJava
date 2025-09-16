package games.fight.landlords;

public class Poker {
    static String[] cards = new String[54];
    static int length = 54;

    public static void makePoker() {
        String[] points = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♠", "♥", "♣", "♦"};

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                cards[i * 4 + j] = colors[j] + points[i];
            }
        }
        cards[cards.length-2] = "小王";
        cards[cards.length-1] = "大王";
    }

    public static void printPoker() {
        for (String card : cards) {
            System.out.print(card + " ");
        }
    }

    public static void swapPoker(int index1, int index2) {
        String tmp = cards[index1];
        cards[index1] = cards[index2];
        cards[index2] = tmp;
    }

    public static void washPoker(int times){
        for (int i = 0; i < times; i++) {
            int index1 =(int) (Math.random() * length);
            int index2 =(int) (Math.random() * length);
            swapPoker(index1, index2);
        }
    }
}
