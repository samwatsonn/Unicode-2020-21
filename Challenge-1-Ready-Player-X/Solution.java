public class Solution {
    public static int devvie(String input) {

        String instructions = input.replaceAll("[^FRL]", "");
        int xDir = 0;
        int yDir = 1;
        int xCoord = 0;
        int yCoord = 0;

        // Calculate Final Position and Orientation
        for(char ch : instructions.toCharArray()) {
            // Calculate orientation
            if (ch == 'R') {
                int temp = yDir;
                yDir = -xDir;
                xDir= temp;
            }
            if (ch == 'L') {
                int temp = -yDir;
                yDir = xDir;
                xDir = temp;
            }
            // Calculate position
            if (ch == 'F'){
                xCoord += xDir;
                yCoord += yDir;
            }
        }

        double angle = Math.PI - Math.acos((xCoord * xDir + yCoord * yDir)/ Math.sqrt(xCoord*xCoord + yCoord * yCoord));

        //System.out.println(angle);
        int n = (int) Math.ceil(angle / (Math.PI / 2));
        //System.out.println(n);
        //System.out.println(xDir + "," + yDir);
        //System.out.println(xCoord + "," + yCoord);
        return Math.abs(xCoord) + Math.abs(yCoord) + n;
    }
}
