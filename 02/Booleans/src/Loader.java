
public class Loader {
    public static void main(String[] args) {
        int milkAmount = 5000; // ml
        int powderAmount =5000; // g
        int eggsCount = 30; // items
        int sugarAmount = 3000; // g
        int oilAmount = 3000; // ml
        int appleCount = 20;


        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if(powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >=30)
        {
            System.out.println("Pancakes");
            powderAmount -= 400;
            sugarAmount -= 10;
            milkAmount -= 1000;
            oilAmount -= 30;
        }


        //milk - 300 ml, powder - 5 g, eggs - 5
        if(milkAmount >= 300 && powderAmount >= 5 && eggsCount >=5)
        {
            System.out.println("Omelette");
            milkAmount -= 300;
            powderAmount -= 5;
            eggsCount -=5;
        }


        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if(appleCount >= 3 && milkAmount >= 1000 && powderAmount >= 400 && eggsCount >=5) {
            System.out.println("Apple pie");
            appleCount -= 3;
            milkAmount -= 1000;
            powderAmount -= 400;
            eggsCount -=5;

        }

    }
}