import java.util.ArrayList;

public class Converter {
    Converter(int number){
        ArrayList<Integer> restList = new ArrayList<Integer>();

        while(number != 1) {
            int rest = number % 2;
            restList.add(rest);
            number = (number - rest) / 2;
        }

        restList.add(1);

        for(int i = (restList.size() - 1); i >= 0; i--){
            System.out.print(restList.get(i));

        }
        System.out.println("\n");
    }


}
