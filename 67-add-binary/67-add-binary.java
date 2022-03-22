class Solution {
    public String addBinary(String A, String B) {
        int endIndexA = A.length()-1;
        int endIndexB = B.length()-1;
        int carry = 0, presentSum = 0;
        String sum = "";
        while(endIndexA>=0 && endIndexB>=0){
            int currA = Character.getNumericValue(A.charAt(endIndexA));
            int currB = Character.getNumericValue(B.charAt(endIndexB));
            presentSum = (carry + currA + currB)%2;
            carry = (carry+currA+currB)/2;
            sum = presentSum + sum;
            endIndexB--;
            endIndexA--;
        }
        while(endIndexA>=0){
            int currA = Character.getNumericValue(A.charAt(endIndexA));
            presentSum = (carry + currA)%2;
            carry = (carry+currA)/2;
            sum = presentSum + sum;
            endIndexA--;
        }
        while(endIndexB>=0){
            int currB = Character.getNumericValue(B.charAt(endIndexB));
            presentSum = (carry + currB)%2;
            carry = (carry+currB)/2;
            sum = presentSum + sum;
            endIndexB--;
        }
        if(carry == 1)
            sum = "1" + sum;
        return sum;
    }
}