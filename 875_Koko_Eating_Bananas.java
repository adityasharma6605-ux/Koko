class Solution {
    private Boolean isPossible(int[] piles,int h,int speed){
        for(int pile:piles){
            h-=(pile+speed-1)/speed;
        }
        return h>=0;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int miniPiles=1;
        int maxPiles=0;
        for(int pile:piles){
            maxPiles=Math.max(pile,maxPiles);
        }
        while(miniPiles<=maxPiles){
            int speed=miniPiles+(maxPiles-miniPiles)/2;
            if(isPossible(piles,h,speed)){
                maxPiles=speed-1;
            }
            else{
                miniPiles=speed+1;
            }
        }
        return miniPiles;
        
    }
}
