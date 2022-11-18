public class Sticks {
    int l_hand;
    int r_hand;

    public Sticks() {
        this.l_hand = 2;
        this.r_hand = 2;
    }

    public int getLHand() {
        return this.l_hand;
    }

    public int getRHand() {
        return this.r_hand;
    }

    public void combineHand() {
        this.l_hand = this.l_hand + this.r_hand;
        this.r_hand -= this.r_hand;
        if (this.l_hand > 4) {
            this.r_hand = this.l_hand % 4;
            this.l_hand -= r_hand;
        }
    }
}
