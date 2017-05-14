package node;

public class Data<T extends Comparable<T>> implements Comparable<Data<T>> {

	private T data;
	
	public Data(T data){
		this.data = data;
	}

	/**
	 * gets data value 
	 * @return
	 */
	public T getValue() {
		return data;
	}

	@Override
	public int compareTo(Data<T> other) {
		return data.compareTo(other.getValue());
	}
	
	public String toString(){
		return data.toString();	
	}
}
