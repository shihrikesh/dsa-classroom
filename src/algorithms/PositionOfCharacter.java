package algorithms;

public class PositionOfCharacter {

    public static void main(String[] args) {
        String str = "hello";
        int pos=0;
        System.out.println(str.indexOf("l",pos,str.length()));
        while((pos= str.indexOf("l",pos,str.length()))!=-1){
            System.out.println("pos "+ pos);
            pos++;
        }
    }
}
