 import java.util.*;


public class Main{

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		String inputString = new String();

			inputString = s.nextLine();

			

			InfixCalc in = new InfixCalc(inputString);

			//계산기 프로그램!!

			

			in.findOrder();

			System.out.println("=> "+in.returnResult());

		}

	}



출처: http://webclass.tistory.com/60 [Welcome PHP World!!!!]
