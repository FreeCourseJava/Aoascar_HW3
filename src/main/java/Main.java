public class Main {
    public static void main(String[] args) {

        int [] myArray=new int[10];
        for (int i=0; i<10; i++){
            myArray[i]=Integer.MIN_VALUE;
            System.out.println(i);
            System.out.println(myArray[i]);
        }
        myArray[4]=8;
        myArray[7]=12;
        int count = 0;
        for (int i=0; i<10; i++){
            if (myArray[i]!=Integer.MIN_VALUE) {
                count += 1;
            }
        }
        System.out.println("Количество отличное от Integet.MIN+VALUE ");
        System.out.println(count);
        int [] myTatarstan = new int[20];
        myTatarstan[0] = 1958;
        myTatarstan[1] = 1923;
        myTatarstan[2] = 1907;
        myTatarstan[3] = 1924;
        myTatarstan[4] = 1986;
        myTatarstan[5] = 1954;
        myTatarstan[6] = 1952;
        myTatarstan[7] = 1978;
        myTatarstan[8] = 1998;
        myTatarstan[9] = 1909;
        myTatarstan[10] = 1999;
        myTatarstan[11] = 2011;
        myTatarstan[12] = 1850;
        myTatarstan[13] = 1987;
        myTatarstan[14] = 1258;
        myTatarstan[15] = 1358;
        myTatarstan[16] = 1989;
        myTatarstan[17] = 1935;
        myTatarstan[18] = 1984;
        myTatarstan[19] = 1987;
        for (int i=0; i<20; i++){
            System.out.println(myTatarstan[i]);
        }

        int memoryValue = 0;
        for (int i=0; i<20; i++){
            for (int j=0;j<19;j++){
                if (myTatarstan[j]>myTatarstan[j+1]){
                    memoryValue = myTatarstan[j];
                    myTatarstan[j] = myTatarstan[j+1];
                    myTatarstan[j+1] = memoryValue;
                }

            }

        }
        System.out.println("Отсортированный массив");
        for (int i=0; i<20; i++){
            System.out.println(myTatarstan[i]);
        }
        int year = 1985;
        boolean answer=false;
        for (int i=0; i<20; i++){
            if (myTatarstan[i] == year){
                answer=true;
            }
        }
        System.out.println("Year ");
        System.out.println(year);
        System.out.println("is in list -");
        System.out.println(answer);
    }

}
