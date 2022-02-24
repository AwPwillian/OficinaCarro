import java.util.Scanner;
public class OficinaDeCarro {
    public static String MarcaVeiculo;
    public static String ModeloVeiculo;
    public static String AnoVeiculo;
    public static String ProblemaVeiculo;
    public static String DataEntrada;
    public static void main(String[] args) throws Exception {
        
        Scanner marca = new Scanner(System.in);
        System.out.println("Qual a marca do veículo?");
        MarcaVeiculo = marca.nextLine();

    }    
}
