package convertidortemperatura;

//Código ejecutado por YORNE SANTOS
//Del grupo SC
public class ConvertidorDeTemperatura {
    
		final double puntoDeCongelacion =30.0, factorDeConversion = 5.0 / 9.0;
        double farenheit = 50, celsius;
        
    public void conversionTemp(){
        celsius = factorDeConversion * (farenheit - puntoDeCongelacion);
        System.out.println(farenheit + " Grados Farenheit =" +  celsius + " Grados Celsius.");
    }

    public static void main(String[] args) {
        ConvertidorDeTemperatura temperatura = new ConvertidorTemperatura();
        temperatura.conversionTemp();
    }
}
