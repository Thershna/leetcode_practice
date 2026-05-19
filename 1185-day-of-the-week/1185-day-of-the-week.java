class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] week={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] daysinmonth={31,28,31,30,31,30,31,31,30,31,30,31};
        int totaldays=0;
        for(int i=1971;i<year;i++){
            totaldays+=365;
            if((i%4==0 && i%100!=0)|| (i%400==0)){
                totaldays+=1;

            }
        }
        for(int i=0;i<month-1;i++){
            totaldays+=daysinmonth[i];

            if(i==1 && ((year%4==0 && year%100!=0)|| (year%400==0))){
                totaldays+=1;
            }
        }
        totaldays+=day;
        int index=(totaldays+4)%7;

        return week[index];
    }
}