package com.my.topcoder;

/**
 * Created by muhamad on 26/09/16.
 */
public class BinPacking {

    public int minBins(int[] item){
        int c = 300;
        int binRemaining = c;
        int bin = 0;

        for (int i = 0; i < item.length; i++) {
            int x = 0;
            if(i+1 > item.length-1) {
                x = item[i];
            }else{
                x = item[i]+item[i+1];
            }

            if (x >= 100 && x <= 300) {
                bin++;
            }
        }

        return bin;
    }

    public static void main(String[] args){
        int[] item = {150,150,150,150,150};
        BinPacking bp = new BinPacking();
        int minimumBin = bp.minBins(item);
        System.out.println(minimumBin);
    }
}
