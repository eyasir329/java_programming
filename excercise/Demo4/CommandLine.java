package Demo4;
//not working
public class CommandLine {
    public static void main(String args[]) {
        int i=0;
        for(int j=0;j<args.length;j++){
            System.out.print(args[j]+" ");
        }
        System.out.print(args[i]+" ");
        System.exit(0);
    }

}
