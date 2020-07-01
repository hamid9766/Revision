package sorting;

public class StringSort {
    public static void main(String[] args){
        String[] s= {"hamid", "aman", "vivek", "ronak", "sahil", "rushi"};
        int min;
        String temp;
        for (int i =0; i<s.length; i ++ ){
            min = i;
            for (int j =i+1; j<s.length; j++){
                if (s[j].compareTo(s[i])<0){
                    min = j;
                }
            }
            temp = s[i];
            s[i] = s[min];
            s[min] = temp;

        }
        for (String value : s) {
            System.out.print(value + " ");
        }
    }

}
