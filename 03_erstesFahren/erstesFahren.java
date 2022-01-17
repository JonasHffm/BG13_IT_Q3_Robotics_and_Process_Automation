/***
 *
 * IntelliJ: Generate leJOS-Module before implementing this file in src-directory
 * -> with Right-click on `BG13_IT_Q3_Robotics_and_Process_Automation` > `New` > `Module...` > ...
 *
 *
 */

import ch.aplu.ev3.*;

public class ErstesFahren
{
    public ErstesFahren()
    {
        // Fahr-Roboter
        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        robot.addPart(gear);

        gear.forward(1000);
        gear.left(500);
        gear.right(500);
        gear.backward(1000);
        gear.stop();

        robot.exit();
    }

    public static void main(String[] args)
    {
        new ErstesFahren();
    }
}