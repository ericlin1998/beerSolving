import java.util.ArrayList;
import java.util.Scanner;

public class Test {
		static boolean repeat = true;
		
		public static void main (String[] args){
			Scanner console = new Scanner(System.in);
			System.out.println("Common greatest denominator of :");
			do{
				String[] str = console.nextLine().split("\\s+");
				ArrayList<Integer> nums = arrangeArray(str);
				System.out.println(nums.toString());
				//cgf(nums);
				
			}
			while(repeat);
			console.close();
		}
		
		public static ArrayList<Integer> arrangeArray(String[] str){
			ArrayList<Integer> nums = new ArrayList<Integer>();
			for(int x=0; x<str.length; x++){
				nums.add(Integer.parseInt(str[x]));
			}
			return nums;
		}
		
		//factors a number and returns a int[] of the factors
		public static int[] factor(int num){
			int temp1 = 1;
			int temp2 = 1;
			String str = "";
			for(temp1 = 1; temp1 <= num; temp1++){
				temp2 = num / temp1;
				if(temp1 * temp2 == num){
						str = str + temp1 + ", ";
					}
			}
			String[] str2 = str.split(", ");
			int[] factors = new int[str2.length];
			for(int x=0; x<str2.length; x++){
				factors[x] = Integer.parseInt(str2[x]);
			}
			return factors;
		}
		
		public static void cgf(ArrayList<Integer> list){
			ArrayList<int[]> fList = new ArrayList<int[]>();
			for(int x=0; x<list.size(); x++){
				fList.add(factor(list.get(x)));
			}
			for(int a=fList.get(0).length-1; a>-1; a--){
				for(int b=1; b<fList.length-1; b++){
					for(int c=fList.get(b); c>0; c--){
						if(fList.get(0)[a] == fList.get(b)[c]){
							
						}
					}
				}
			}
		}
		
		//prints int[] 
		public static void toString(int[] list){
			System.out.print("[" + list[0]);
			for(int x=1; x<list.length; x++){
				System.out.print(", " + list[x]);
			}
			System.out.println("]");
		}
	}	