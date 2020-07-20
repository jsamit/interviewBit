public int solve(ArrayList<Integer> A) {
        Integer numbers[] = A.toArray(new Integer[0]);
        
        int postEvenSum = 0;
        int postOddSum = 0;
        int preEvenSum = 0;
        int preOddSum = 0;
        
        int len = numbers.length;
        int count = 0;
        for(int i=0,j=1; i<len; i+=2,j+=2) {
        	if(i<len) postEvenSum += numbers[i];
        	if(j<len) postOddSum += numbers[j];
        }
        
        for(int i=0;i<len; i++) {
        	if(i%2 == 0) postEvenSum -= numbers[i];
        	else postOddSum -= numbers[i];
        	
        	if(postEvenSum + preOddSum == postOddSum + preEvenSum) count++;
        	
        	if(i%2 == 0) preEvenSum += numbers[i];
        	else preOddSum += numbers[i];
        	
        }
        return count;
    }
