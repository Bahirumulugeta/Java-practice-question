package newproject.src;
public class App {
    public static void main(String... args){
        int array[]={2,3,5,4,6,7};
        int ret=isComplate(array);
        if(ret==1){
            System.out.print("it is complate");
        }
        else{
            System.out.print("it is not complate");
        }
    }
    public static int isComplate(int[] args){
        int inc=0;int min=args[0];int max=args[0];
        for(int i=0;i<args.length;i++){
            if(args[i]%2==0){
                if(args[i]<min){
                    min=args[i];
                }
                else if(args[i]>max){
                    max=args[i];
                }
            }
            else{
                if(args[i]==min){
                    min=args[i+1];
                }
            }
        }
        int diff;int size=0;
        if(min!=max){
            for(int j=0;j<args.length;j++){
                if(args[j]>min&&args[j]<max){
                    size++;
                }
            }
            diff=max-min;
           if(diff-1==size){
               return 1;
           }
           else return 0;
        }
        else
           return 0;
    }
}
