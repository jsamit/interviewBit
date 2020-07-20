public int solve(ArrayList<Integer> A) {
        Integer numbers[] = A.toArray(new Integer[0]);
        
        int postEvenSum = 0;
        int postOddSum = 0;
        int preEvenSum = 0;
        int preOddSum = 0;
        
        int len = numbers.length;
        int count = 0;
        
        // calculating total even and odd position sum as postEvenSum && postOddSum 
        for(int i=0,j=1; i<len; i+=2,j+=2) {
        	if(i<len) postEvenSum += numbers[i];
        	if(j<len) postOddSum += numbers[j];
        }
        
        // now if element is on even postion substract from posteven and if postEvenSum + preOddSum == postOddSum + preEvenSum success condition see below example
        for(int i=0;i<len; i++) {
        	if(i%2 == 0) postEvenSum -= numbers[i];
        	else postOddSum -= numbers[i];
        	
        	if(postEvenSum + preOddSum == postOddSum + preEvenSum) count++;
        	
        	if(i%2 == 0) preEvenSum += numbers[i];
        	else preOddSum += numbers[i];
        	
        }
        return count;
    }

/*
[5 5 2 5 8]
now if we removing odd position 5
then preEven = 5
        preOdd = 0
        postEven = 10
        postOdd = 5
        
        preEven + postOdd = 5+5 = 10
        preOdd + postEven = 0+10 = 10
        
        [5 x 2 5 8] = [10,10] = balanced
 */
