public class FizzBuzzTranslate {
    int number;

    public static String getFizzBuzz(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0 && number > 0) {
            return "Buzz";
        } else if (number % 3 == 0 && number > 0) {
            return "Fizz";
        } else
            return getName(number);
    }

    public static String getName(int number) {
        int dozen = number / 10;
        int unit = number % 10;
        String name = "";
        if(number<10){
            return getUnit(number);
        }
        if(number==10){
            return "muoi ";
        }
        if(number<20){
            return "muoi" + getUnit(unit);
        }
        return getUnit(dozen) + getUnit(unit);
    }


    private static String getUnit(int unit) {
            switch (unit) {
                case 1:
                    return "mot ";
                case 2:
                    return "hai ";
                case 3:
                    return "ba ";
                case 4:
                    return "bon ";
                case 5:
                    return "nam ";
                case 6:
                    return "sau ";
                case 7:
                    return "bay ";
                case 8:
                    return "tam ";
                case 9:
                    return "chin ";
                case 0:
                    return "muoi ";
            }
            return "";
    }
}
