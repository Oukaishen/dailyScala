object Solution {
    def increasingTriplet(nums: Array[Int]): Boolean = {
        var small = Integer.MAX_VALUE
        var big = Integer.MAX_VALUE
        for(num <- nums){
        	if (num <= small){
        		small = num
        	}
        	else if (num <= big){
        		big = num
        	}
        	else{
        		return true
        	}
        }
        return false
    }
}