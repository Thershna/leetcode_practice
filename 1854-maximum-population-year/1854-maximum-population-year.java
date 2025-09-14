class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[2051]; 

        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            years[birth] += 1;   
            years[death] -= 1;  
        }

        int maxPopulation = 0;
        int earliestYear = 1950;
        int currentPopulation = 0;

        for (int year = 1950; year <= 2050; year++) {
            currentPopulation += years[year]; // update population for this year

          
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                earliestYear = year;  
            }
        }

        return earliestYear;
    }
}
