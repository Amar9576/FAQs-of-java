/* Speed Monitoring
------------------------
Class Name: SpeedMonitor
Variables:
- int speed

Description:
If the speed is greater than 100 km/h, print "Over Speeding", otherwise print "Safe Speed".
Use ternary operator to decide the message.

Sample Output:
Input: 120 → Output: Over Speeding
Input: 85 → Output: Safe Speed */

package Day_3;

public class SpeedMonitoring {
    public static void main(String []args){
        int speed=100;
        String race=(speed>=100)?"you are close to God":"you are on the Earth";
        System.out.println(race);
    }

    
}
