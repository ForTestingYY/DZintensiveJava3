package ru.digilleague.collections;

public class Main {
    public static void main(String[] args) {

        String[] str = new String[6];
        ArrayList<String> stringArrayList = new ArrayList<>(str);

        //System.out.println(stringArrayList.size());
        //System.out.println(stringArrayList.get(0));
        //stringArrayList.remove();
        stringArrayList.add("d");
        for (int i=0;i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }
        stringArrayList.add("d");
        for (int i=0;i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }
        stringArrayList.add("dfvxcvcxvcxv");
        for (int i=0;i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }
    }
}
