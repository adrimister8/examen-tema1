package es.iesvegademijas.genericos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Bag<E> {
	
	private List<E> bolsa;
	
	public Bag() {
		bolsa = new ArrayList<E>();
	}
	
	public void add(E e) {
		bolsa.add(e);
	}
	
	public void add(E e, int n) {
		for (int i = n; i > 0; i++) {
			bolsa.add(e);
		}
	}
	
	public int getCount(E e) {
		int cont = 0;
		for (int i = 0; i < bolsa.size(); i++) {
			if(bolsa.get(i)==e) {
				cont++;
			}
		}
		return cont;
	}
	
	public void remove(E e) {
		bolsa.remove(e);
	}
	
	public void remove(E e, int n) {
		for (int i = n; i > 0; i++) {
			bolsa.remove(e);
		}
	}
	
	public int size() {
		return bolsa.size();
	}
	
	public Set<E> uniqueSet(){
		Set<E> unicos = new HashSet<E>();
		for (int i = 0; i < bolsa.size(); i++) {
			unicos.add(bolsa.get(i));
		}
		return unicos;
	}
	
	public String toString() {
		return bolsa.toString();
	}
}
