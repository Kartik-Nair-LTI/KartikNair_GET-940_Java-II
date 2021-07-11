class Batsman {

    public static void main(String args[]) {

        int total = 0,count_0s = 0, count_1s = 0, count_2s = 0, count_3s = 0;
        int count_4s = 0, count_6s = 0;
        double strikeRate;
        int[] runs = new int[30];

        for (int i = 0; i < runs.length; i++) {
            runs[i] = (int) (Math.random() * 6);
        }

        for (int i = 0; i < runs.length; i++) {
            total = total + runs[i];
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

        strikeRate = (double)(total)*100/30;
    
        System.out.println("Total Runs  : " + total);
        System.out.println("Count of 0s : " + count_0s);
        System.out.println("Count of 1s : " + count_1s);
        System.out.println("Count of 2s : " + count_2s);
        System.out.println("Count of 3s : " + count_3s);
        System.out.println("Count of 4s : " + count_4s);
        System.out.println("Count of 6s : " + count_6s);
        System.out.println("Strike Rate : " + strikeRate);
    }
}
