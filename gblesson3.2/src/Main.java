import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> mass = new ArrayList<>();

        for (int i =0;i< n;i++){
            mass.add( (int) Math.round(Math.random()*100));
            System.out.print(mass.get(i) + "\t");
        }

        for (int i=0;i< mass.size();i++){
            if (mass.get(i)%2==0){

                mass.remove(i);
                i--;
            }
        }
        System.out.println();
        for (int i=0;i< mass.size();i++){

            System.out.print(mass.get(i) + "\t");
        }

    }
}