import java.util.*;

public class Inversions {

    private static long getNumberOfInversions(int[] a, int[] b, int left, int right) {
        long numberOfInversions = 0;
        if (right <= left + 1) {
            return numberOfInversions;
        }
        int ave = (left + right) / 2;
        for(int i = 0; i < a.length; i++){
    			//System.out.print(b[i]);
        }
        //System.out.println();
        numberOfInversions += getNumberOfInversions(a, b, left, ave);
        numberOfInversions += getNumberOfInversions(a, b, ave, right);
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        int mid = ave;
        int start = left;
        int index = start;
        while(index < right){
	    		if(left == mid){
	    			b[index] = a[ave];
	    			ave++;
	    		}else if(ave == right){
	    			b[index] = a[left];
	    			left++;
	    		}else if(a[left] <= a[ave]){
	    			b[index] = a[left];
	    			left++;
	    		}else if(a[left] > a[ave]){
	    			b[index] = a[ave];
	    			numberOfInversions += (mid - left);
	    			ave++;
	    		}else{
	    		}
	    		index++;
        }
        for(int i = start; i < right; i++){
        		a[i] = b[i];
        }
        for(int i = 0; i < a.length; i++){
			//System.out.print(b[i]);
        }
        //System.out.println();
        //write your code here
        return numberOfInversions;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        System.out.println(getNumberOfInversions(a, b, 0, a.length));
    }
}

