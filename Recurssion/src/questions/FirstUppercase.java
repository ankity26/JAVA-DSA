package questions;

import java.sql.SQLOutput;

public class FirstUppercase {

    public static void main(String[] args) {
        String str = "geeksforgeeKs";
//        System.out.println(str.substring(1));
        IsUpper("" , str);
    }

    static void IsUpper(String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(Character.isUpperCase(ch)){
            IsUpper(p+ch , up.substring(1)); //if character is upper case we will add it to empty string
        }
        else{ // else we will pass the empty string to the next functionc call
            IsUpper(p , up.substring(1));
        }
    }


}
