public class SingletonEager {

    //Singleton "apressado"

    private static SingletonEager instancia;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;        
        }
        
    }
