class NumberOfEmployeesWhoMetTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] hours={0,2,1,3,4,6};
        int target=2;
        NumberOfEmployeesWhoMetTarget s=new NumberOfEmployeesWhoMetTarget();
        System.out.println(s.numberOfEmployeesWhoMetTarget(hours,target));
        
    }
}