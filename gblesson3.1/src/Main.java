public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] mass = new int[n];

        for (int i=0;i< mass.length;i++){
            mass[i]= (int) Math.round(Math.random()*100);
        }

        int count=0;
        for (count=0;count< mass.length;count++) {
            System.out.print(mass[count] + "\t");
        }

        int[] sortedMass = mergeSort(mass);

        System.out.println();


        for (count=0;count< mass.length;count++) {
            System.out.print(sortedMass[count] + "\t");
        }
    }

    public static int[] mergeSort(int[] array){
        int[] tmp;
        int[] currentSrc=array;
        int[] currentDest = new int[array.length];
        int size =1;
        while(size< array.length){
            for (int i =0; i< array.length; i+=2 *size){
                merge(currentSrc, i, currentSrc, i+size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size*=2;


        }
        return currentSrc;
    }

    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest, int destStart, int size){
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++){
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])){
                dest[i] = src1[index1];
                index1++;
            } else{
                dest[i] = src2[index2];
                index2++;
            }
        }
    }
}