package Tarea1Algoritmos;

public class BruteForceSearch extends GenericTextSearch {

	@Override
	public int search(char [] patron){
		int count = 0;
		int outerCounter = this.innerText.length;
			outerCounter -= patron.length;
		int i, j;
		for(i=0; i< outerCounter; i++){
			for(j=0; j< patron.length; j++){
				count++;
				if(innerText[i+j] == patron[j]){
					continue;
				}
				else break;
			}
			if(j==patron.length){
			}
		}
		return count;
	}

	public BruteForceSearch(char [] text) {
		// TODO Auto-generated method stub
		super(text);
	}
	
	public void delete(){
		innerText = null;
	}

}
