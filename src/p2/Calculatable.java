package p2;

public interface Calculatable {

    int OPEN = 1;

    default int sum(int a, int b){
        return sumAll(a, b);
    }

    private int sumAll(int... values){
        int res = 0;
        for (int n : values){
            res +=n;
        }
        return res;
    }


}
