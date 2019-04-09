package SumNumbers;

public class WithoutString {

    public String withoutString(String base, String remove) {
        int removelength = remove.length();
        int baselength = base.length();
        int removehashcode = remove.toLowerCase().hashCode();
        int i = 0;
        String finalString="";
        while ( i < (baselength - (removelength - 1) )) {
            if (removehashcode == base.substring(i, (i + removelength)).toLowerCase().hashCode()) {
                i+=removelength;
            }
            else {
                finalString+=base.charAt(i);

            i++;}
        }
        while(i<baselength) { finalString+=base.charAt(i); i++;}
        return finalString;
    }

}
