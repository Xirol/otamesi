package porker2;

public class Card {
	String name;
	String suit;
	int num ;


Card(String name,String suit,int num ){
		this.name=name;
		this.suit=suit;
		this.num=num;

	}


public  static int[][] cards(int[][] card) {
	        int[][] ReCards=new int[52][3];

			for(int i =0;i<11;i++){
				int n= new java.util.Random().nextInt(52-i);
				int m=51-i;
				int[] FA  ;
				FA=card[n];
				card[n]=card[m];
				card[m]=FA;
			}

			for(int i=0;i<card.length;i++){
				for(int m=0;m<3;m++){
					ReCards[51-i][m]=card[i][m];
				}
			}
			return ReCards;
	}
public  static int[][] Tre(int[][] card,int c1) {
	int[][] ReCards=new int[52][3];
	int n= new java.util.Random().nextInt(42)+10;
	int[] FA  ;
	FA=card[n];
	card[n]=card[c1];
	card[c1]=FA;

	for(int i=0;i<card.length;i++){
		for(int m=0;m<3;m++){
			ReCards[i][m]=card[i][m];
		}

	}return ReCards;


}




	}



