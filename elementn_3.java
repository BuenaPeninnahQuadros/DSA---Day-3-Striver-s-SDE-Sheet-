class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer> ls=new ArrayList<>();
        int ele1=0, ele2=0, cnt1=0, cnt2=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(cnt1==0 && arr[i]!=ele2){
                cnt1=1;
                ele1=arr[i];
            }
            else if(cnt2==0 && arr[i]!=ele1){
                cnt2=1;
                ele2=arr[i];
            }
            else if(ele1==arr[i]) cnt1++;
            else if(ele2==arr[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++){
            if(ele1==arr[i]) cnt1++;
            else if(ele2==arr[i]) cnt2++;
        }
        if(cnt1>Math.floor(n/3)) ls.add(ele1);
        if(cnt2>Math.floor(n/3)) ls.add(ele2);
        return ls;     
        
    }
}