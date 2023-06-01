import java.util.ArrayList;

public class CharacterSets {

    public static void main(String[] args) {

        Subseq(" " , "abc");
    }

    static void Subseq(String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        Subseq(p+ch, up.substring(1));
        Subseq(p, up.substring(1));

    }


    //To print ArrayList
//    static  ArrayList<String> SubSeqRet(String p , String up){
//
//        if(up.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//
//        char ch = up.charAt(0);
//
//        ArrayList<String> left = SubSeqRet(p+ch, up.substring(1));
//        ArrayList<String> right = SubSeqRet(p, up.substring(1));
//
//        left.addAll(right);
//
//        return left;
//
//    }

//    static void Subseq(String p , String up){
//
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//
//        Subseq(p+ch, up.substring(1));
//        Subseq(p, up.substring(1));
//        Subseq(p+(ch+0) , up.substring(1));
//
//    }

}
