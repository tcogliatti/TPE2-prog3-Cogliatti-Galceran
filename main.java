import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

    /*
    * DataSet #1
    */
    String path = "/Users/tc/Desktop/TUDAI/2023/Programacion 3/TPE2-Daira-Tom/src/datasets/";
    CSVReader dataSets = new CSVReader(path+"dataset1.txt");
    dataSets.read();

    // obtener tuneles
    ArrayList<Arco<Integer>> arcos = dataSets.getTuneles();
    System.out.println(arcos);

    // obtener estaciones
    ArrayList<Integer> estaciones = dataSets.getEstaciones();
    System.out.println(estaciones);






    }
}