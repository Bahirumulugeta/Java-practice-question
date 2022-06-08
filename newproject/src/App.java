package newproject.src;
public class App {
    public static void main(String... args){
        boolean ret=hasKSmallFactors(7,30);
        if(ret){
            System.out.print("n has k factors");
        }
        else{
            System.out.print("n has not k factors");
        }
    }
    public static boolean hasKSmallFactors(int k, int n){
        for(int i=2;i<k;i++){
           if((n%i)==0 && (n/i)<k ){
                return true;
            }
        }
        return false;
    }
}
