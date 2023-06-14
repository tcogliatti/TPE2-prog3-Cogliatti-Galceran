/*
 * La clase arco representa un arco del grafo. Contiene un vertice origen, un vertice destino y una etiqueta.
 * Nota: Para poder exponer los arcos fuera del grafo y que nadie los modifique se hizo esta clase inmutable
 * (Inmutable: una vez creado el arco no es posible cambiarle los valores).
 */
public class Arco<T> {

	private int verticeOrigen;
	private int verticeDestino;
	private T etiqueta;

	public Arco(int verticeOrigen, int verticeDestino, T etiqueta) {
		this.verticeOrigen = verticeOrigen;
		this.verticeDestino = verticeDestino;
		this.etiqueta = etiqueta;
	}
	
	/**
	* Complejidad: O(1)	debido a que debe
	* tomar el valor  del arco instanciado.
	*/
	public int getVerticeOrigen() {
		return verticeOrigen;
	}
	
	/**
	* Complejidad: O(1)	debido a que debe
	* tomar el valor del arco instanciado.
	*/
	public int getVerticeDestino() {
		return verticeDestino;
	}
	/**
	* Complejidad: O(1)	debido a que debe
	* tomar el valor del arco instanciado.
	*/
	public T getEtiqueta() {
		return etiqueta;
	}

    @Override
	public String toString(){
		return  "{ "+ this.getVerticeOrigen() + " , " + this.getVerticeDestino() + " , "+ this.getEtiqueta()+ " }";
	}


}