class Data{
    int st;
    int e;
    int pos;
    public Data(int a,int b,int c){
        st=a;
        e=b;
        pos=c;
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        Data[] arr=new Data[start.length];
        for(int i=0;i<start.length;i++){
            arr[i]=new Data(start[i],end[i],i+1);
        }
        Arrays.sort(arr,Comparator.comparingInt(o->o.e));
        int count=1;
        int ftime=arr[0].e;
        for(int i=1;i<start.length;i++){
            if(arr[i].st>ftime){
                count+=1;
                ftime=arr[i].e;
            }
        }
        return count;
        
        
    }
}
