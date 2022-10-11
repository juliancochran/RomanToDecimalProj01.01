public class RomanToDecimal {
    public static int romanToDecimal(String roman)  {
        int sum = 0;
        // convert to all one case
        roman = roman.toUpperCase();
        for(int i = 0; i < roman.length(); i++) {
            if(roman.charAt(i) == 'I')
                sum += 1;
            else if(roman.charAt(i) == 'V')
                sum += 5;
            else if(roman.charAt(i) == 'X')
                sum += 10;
            else if(roman.charAt(i) == 'L')
                sum += 50;
            else if(roman.charAt(i) == 'C')
                sum += 100;
            else if(roman.charAt(i) == 'D')
                sum += 500;
            else if(roman.charAt(i) == 'M')
                sum += 1000;
            else
                return -1;
        }
        // INVARIANTS
        if(roman.indexOf("IV") != -1)
            sum -= 2;
        if(roman.indexOf("IX") != -1)
            sum -= 2;
        if(roman.indexOf("XL") != -1)
            sum -= 20;
        if(roman.indexOf("XC") != -1)
            sum -= 20;
        if(roman.indexOf("CD") != -1)
            sum -= 200;
        if(roman.indexOf("CM") != -1)
            sum -= 200;
        return sum;
    }

    /*
    public static boolean logicalRoman(String roman)   {
        return t/f;
    }

    private static String decimalToRoman(int decimal)   {
        String roman = "";
        // 2175
        while number > 1000:
            //is there 1000 in it?
            roman += "M"
            decimal -= 1000;
        while number > 900:
            //is there 900 in it?
            roman += "CM"
            decimal -= 900;

    }

     */

    public static void main(String[] args)  {
        for(String roman : args)    {   // for-each
            int decimal = romanToDecimal(roman);
            //String romanTest = decimalToRoman(decimal);
            if(decimal != -1)
                System.out.println("Input: " + roman + " => output: " + decimal);
            else
                System.out.println("Input: " + roman + " => output: invalid");
        }
    }
}
