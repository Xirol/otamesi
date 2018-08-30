package porker2;

public class Main {

	public static void main(String[] args) {

		int[][] Cards ={{1,1,1},{2,1,2},{3,1,3},{4,1,4},{5,1,5},{6,1,6},{7,1,7},{8,1,8},{9,1,9},{10,1,10},{11,1,11},{12,1,12},{13,1,13},
						{14,2,1},{15,2,2},{16,2,3},{17,2,4},{18,2,5},{19,2,6},{20,2,7},{21,2,8},{22,2,9},{23,2,10},{24,2,11},{25,2,12},{26,2,13},
						{27,3,1},{28,3,2},{29,3,3},{30,3,4},{31,3,5},{32,3,6},{33,3,7},{34,3,8},{35,3,9},{36,3,10},{37,3,11},{38,3,12},{39,3,13},
						{40,4,1},{41,4,2},{42,4,3},{43,4,4},{44,4,5},{45,4,6},{46,4,7},{47,4,8},{48,4,9},{49,4,10},{50,4,11},{51,4,12},{52,4,13}};
		int[][] Hands=Card.cards(Cards);
		int RH=0;
		int[][] YH={Hands[1],Hands[3],Hands[5],Hands[7],Hands[9]};

		for(int i=0;i<10;i+=2){

			switch(Hands[i][1]){
			case 1:System.out.println((i/2+1)+":"+"スペードの"+Hands[i][2]);break;
			case 2:System.out.println((i/2+1)+":"+"ハートの"+Hands[i][2]);break;
			case 3:System.out.println((i/2+1)+":"+"クラブの"+Hands[i][2]);break;
			case 4:System.out.println((i/2+1)+":"+"ダイヤの"+Hands[i][2]);break;
			}
		}
		int[][] NHand=new int[52][3];
		System.out.println("３枚までカードを交換できます。");
		System.out.println("交換するカードの番号を入力してください");
		System.out.println("交換しない場合は０を入力してください");
		for(int i=1;i<=3;i++){
		System.out.println(i+"枚目");
		int C=new java.util.Scanner(System.in).nextInt();
		if(C==0){break;}else{NHand=Card.Tre(Hands,(C-1)*2);
		RH=0;
		}
		}
		int[][] MH1={NHand[0],NHand[2],NHand[4],NHand[6],NHand[8]};
		int[][] MH2={Hands[0],Hands[2],Hands[4],Hands[6],Hands[8]};

		if(RH==0){
			for(int i=0;i<5;i++){

				switch(MH2[i][1]){
				case 1:System.out.println((i)+":"+"スペードの"+MH2[i][2]);break;
				case 2:System.out.println((i)+":"+"ハートの"+MH2[i][2]);break;
				case 3:System.out.println((i)+":"+"クラブの"+MH2[i][2]);break;
				case 4:System.out.println((i)+":"+"ダイヤの"+MH2[i][2]);break;
				}}
			}else if(RH==1){
				for(int i=0;i<5;i++){

					switch(Hands[i][1]){
					case 1:System.out.println((i)+":"+"スペードの"+MH1[i][2]);break;
					case 2:System.out.println((i)+":"+"ハートの"+MH1[i][2]);break;
					case 3:System.out.println((i)+":"+"クラブの"+MH1[i][2]);break;
					case 4:System.out.println((i)+":"+"ダイヤの"+MH1[i][2]);break;
					}
				}
			}



		int MRP=0;
		if(RH==1){MRP=Role.role(MH1);
		}else{MRP=Role.role(MH2);

		}


		System.out.println(" ");
		for(int i=1;i<10;i+=2){
			switch(Hands[i][1]){
			case 1:System.out.println((i/2+1)+":"+"スペードの"+Hands[i][2]);break;
			case 2:System.out.println((i/2+1)+":"+"ハートの"+Hands[i][2]);break;
			case 3:System.out.println((i/2+1)+":"+"クラブの"+Hands[i][2]);break;
			case 4:System.out.println((i/2+1)+":"+"ダイヤの"+Hands[i][2]);break;
			}
		}

		int YRP=Role.role(YH);

		if(MRP>YRP){
			System.out.println("あなたの勝ち");
		}else if(MRP==YRP){
			System.out.println("引き分け");
		}else{
			System.out.println("あなたの負け");
		}

		}
    	}
