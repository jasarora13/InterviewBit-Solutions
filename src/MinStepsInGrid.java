
public class MinStepsInGrid {
	 public int coverPoints(int[] A, int[] B) {
	        
	        int startx = A[0];
	        int starty = B[0];
	        int distance = 0;
	        for(int i = 1;i<A.length;i++){
	            distance += Math.max(Math.abs(A[i] - startx) , Math.abs(B[i] - starty));
	            startx = A[i];
	            starty = B[i];
	            
	        }
	        return distance;
	        
	        
	    }
}
