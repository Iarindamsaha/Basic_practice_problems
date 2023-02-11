import java.util.Arrays;

public class FrequencyOfElement {

    public void frequency(int A[], int n) {

        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (A[i] == A[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(A[i] + "=" + count + "Times");
        }
    }

    public static void main(String[] args) {
        FrequencyOfElement obj = new FrequencyOfElement();
        int arr[] = {12,12,30,30,90,21,566,35,72};
        int n = arr.length;
        obj.frequency(arr, n );
    }
}