public class Tarjeta implements IPago{
    String digitosTarjeta;

    @Override
    public String getDatosPago(){
        return digitosTarjeta;
    }
}
