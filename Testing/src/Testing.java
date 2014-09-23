
public class Testing {
	public static void main(String[] args){
		int beers = 20;
		int bottles = beers;
		int caps = beers;
		while(bottles>=4 || caps >=2){
			if(bottles>=4){
				beers = beers + bottles/4;
				caps = caps + bottles/4;
				bottles = bottles%4 + bottles/4;
			}
			if(caps>=2){
				beers = beers + caps/2;
				bottles = bottles + caps/2;
				caps = caps%2 + bottles/2;
			}
		}
		System.out.println(beers);
		System.out.println(bottles);
		System.out.println(caps);
	}
}
