//CSCI3200 - Chapter 2 Assignment 2.7
//Matthew Johnston

public class TwoDotSeven {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 100;
		int n3 = 1000;
		int n4 = 10000;

		//=========================================
		// #1
		//=========================================
		System.out.println("#1 Runtimes: ");
		//#1 n1
		long startTime = System.nanoTime();
		int sum = 0;
		for(int i = 0; i < n1; i++){
			sum++;
		}
		long endTime = System.nanoTime();
	
		String output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n1: " + output + " seconds.");

		//#1 n2
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n2; i++){
			sum++;
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n2: " + output + " seconds.");

		//#1 n3
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n3; i++){
			sum++;
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n3: " + output + " seconds.");

		//#1 n4
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n4; i++){
			sum++;
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n4: " + output + " seconds.");

		//=========================================
		// #2
		//=========================================
		System.out.println("#2 Runtimes: ");
		//#2 n1
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n1; i++){
			for(int j = 0; j < n1; j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n1: " + output + " seconds.");

		//#2 n2
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n2; i++){
			for(int j = 0; j < n2; j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n2: " + output + " seconds.");

		//#2 n3
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n3; i++){
			for(int j = 0; j < n3; j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n3: " + output + " seconds.");

		//#2 n4
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n4; i++){
			for(int j = 0; j < n4; j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n4: " + output + " seconds.");

		//=========================================
		// #3
		//=========================================
		System.out.println("#3 Runtimes: ");
		//#3 n1
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n1; i++){
			for(int j = 0; j < (n1 * n1); j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n1: " + output + " seconds.");

		//#3 n2
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n2; i++){
			for(int j = 0; j < (n2 * n2); j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n2: " + output + " seconds.");

		//#3 n3
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n3; i++){
			for(int j = 0; j < (n3 * n3); j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n3: " + output + " seconds.");

		//#3 n4
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n4; i++){
			for(int j = 0; j < (n4 * n4); j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n4: " + output + " seconds.");

		//=========================================
		// #4
		//=========================================
		System.out.println("#4 Runtimes: ");
		//#4 n1
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n1; i++){
			for(int j = 0; j < i; j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n1: " + output + " seconds.");

		//#4 n2
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n2; i++){
			for(int j = 0; j < i; j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n2: " + output + " seconds.");

		//#4 n3
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n3; i++){
			for(int j = 0; j < i; j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n3: " + output + " seconds.");

		//#4 n4
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n4; i++){
			for(int j = 0; j < i; j++){
				sum++;
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n4: " + output + " seconds.");

		//=========================================
		// #5
		//=========================================
		System.out.println("#5 Runtimes: ");
		//#5 n1
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n1; i++){
			for(int j = 0; j < (i*i); j++){
				for(int k = 0; k < j; k++){
					sum++;
				}
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n1: " + output + " seconds.");

		//#5 n2
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n2; i++){
			for(int j = 0; j < (i*i); j++){
				for(int k = 0; k < j; k++){
					sum++;
				}
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n2: " + output + " seconds.");

		//#5 n3
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n3; i++){
			for(int j = 0; j < (i*i); j++){
				for(int k = 0; k < j; k++){
					sum++;
				}
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n3: " + output + " seconds.");

		//#5 n4
		/*
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n4; i++){
			for(int j = 0; j < (i*i); j++){
				for(int k = 0; k < j; k++){
					sum++;
				}
			}
		}
		endTime = System.nanoTime();
		*/
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n4: 30+ seconds.");

		//=========================================
		// #6
		//=========================================
		System.out.println("#6 Runtimes: ");
		//#6 n1
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n1; i++){
			for(int j = 0; j < (i*i); j++){
				if(j % i == 0){
					for(int k = 0; k < j; k++){
						sum++;
					}
				}
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n1: " + output + " seconds.");

		//#6 n2
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n2; i++){
			for(int j = 0; j < (i*i); j++){
				if(j % i == 0){
					for(int k = 0; k < j; k++){
						sum++;
					}
				}
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n2: " + output + " seconds.");

		//#6 n3
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n3; i++){
			for(int j = 0; j < (i*i); j++){
				if(j % i == 0){
					for(int k = 0; k < j; k++){
						sum++;
					}
				}
			}
		}
		endTime = System.nanoTime();
	
		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n3: " + output + " seconds.");

		//#6 n4
		/*
		startTime = System.nanoTime();
		sum = 0;
		for(int i = 0; i < n4; i++){
			for(int j = 0; j < (i*i); j++){
				if(j % i == 0){
					for(int k = 0; k < j; k++){
						sum++;
					}
				}
			}
		}
		endTime = System.nanoTime();
		*/

		output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		System.out.println("n4: 30+ seconds.");
	}
}