import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
	private String path;

	private ArrayList<Arco<Integer>> tuneles;
	private ArrayList<Integer> estaciones;
	public CSVReader(String path) {
		this.path = path;
		this.tuneles = new ArrayList<>();
		this.estaciones = new ArrayList<>();
	}
	public void read() {
		
		// Obtengo una lista con las lineas del archivo
		// lines.get(0) tiene la primer linea del archivo
		// lines.get(1) tiene la segunda linea del archivo... y así
		ArrayList<String[]> lines = this.readContent();
		
		for (String[] line: lines) {
			// Cada linea es un arreglo de Strings, donde cada posicion guarda un elemento
			Integer origen = Integer.parseInt(line[0].trim().substring(1));
			Integer destino = Integer.parseInt(line[1].trim().substring(1));
			Integer etiqueta = Integer.parseInt(line[2].trim());

			// Aca instanciar lo que necesiten en base a los datos leidos
			// Opcion (A) trabajar con los arcos y los vertices en listas separadas
			Arco<Integer> tunel = new Arco<>(origen,destino,etiqueta);
			this.tuneles.add(tunel);
		}
		
	}
	public ArrayList<Arco<Integer>> getTuneles(){
		return new ArrayList<Arco<Integer>>(this.tuneles);
	}
	public ArrayList<Integer> getEstaciones(){
		for(Arco<Integer> tunel : tuneles){
			if(!this.estaciones.contains(tunel.getVerticeOrigen()))
				this.estaciones.add(tunel.getVerticeOrigen());
			if(!this.estaciones.contains(tunel.getVerticeDestino()))
				this.estaciones.add(tunel.getVerticeDestino());
		}
		return new ArrayList<Integer>(this.estaciones);
	}

	private ArrayList<String[]> readContent() {
		ArrayList<String[]> lines = new ArrayList<String[]>();

		File file = new File(this.path);
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				line = line.trim();
				lines.add(line.split(";"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (bufferedReader != null)
				try {
					bufferedReader.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}
		
		return lines;
	}



}
