class Batsman2 {

    public static void main(String args[]) {

        int total = 0,count_0s = 0, count_1s = 0, count_2s = 0, count_3s = 0;
        int count_4s = 0, count_6s = 0;
        double averageRuns,strikeRate1,strikeRate2,strikeRate3,strikeRate4,strikeRate5,averageSR;
        int total_innings1 = 0,total_innings2 = 0,total_innings3 = 0,total_innings4 = 0,total_innings5 = 0;
        
        int[] runs = new int[150];

        for (int i = 0; i < runs.length; i++) {
            runs[i] = (int) (Math.random() * 7);
        }

        for (int i = 0; i < runs.length; i++) {
            
            if(i<30) {
            	total_innings1+=runs[i];
            }
            else if(i<60) {
            	total_innings2+=runs[i];
            }
            else if(i<90) {
            	total_innings3+=runs[i];
            }
            else if(i<120) {
            	total_innings4+=runs[i];
            }
            else if(i<150) {
            	total_innings5+=runs[i];
            }
            switch(runs[i]) {
            case 0:
                count_0s+=1;
                break;
            case 1:
                count_1s+=1;
                break;
            case 2:
                count_2s+=1;
                break;
            case 3:
                count_3s+=1;
                break;
            case 4:
                count_4s+=1;
                break;
            case 6:
                count_6s+=1;
                break;
            } 
        }
        total = total_innings1+total_innings2+total_innings3+total_innings4+total_innings5;
        averageRuns = (total_innings1+total_innings2+total_innings3+total_innings4+total_innings5)/5;
        strikeRate1 = (double)(total_innings1)*100/30;
        strikeRate2 = (double)(total_innings2)*100/30;
        strikeRate3 = (double)(total_innings3)*100/30;
        strikeRate4 = (double)(total_innings4)*100/30;
        strikeRate5 = (double)(total_innings5)*100/30;
        averageSR = (strikeRate1+strikeRate2+strikeRate3+strikeRate4+strikeRate5)/5;
        
        System.out.println("Average Score of last 5 matches  : " + averageRuns);
        System.out.println("Total Innings 1: " + total_innings1);
        System.out.println("Total Innings 2: " + total_innings2);
        System.out.println("Total Innings 3: " + total_innings3);
        System.out.println("Total Innings 4: " + total_innings4);
        System.out.println("Total Innings 5: " + total_innings5);
        System.out.println("Total Runs: " + total);
        System.out.println("Count of 0s : " + count_0s);
        System.out.println("Count of 1s : " + count_1s);
        System.out.println("Count of 2s : " + count_2s);
        System.out.println("Count of 3s : " + count_3s);
        System.out.println("Count of 4s : " + count_4s);
        System.out.println("Count of 6s : " + count_6s);
        System.out.println("Innings 1 Strike Rate : " + strikeRate1);
        System.out.println("Innings 2 Strike Rate : " + strikeRate2);
        System.out.println("Innings 3 Strike Rate : " + strikeRate3);
        System.out.println("Innings 4 Strike Rate : " + strikeRate4);
        System.out.println("Innings 5 Strike Rate : " + strikeRate5);
        System.out.println("Average Strike Rate : " + averageSR);


    }
}