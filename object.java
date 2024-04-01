public static boolean hasOdd(Set<Integer> set){
    if (set.isEmpty()) {
        return false;
    }
    for(num : set){
        if(num % 2 != 0){
            return true;
        }
    }
    else{
        return false;
    }
} 