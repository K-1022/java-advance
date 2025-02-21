package java_advance;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Advance1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("学生の名前を入力してください");
		
		String name = scanner.nextLine();

		
		System.out.println(name + "さんのテストの点数を入力してください");
		
		int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println(name +"さんの評価は5");
		} else if(score >= 70) {
			System.out.println(name +"さんの評価は4");
		}  else if(score >= 50) {
			System.out.println(name +"さんの評価は3");
		}  else if(score >= 30) {
			System.out.println(name +"さんの評価は2");
		} else {
			System.out.println(name +"さんの評価は1");
		}
		
	     scanner.nextLine();
		
		System.out.println("入力を続けますか？（yes/no）");
		
		String continueString = scanner.nextLine();
		
		if(continueString.equals("no")){
			
			 Map<Integer,Integer> EvaluatePeople = new HashMap<Integer,Integer>();
			 int[] scoreArray = { 0, 0, 0, 0, 0};
			
			for(int i = 0; i >  ; i++) {
				EvaluatePeople.put(score,0);
				   
					 
				     if(score >= 90) {
				    	 EvaluatePeople.put(score,++scoreArray[0]);
				    	 System.out.println("5:" + +EvaluatePeople.get(score) + "人");
				    	 System.out.println(+scoreArray[0]);
				    	 
				     } else if(score >= 70) {
				    	 EvaluatePeople.put(score,++scoreArray[1]);
				    	 System.out.println("4:" + +EvaluatePeople.get(score) + "人");
				    	 System.out.println(+scoreArray[1]);
				    	
				     } else if(score >= 50) {
				    	 EvaluatePeople.put(score,++scoreArray[2]);
				    	 System.out.println("3:" + +EvaluatePeople.get(score) + "人");
				    	 System.out.println(+scoreArray[2]);
				    	 
				     } else if(score >= 30) {
				    	 EvaluatePeople.put(score,++scoreArray[3]);
				    	 System.out.println("2:" + +EvaluatePeople.get(score) + "人");
				    	 System.out.println(+scoreArray[3]);
				    	 
				     } else if(score <= 30){
				    	 EvaluatePeople.put(score,++scoreArray[4]);
				    	 System.out.println("1:" + +EvaluatePeople.get(score) + "人");
				    	 System.out.println(+scoreArray[4]);
				     }
			    }
			break;
		     }
		  }
	     scanner.close();	
      }
  }


//# 練習2
//- 繰り返し入力が出来るようにする
//- 評価表示後に、下記を表示する
//  - 「入力を続けますか？（yes/no）」
//- yes以外が入力されるまで、名前と点数の入力を受け付ける
//- 名前と点数の入力が終わったら、それぞれの評価の人数を表示する
//  - 例：「5: X人」
//- 補習が必要な人数を表示する
//  - 「夏休みの補習の対象は、X人です」
//  - 評価2以下で、補習の対象とする


//# 練習1
//- 名前を入力を受け付ける
//  - 「学生の名前を入力してください」
//- 点数を入力を受け付ける
//  - 「〇〇さんのテストの点数を入力してください」
//- 点数に基づいて、評価を表示する
//  - 90点以上: 〇〇さんの評価は5
//  - 70点以上: 〇〇さんの評価は4
//  - 50点以上: 〇〇さんの評価は3
//  - 30点以上: 〇〇さんの評価は2
//  - 30点未満: 〇〇さんの評価は1

