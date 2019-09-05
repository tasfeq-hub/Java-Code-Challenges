package com.tasfeq;

public class Main {

    public static void main(String[] args) {
        canPack(-3,2,12) ;
    }

    public static int canPack(int bigCount, int smallCount, int goal){

            int bigCountWeight=5;
            int smallCountWeight=1;
            boolean bigCountFlag;
            boolean smallCountFlag;

            int totalBigCountWeight = bigCount*bigCountWeight;
            int totalSmallCountWeight = smallCount*smallCountWeight;
            int totalWeight= totalBigCountWeight+totalSmallCountWeight;

            if(bigCount>=0 && totalBigCountWeight>goal){
                bigCountFlag = false;
            }else if(bigCount>=0 && totalBigCountWeight<=goal) {
                bigCountFlag= true;
            }else{
                bigCountFlag=false;
            }

            if(smallCount>=0 && totalSmallCountWeight>goal){
                smallCountFlag = true;
            }else if(smallCount>=0 && totalSmallCountWeight<=goal) {
                smallCountFlag= true;
            }else{
                smallCountFlag=false;
            }

            if( bigCountFlag && smallCountFlag && totalWeight<=goal){
                System.out.println("true");
                return 1;
            }else if(bigCountFlag && smallCountFlag && totalWeight>=goal){
                System.out.println("true");
                return 1;
            }else {
                System.out.println("false");
                return 0;
            }
    }

}
