public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
       String[] splitTime = args[0].split(":");
       
       int hours = Integer.parseInt(splitTime[0]);
       int minutes = Integer.parseInt(splitTime[1]);
       
       int minutesToAdd = Integer.parseInt(args[1]);

       int totalMinutes = (hours * 60) + minutes + minutesToAdd;
       int totalHours = totalMinutes/60;
       int newHours = totalHours%24;
       int newMinutes = totalMinutes - (totalHours * 60);

       String h = (newHours < 10) ? "0" + newHours : Integer.toString(newHours);
       String m = (newMinutes < 10) ? "0" + newMinutes : Integer.toString(newMinutes);
       
       System.out.println(h +":" + m);
       }
    }

