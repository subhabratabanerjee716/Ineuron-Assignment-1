package iNeuron;

public class PatternAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		questionTwo();
		
		System.out.println();
		
		questionThree();
		
		System.out.println();
		
		questionFour();
		
		System.out.println();
		
		questionFive();
	}
	
	public static void questionFive() {
		
		
		for(int i=0;i<=0;i++) {
			
			for(int j=0;j<=13;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		for(int i=0;i<=5;i++) {
			
			for(int j=5-i;j>=0;j--) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		for(int i=0;i<=5;i++) {
			
			for(int j=0;j<=i;j++) {
				
				
				System.out.print("*");
				
			}
			
				System.out.println();
			
		}
		
	for(int i=0;i<=0;i++) {
			
			for(int j=0;j<=13;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		
	}
	public static void questionFour() {
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int n=5;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<=i;j++) {
			
				System.out.print("*");
			
			}
			
			for(int j=n;j>=i;j--) {
				
				System.out.print(" ");
				
			}
			for(int j=n;j>=i;j--) {
				
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		for(int i=0;i<=1;i++) {
			
			
			for(int j=0;j<14;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		
		
	}
	
	
	public static void questionTwo() {
		
		int counter=1;
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++) {
				
				
				System.out.print(counter);
				
			}
			counter++;
			
			System.out.println();
			
		}
		
		
	}
	
	
	public static void questionThree() {
		
		int n=14;
		
		int j=0;
		
		for(int i=0;i<n;i++) {
			
		if(i==0) {
			
			while(j<n) {
				
				System.out.print("*");
				
				j++;
				
			}
			
			System.out.println();
			j=0;
		}
		if(i==1) {
			
			while(j<=n) {
				
				if(j==6) {
				
				System.out.print(" ");
				
				j++;
				
				}else {
					
					System.out.print("*");
					
				}
				j++;
				
			}
			
			System.out.println();
			j=0;
		}
		if(i==2) {
				
				while(j<n) {
					
					if(j==5||j==6||j==7) {
						
						System.out.print(" ");
						j++;
						
					}else {
					
					System.out.print("*");
					
					j++;
					}
				}
				
				System.out.println();
				j=0;
			}
		if(i==3) {
	
			while(j<n) {
				
				if(j==4||j==5||j==6||j==7||j==8) {
					
					System.out.print(" ");
					j++;
					
				}else {
				
				System.out.print("*");
				
				j++;
				}
			}
			
			System.out.println();
			j=0;
			}
		if(i==4) {
			
			while(j<n) {
				
				if(j==3||j==4||j==5||j==6||j==7||j==8||j==9) {
					
					System.out.print(" ");
					j++;
					
				}else {
				
				System.out.print("*");
				
				j++;
				}
			}
			
			System.out.println();
			j=0;
			}
		if(i==5) {
			
			while(j<n) {
				
				if(j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9||j==10) {
					
					System.out.print(" ");
					j++;
					
				}else {
				
				System.out.print("*");
				
				j++;
				}
			}
			
			System.out.println();
			j=0;
			}
		if(i==6) {
			
			while(j<n) {
				
				if(j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9||j==10||j==11) {
					
					System.out.print(" ");
					j++;
					
				}else {
				
				System.out.print("*");
				
				j++;
				}
			}
			
			System.out.println();
			j=0;
			}

			
		if(i>=7 && i<=12) {
			
			for(int k=0;k<n;k++) {
				
				if(k==0||k==n-1) {
					
					System.out.print("*");
					
				}else {
					
					
					System.out.print(" ");
					
				}
				
				
			} 
			
				System.out.println();
		}
		
		
		if(i==n-1) {
			
			for(int k=0;k<n;k++) {
				
				System.out.print("*");
				
				
			}
			
			
		}
		
		}
		
		
		
	}

}
