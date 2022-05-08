package pris.greedy;

public class MinimumCosttoMoveChipstoTheSamePosition1217 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int eve = 0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==1){
                odd++;
            }else{
                eve++;
            }
        }
        return Math.min(odd, eve);
    }
}
