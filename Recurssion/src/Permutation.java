public class Permutation {
    public static void main(String[] args) {

        GivePermutation("" , "abc");

//        Understanding how SubString function works
//        String str = "abc";
//        String p = str.substring(0);
//        System.out.println(p);
//        last index is exclusive
   }

    static void GivePermutation(String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){

            String first = p.substring(0 , i);
            String second = p.substring(i);
            GivePermutation(first+ch+second , up.substring(1));
        }


    }
}
