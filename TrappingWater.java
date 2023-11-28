import java.util.*;
public class TrappingWater
{
    public static int RainWater(int height[])
    {
        int n=height.length;
        //Calculate left maxbound
        int leftMaxBound[]=new int[n];
         leftMaxBound[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftMaxBound[i]=Math.max(height[i],leftMaxBound[i-1]);
        }
        //Calculate Right max
        int rightMaxBound[]=new int[n];
        rightMaxBound[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMaxBound[i]=Math.max(height[i],rightMaxBound[i+1]);
        }
        int trapwater=0;
        //loop
        for(int i=0;i<n;i++)
        {
            //WaterLevel=Min(left maxbound,right maxbound)
            int waterlevel=Math.min(leftMaxBound[i],rightMaxBound[i]);
            //TrapWater=waterlevel-height[i]
             trapwater+=waterlevel-height[i];

        }
        return trapwater;
    }
    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(RainWater(height));
 
    }
}