public class TrappedRainWater {
    public static int trappedWater(int height[], int width){
        int trappedWater = 0;
        int maxLeft[] = new int[height.length];
         maxLeft[0] = height[0];
         for(int i = 1; i<height.length; i++){
            maxLeft[i] = Math.max(height[i], maxLeft[i-1]);
            
         }

         int maxRight[] = new int[height.length];
         maxRight[height.length-1] = height[height.length-1];
         for(int i = height.length-2; i>=0; i-- ){
            maxRight[i] = Math.max(height[i], maxRight[i+1]);
         }

         for(int i = 0; i<height.length; i++){
         int waterLevel = Math.min(maxLeft[i], maxRight[i]);

         trappedWater += waterLevel- height[i] * width;

         }

         return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        int width = 1;
        int area = trappedWater(height,width);
        System.out.print(area);


    }
    
}
