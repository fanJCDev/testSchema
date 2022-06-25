package SevenSegment_ITLINK;

import java.util.*;
public class SevenSegmentDisplay {
    public static void main(String[] args) {
        int[] segmentNumbers = new int[]{6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int numOfSticks = 0;
        int t;

        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        String[] resultArray = new String[t];
        for(int i=0; i<t; i++) {
            String num = in.next();
            numOfSticks = 0;
            for(String c : num.split("")) {
                numOfSticks += segmentNumbers[Integer.valueOf(c)];
            }
            int oddOnes = 0;

            if(numOfSticks%2 != 0) {
                oddOnes = numOfSticks - 3;
                numOfSticks -=3;
            }

            int countOfOnes = numOfSticks/2;
            char[] result = new char[countOfOnes];
            Arrays.fill(result, '1');
            String resultStr = String.valueOf(result);

            if(oddOnes > 0)
                resultStr = "7" + resultStr;

            resultArray[i] = resultStr;
        }

        for(int i=0;i<t;i++)
            System.out.println(resultArray[i]);
        in.close();
    }
}

/*
public class SevenSegmentDisplay {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int Length = Integer.parseInt(br.readLine().trim());
            String N = br.readLine();

            int out_ = Solve(Length, N);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static int Solve(int Length, String N){
        // Write your code here
        StringBuilder stt= new StringBuilder("");
        int arr[]=new int[]{6,2,5,5,4,5,6,3,7,6};
        int sum=0, c=0;
        for(int i=0;i<N.length();i++){
            c+=arr[N.charAt(i)-'0'];
        }
        if(c%2==1){
            stt.append("7");
            c-=3;
            for(int i=0;i<c;i+=2){
                stt.append("1");
            }
        }else{
            for(int i=0;i<c;i+=2){
                stt.append("1");
            }
        }
        stt.append("\n");
        return Integer.parseInt(stt.toString());
    }
}*/




