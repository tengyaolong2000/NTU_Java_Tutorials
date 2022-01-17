import java.util.Scanner;

public class tutorial2_main {
    public static void main(String[] args){
        int v1 =0;
        int v2 = 0;
        tutorial2_dice dice = new tutorial2_dice();
        System.out.println("Press any <key> to roll the first die");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (!input.isEmpty()) {
            dice.setValueOfDice();
            v1 = dice.getValueOfDice();
            dice.printDiceValue();
        }

        System.out.println("Press any <key> to roll the second die");
        String input1 = sc.nextLine();
        if (!input1.isEmpty()) {
            dice.setValueOfDice();
            v2 = dice.getValueOfDice();
            dice.printDiceValue();
        }

        System.out.printf("Your total number is %d", v1+v2 );



    }
}
