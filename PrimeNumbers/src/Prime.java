import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		System.out.println("starting");
		ArrayList<Integer> primess = new ArrayList<Integer>();
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for(int x=0;x<=10000000;x++){
			primess.add(x);
		}
		for(int x=0;x<primess.size();x++){
			if(((primess.get(x)==2)||(primess.get(x)==3)||(primess.get(x)==5)||(primess.get(x)==7))){
				primeList.add(primess.get(x));

			}
			else if((primess.get(x)%2==0 || primess.get(x)%3==0 || primess.get(x)%5==0 ||primess.get(x)%7==0))
				continue;
			else
				primeList.add(primess.get(x));
		}

	}

}
