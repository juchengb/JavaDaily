package daily.day55;

// 605. Can Place Flowers
public class PlaceFlowers {
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
		
        for (int i = 0; i < l && n > 0; i++) {
        	if (flowerbed[i] == 1) continue;
        	
        	if (i == 0) {
        		if (l == 1 || flowerbed[i + 1] == 0) {
            		flowerbed[i] = 1;
            		n--;
            	}
        	} else if (i == (l - 1)) {
        		if (flowerbed[i - 1] == 0) {
            		flowerbed[i] = 1;
            		n--;
            	}
        	} else {
        		if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
            		flowerbed[i] = 1;
            		n--;
            	}
        	}
        }
        return (n <= 0);
    }
	
	public boolean canPlaceFlowers2(int[] flowerbed, int n) {
		for(int i = 0; i < flowerbed.length; i += 2){ 
            if(i + 1 < flowerbed.length && flowerbed[i+1] == 1){
                i++;
            }
            else if(flowerbed[i] == 0){
                n--;
                if(n <= 0)
                    return true;
            }
        }
        return n<=0;
    }
}
