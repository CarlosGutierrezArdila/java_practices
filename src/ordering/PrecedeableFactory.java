package ordering;

public class PrecedeableFactory {
    public static Precedable[] createPrecedeables( int length) {
        Precedable[] ret = new Precedable[length];
        for (int i = 0; i < ret.length; i++) {
            // ret[i] = new Persona("name"+Math.random()*1000,  (int) Math.round(Math.random()*1000) );
            ret[i] = new Celular((int) Math.round(Math.random()*10000), "name "+Math.random()*1000 );
        }
        return ret;
    }
}
