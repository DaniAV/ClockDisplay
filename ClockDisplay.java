
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private int horas;
    private int minutos;
    
    /**
     * Constructor de objetos para la clase ClockDisplay
     */
    public ClockDisplay(int horario, int minutero)
    {
        // initialise instance variables
        
        horas = horario;
        minutos = minutero;


    }
    
    /**
     * Metodo que Fija la hora del reloj a una determinada
     */
    public void setTime(int horario, int minutero)
    {
       
        horas = horario;
        minutos = minutero;
    }
    
    /**
     *Metodo que Cambia la hora del reloj aumentando en 1 los minutos
     */
    public void timeTick()
  
    {
        
        minutos = minutos + 1;
       
    }
    
    /**
     *Metodo que muestra una cadena de 5 caracteres, mostrando la hora y minutos 
     *separados por :
     */
    public String getTime()
    {
        
        String caracter = ":";
        String horaCompleta = (horas) + caracter + (minutos);
        return horaCompleta;
    }
    
}
