package algorithms;

public class RemoveAdjesantRepeatedString {

    public static void main(String[] args) {

        RemoveAdjesantRepeatedString object = new RemoveAdjesantRepeatedString();
        System.out.println(object.removeRepeatedChar("AABABA"));
        System.out.println(object.removeRepeatedChar("ABABAB"));
        System.out.println(object.removeRepeatedChar("AAAA"));
        System.out.println(object.removeRepeatedChar("BBBB"));
        System.out.println(object.removeRepeatedChar("BABBBAAABBBAAA"));

    }

    public int removeRepeatedChar(String s){
        int count=0;
        char temp = s.charAt(0);
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(temp==ch){
                count++;
            }
            temp=ch;
        }
        return count;
    }
}
