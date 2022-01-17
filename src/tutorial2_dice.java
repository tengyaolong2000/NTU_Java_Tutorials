import java.util.Random;

public class tutorial2_dice{

        private int valueOfDice;

        public tutorial2_dice() {}

        public int getValueOfDice() {
            return valueOfDice;
        }

        public void setValueOfDice() {
            Random rand = new Random();
            this.valueOfDice = rand.nextInt(1,7);
        }

        public void printDiceValue(){
            System.out.println("The value of the die is:" + getValueOfDice());
        }
}

