public class ShadesOfGrey {
    static String[] shadesOfGrey(int number) {
        if(number <= 0) number = 0;
        if(number > 254) number = 254;
        String[] res = new String[number];
        for(int i = 0; i < number; i++) {
            res[i] = String.format("#%1$02x%1$02x%1$02x", i + 1);
        }
        return res;
    }
}