public class binaryserach1 {
    public static void main(String args[])
    {
        
        int[]number={1,3,4,5,6,7,9,11};
        System.out.print(binarysearch(number,9));
    }
    



    private static int binarysearch (int[]number,int numtofind)
    {
     int low=0;
     int high=number.length-1;
     while(low<=high){
        int middleposition=(low+high)/2;
        int middlenumber=number[middleposition];

        if(numtofind==middlenumber){
            return middleposition;
        }
        else if(numtofind<=middlenumber){
            high=middleposition-1;

        }
        else{
           low=middleposition+1;
        }
     }
     return -1;
    }
}
