public class ClockAngle {
    public int anglecalc(int Hours, int Mins){
        int angle;
        
        if (Hours > 12){
        Hours -= 12;}
        angle = 360*Hours/12-360*Mins/60;
        if (angle > 180){
        angle -= 360;}
        if (angle < -180){
        angle += 360;}
        angle = Math.abs(angle);
        return angle;
        }
        }