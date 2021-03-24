package ordering;

public class SortUtil{

    public static <T>void ordenar(Precedable<T> arr[]){
        boolean swapped = false;
        for (int i=1; i< arr.length; i++) {
            if(arr[i].precedeA((T) arr[i-1])<0){
                T temp = (T) arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = (Precedable<T>) temp;
                swapped = true;
            }
        }
        if(swapped) {
            ordenar(arr);
        } else {
            System.out.println("ordenado");
            for ( Precedable<T> elem:arr) {
                System.out.println(elem);
            }
        }
    }
}
