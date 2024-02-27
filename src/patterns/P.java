package patterns;
/*Single ton pattern

 */
public class P extends Alfa {
    public P(){

    }
    private  static P p = null;
    public static P instance(){
        if(p == null){
            p = new P();
        }
        return p ;
    }
}
