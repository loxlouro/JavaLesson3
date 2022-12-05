import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        int n=10;
        for (int i=0; i< n;i++){
            mass.add((int) Math.round(Math.random()*100));
            System.out.print(mass.get(i)+"\t");
        }

        System.out.println();
        System.out.println("max= "+maxValue(mass));
        System.out.println("min= "+minValue(mass));
        System.out.println("average= "+middleValue(mass));
    }

    public static int maxValue(ArrayList<Integer> array){
        int temp = array.get(0);
        for (int i=0;i<array.size();i++){
            if (temp<array.get(i)){
                temp= array.get(i);
            }
        }
        return temp;
    }

    public static int minValue(ArrayList<Integer> array) {
        int temp = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (temp > array.get(i)) {
                temp = array.get(i);
            }
        }
        return temp;
    }

    public static int middleValue(ArrayList<Integer> array){
        int temp=0;
        int count = 0;
        for (int i=0; i< array.size(); i++){
            temp+=array.get(i);
            count++;
        }
        temp = Math.round(temp/count);
        return temp;
    }
}