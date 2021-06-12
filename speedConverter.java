public class speedConverter {

    public static long toMilesPerHour(double kilometers){
        if(kilometers < 0){
            System.out.println(-1);
            return -1;
        }else {
            long conversion = (long) Math.round((kilometers * 5) / 8);
            System.out.println("miles is " + conversion);
            return conversion;
        }
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("invalid number!!!");
        } else {
            long newConversion = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + newConversion + " mi/h");
        }
    }
}
