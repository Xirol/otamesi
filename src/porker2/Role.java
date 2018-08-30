package porker2;

public class Role {
	static int role(int[][] Hand){
		/*int m
		 * Hand[][2]：カードの数値=m
		 * Hand[][1]：スード=j

		 * 0:ハイカード
		 *!1:ワンペア m1==m2
		 * !2:ツーペア m1==m2&&m3==m4
		 * !3:スリーカードm1==m2==m3
		 * 4:ストレート　5(m+2)
		 * 5:フラッシュ　j1==j2==j3==j4==j5:Flash
		 * !6:フルハウス
		 * !7:フォーカード
		 * 8:ストレートフラッシュ　5(m+2)&&j1==j2==j3==j4==j5:Flash
		 * */
		for (int i=0;i<Hand.length;i++) {
			for (int j=i+1;j<Hand.length;j++) {
			if (Hand[i][2]<Hand[j][2]) {
			int t = Hand[i][2];
			Hand[i][2] = Hand[j][2];
			Hand[j][2] = t;
			}
			}
			}
	int RP=0;
	int SS=0; int SH=0; int SC=0; int SD=0;
	int[] SA={SS,SH,SC,SD};
	int FL=0;
	int A1=0;int A2=0;int A3=0;int A4=0;int A5=0;int A6=0;
	int A7=0;int A8=0;int A9=0;int A10=0;int A11=0;int A12=0;int A13=0;

	int P=0;int Th=0;int FC=0;
	int St=0;
	for(int i=0;i<Hand.length;i++){
		if(Hand[i][1]==1){
			SS++;
			}else if(Hand[i][1]==2){
			SH++;
			}else if(Hand[i][1]==3){
			SC++;
			}else if(Hand[i][1]==4){
			SD++;
			}
		}
	for(int i:SA){
		if(i==5){
			FL=1;
		}
	}
	for(int i=0;i<5;i++){
		int m=Hand[i][2];

		if(m==1){A1=A1+1;}
		else if(m==2){A2=A2+1;}
		else if(m==3){A3=A3+1;}
		else if(m==4){A4=A4+1;}
		else if(m==5){A5=A5+1;}
		else if(m==6){A6=A6+1;}
		else if(m==7){A7=A7+1;}
		else if(m==8){A8=A8+1;}
		else if(m==9){A9=A9+1;}
		else if(m==10){A10=A10+1;}
		else if(m==11){A11=A11+1;}
		else if(m==12){A12=A12+1;}
		else if(m==13){A13=A13+1;}
	}
	int[] As={A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13};
	for(int i:As){
		switch(i){
		case 2:P+=1;break;
		case 3:Th+=1;break;
		case 4:FC+=1;break;
		}
	}
	if((Hand[0][2]+1==Hand[1][2])&&(Hand[0][2]+2==Hand[2][2])
	&&(Hand[0][2]+3==Hand[3][2])&&(Hand[0][2]+4==Hand[4][2])){
		St=1;
	}
if((FL==1)&&(St==1)){
	RP=8;System.out.println("ストレートフラッシュ");
}else if(FC==1){
	RP=7;System.out.println("フォーカード");
}else if((Th==1)&&(P==1)){
	RP=6;System.out.println("フルハウス");
}else if(FL==1){
	RP=5;System.out.println("フラッシュ");
}else if(St==1){
	RP=4;System.out.println("ストレート");
}else if(Th==1){
	RP=3;System.out.println("スリーカード");
}else if(P==2){
	RP=2;System.out.println("ツーペア");
}else if(P==1){
	RP=1;System.out.println("ワンペア");
}else{System.out.println("ハイカード");

}

return RP;
	}
	}