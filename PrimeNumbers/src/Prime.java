import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {		
		primePrint(100);
		System.out.println();
		primePrint(1000);
		System.out.println();
		primePrint(10000);
		System.out.println();
		primePrint(100000);
		System.out.println();
		primePrint(1000000);
		System.out.println();
		primePrint(10000000);
		System.out.println();
		primePrint787();
		System.out.println();
		primePrint939();
	}
	
	public static void primePrint(int aLength){
		final long startTime = System.currentTimeMillis();
		ArrayList<Integer> range = new ArrayList<Integer>();
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for(int x=1; x<=aLength;x++)
			range.add(x);
		for(int x=0;x<range.size();x++){
			if((range.get(x)==2)||(range.get(x)==3)||(range.get(x)==5)||(range.get(x)==7))
				primeList.add(range.get(x));
			else if((range.get(x)%2==0)||(range.get(x)%3==0)||(range.get(x)%5==0)||(range.get(x)%7==0)){
				continue;
			}else
				primeList.add(range.get(x));				
		}
		for(int x=((primeList.size())-5);x<primeList.size();x++)
			System.out.println(primeList.get(x));
		System.out.println("number of prime numbers: "+primeList.size());
		final long endTime = System.currentTimeMillis();
		System.out.println("Total time spent finding prine numbers in a range from 1 to "+aLength+":"+(endTime - startTime)+" milliseconds");		
	}
	public static void primePrint787(){
		final long startTime = System.currentTimeMillis();
		ArrayList<Double> range = new ArrayList<Double>();
		ArrayList<Double> primeList = new ArrayList<Double>();		
		for(double x=7870000000L; x<=7879999999L;x++)
			range.add(x);
		for(int x=0;x<range.size();x++){
			if((range.get(x)==2)||(range.get(x)==3)||(range.get(x)==5)||(range.get(x)==7))
				primeList.add(range.get(x));
			else if((range.get(x)%2==0)||(range.get(x)%3==0)||(range.get(x)%5==0)||(range.get(x)%7==0)){
				continue;
			}else
				primeList.add(range.get(x));				
		}
		for(int x=0;x<5;x++)
			System.out.println(primeList.get(x));
		System.out.println();
		for(int x=((primeList.size())-5);x<primeList.size();x++)
			System.out.println(primeList.get(x));
		System.out.println("number of prime numbers: "+primeList.size());
		final long endTime = System.currentTimeMillis();
		System.out.println("Total time spent finding prine numbers in a range from 7870000000 to 7879999999:"+(endTime - startTime)+" milliseconds");
	}
	public static void primePrint939(){
		final long startTime = System.currentTimeMillis();
		ArrayList<Double> range = new ArrayList<Double>();
		ArrayList<Double> primeList = new ArrayList<Double>();		
		for(double x=9390000000L; x<=9399999999L;x++)
			range.add(x);
		for(int x=0;x<range.size();x++){
			if((range.get(x)==2)||(range.get(x)==3)||(range.get(x)==5)||(range.get(x)==7))
				primeList.add(range.get(x));
			else if((range.get(x)%2==0)||(range.get(x)%3==0)||(range.get(x)%5==0)||(range.get(x)%7==0)){
				continue;
			}else
				primeList.add(range.get(x));				
		}
		for(int x=0;x<5;x++)
			System.out.println(primeList.get(x));
		System.out.println();
		for(int x=((primeList.size())-5);x<primeList.size();x++)
			System.out.println(primeList.get(x));
		System.out.println("number of prime numbers: "+primeList.size());
		final long endTime = System.currentTimeMillis();
		System.out.println("Total time spent finding prine numbers in a range from 9390000000 to 9399999999:"+(endTime - startTime)+" milliseconds");
	}

}
