// code to convert Column title to Column Index in Excel
int titleToNumber(String A) {
        int len = A.length();
        int count = 0;
        
        for(int i=0; i<len; i++) {
            count += (A.charAt(i) - 64) * Math.pow(26,len-(i+1));
            
        }
        return count;
    }
