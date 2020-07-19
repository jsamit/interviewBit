// Remove Consecutive Characters

/**
  @Parameter {
    first one - String itself
    last one - length of consecutive character to be counted
*/
public String solve(String A, int B) {
        // https://www.interviewbit.com/problems/remove-consecutive-characters/
        StringBuilder strb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < A.length(); i++) {
            j = i;
            for (j = j + 1; j < B+i; j++) {
                if (j >= A.length() || (A.charAt(j) ^ A.charAt(j - 1)) != 0)
                    break;
            }
            if (j != B+i) strb.append(A, i, j);
            i = j-1;
        }
        return strb.toString();
    }
