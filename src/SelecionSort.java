public class SelecionSort {
    public static void selecionSort(double[] list){
        for (int i = 0; i < list.length - 1; i++) {
            double min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length ; j++) {
                if (min > list[j]){
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i){
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = {1,2.2,6,5,4.3};
        selecionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");
        }
    }
}
