package week3;

import java.util.ArrayList;

public class Ex67 {

        public static int sum(ArrayList<Integer> list) {
            // write your code here
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }

            return sum;
        }
        public static double average(ArrayList<Integer> list) {
            int total = sum(list);
            return (double) total / list.size();

        }
        public static double variance(ArrayList<Integer> list) {
            double mean = average(list);
            double sumSquaredDiffs = 0.0;

            for (int num : list){
                double diff = num - mean;
                sumSquaredDiffs += diff * diff;
            }
            return sumSquaredDiffs / (list.size() - 1);
        }

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(3);
            list.add(2);
            list.add(7);
            list.add(2);

            System.out.println("The variance is: " + variance(list));
        }

    }

