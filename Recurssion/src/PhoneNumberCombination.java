import java.util.ArrayList;

public class PhoneNumberCombination {
    public static void main(String[] args) {

        System.out.println(letterpad(" " , "12"));
    }

//    static void letterpad(String p , String up){
//
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        int digit = up.charAt(0) - '0';
//        for(int i = (digit - 1)*3; i < digit*3; i++){
//            char ch = (char)('a' + i);
//            letterpad(p+ch , up.substring(1));
//        }
//    }

//    Returning in ArrayList Form
//static ArrayList<String> letterpad(String p , String up){
//
//    if(up.isEmpty()){
//        ArrayList<String> ans = new ArrayList<>();
//        ans.add(p);
//        return ans;
//    }
//
//    ArrayList<String>  list = new ArrayList<>();
//
//    int digit = up.charAt(0) - '0';
//    for(int i = (digit - 1)*3; i < digit*3; i++){
//        char ch = (char)('a' + i);
//        list.addAll(letterpad(p+ch , up.substring(1)));
//    }
//
//    return list;
//}


//    TO RETURN COUNT
    static int letterpad(String p , String up){

        if(up.isEmpty()){
            return 1;
        }

        int count = 0;

        int digit = up.charAt(0) - '0';
        for(int i = (digit - 1)*3; i < digit*3; i++){
            char ch = (char)('a' + i);
            count = count + letterpad(p+ch , up.substring(1));
        }

        return count;
    }
}
