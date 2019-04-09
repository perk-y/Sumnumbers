package SumNumbers;

public class sumNumber {
    public int sumNumbers(String str) {
        int k=0;
        int sum =0;
        int size = str.length();
        while( k < size) {
                Character current =str.charAt(k);
            int num =0;
            while(Character.isDigit(current)&& (k< str.length())){
                 num = num*10+ Character.getNumericValue(current);
                 if(++k<str.length()) current=str.charAt(k);
            }
            sum= sum + num;
            k++;

        }
        return sum;
    }

}
