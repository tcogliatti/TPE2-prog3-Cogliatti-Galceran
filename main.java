import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

    /*
    *
    * DataSet #1
    *
    */
//    String path = "datasets/dataset1.txt";
    String path = "/Users/tc/Desktop/TUDAI/2023/Programacion 3/TPE2-Daira-Tom/src/datasets/dataset1.txt";
    CSVReader dataSets = new CSVReader(path);
    dataSets.read();
    ArrayList<Arco<Integer>> arcos = dataSets.getData();
    System.out.println(arcos);
    }
}