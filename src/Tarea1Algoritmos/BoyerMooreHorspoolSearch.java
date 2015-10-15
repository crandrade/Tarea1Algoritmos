package Tarea1Algoritmos;

public class BoyerMooreHorspoolSearch extends GenericTextSearch {

	protected int next(char c, char[] patron){
		for(int i=(patron.length)-2; i>0; i--){
			if(patron[i]==c) return i;
		}
		return 0;
	}
	
	@Override
	public int search(char [] patron){
		int m = patron.length-1;
		int n = innerText.length-1;
		int count = 0;
		int _next = 0;
		for(int k=m, j=m; k<=n && j>=0;){
			count++;	
			if (innerText[k-(m-j)]==patron[j]){
				j--;
			}
			else{
				_next = next(innerText[k], patron);
				count += m - _next;
				k=k+(m-_next);
				j=m;
			}
		}
		return count;
	}
	
	public BoyerMooreHorspoolSearch(char[] text) {
		super(text);
	}
	public void delete(){
		innerText = null;
	}
}
