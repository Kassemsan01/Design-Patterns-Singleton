
public class Fila {

    private static Fila imprime;

    public static Fila getInstance(){

    if(imprime == null){

    imprime = new Fila();

    }
    return imprime;
    }

    public void imprime_documento(){
    }

    public void remove_documento(){
    }

    public void remove_todos_documento(){
    }

    private Fila(){
    }
}