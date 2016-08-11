package Generics;

public class Gen<T,K extends Comparable<?>> {
	private T t;
	private K k;
	public Gen(T t, K k) {
		this.t = t;
		this.k = k;
	}
	public Gen(T t) {
		this.t = t;
	}
	public Gen(K k) {
		this.k = k;
	}
	public Gen() {}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
}
