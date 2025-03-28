package Module61;

public class ValidParanthesis {
    static void genBc(int n, int oc, int cc,String ans){
        if(ans.length()==n*2){
            System.out.println(ans);
            return;
        }
         if(oc<n){
            genBc(n, oc+1, cc, ans+"(");
        }
         if(oc>cc){
            genBc(n, oc, cc+1, ans+")");
        }
    }
    public static void main(String[] args) {
        int n=3;
        genBc(n, 0, 0, "");
    }
}
