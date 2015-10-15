package Tarea1Algoritmos;

public class KnuthMorrisPrattSearch extends GenericTextSearch {

	
	protected int f(char [] patron, int [] f){
		int m = patron.length;
		f[0]=0;
		int j=0;
		int i;
		int count= 0;
		while (j < m){
			i=f[j];
			while (i > 0){
				count++;
				if(patron[i] == patron[j]) break;
				i=f[i];
			}
			count++;
			if (patron[i]==patron[j]){
				f[j]=i;
			}
			else{
				f[j]=0;
			}
			j++;
		}
		return count;
	}
	
	@Override
	public int search(char [] patron){
		int n = innerText.length;
		int m = patron.length;
		int k=0;
		int j=0;
		int [] f = new int[m];
		int count = f(patron, f); 
		while (k < n && j < m){
			while (j>0){
				count++;
				if(innerText[k]==patron[j]) break;
				j=f[j];
			}
			count++;
			if (innerText[k] == patron[j]){
				j++;
			}
			k++;
		}
		// j==m => calce, j el patron estaba en el texto
		return count;
	}
	
	public KnuthMorrisPrattSearch(char[] text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public void delete(){
		innerText = null;
	}
}
