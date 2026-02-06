public class ContestantSorter {
    // TODO: Implement selection sort using compareTo
    // Sort in the order determined by compareTo (highest scores first)
       
    
    // Return -1 if this contestant's score is higher, 1 if lower, 0 if equal

    public static void sortByScore(Contestant[] contestants) {
        // Your code here
        for(int i=0;i<contestants.length-1;i++){
            int m = i;
            for(int x=i+1;x<contestants.length;x++){
                if(contestants[i].compareTo(contestants[x])<0){
                    m=x;
                }
            }     
            Contestant temp = contestants[i];
            contestants[i] = contestants[m];
            contestants[m]=temp;              
        }

    }
}
