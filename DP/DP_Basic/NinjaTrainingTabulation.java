package DP.DP_Basic;


public class NinjaTrainingTabulation {
    public static void main(String args[]) {

        int[][] points = {{10,40,70},
                          {20,50,80},
                          {30,60,90}};
           

        int n = points.length;
        System.out.println(ninjaTraining(n, points));
    }

    private static int ninjaTraining(int n, int[][] points) {
        int[][] dp=new int[n][4];
        dp[0][0]=Math.max(points[0][1], points[0][2]);
        dp[0][1]=Math.max(points[0][0], points[0][2]);
        dp[0][2]=Math.max(points[0][0], points[0][1]);
        dp[0][3]=Math.max(points[0][0], Math.min(points[0][1], points[0][2]));
        for (int day= 1; day< n; day++) {
            for (int last= 0; last< 4; last++) {
                dp[day][last]=0;
                for (int task = 0; task <=2; task++) {
                    if(task!=last){
                        int act=points[day][task]+dp[day-1][task];
                        dp[day][last] = Math.max(dp[day][last], act);
                    }
                }
            }
        }
        return dp[n-1][3];
    }
}
