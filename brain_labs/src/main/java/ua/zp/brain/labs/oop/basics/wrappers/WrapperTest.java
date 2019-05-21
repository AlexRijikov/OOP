package ua.zp.brain.labs.oop.basics.wrappers;

public class WrapperTest {
    public static void main(String[] args) {
//        Integer in =100;
////        Integer in2 =Integer.valueOf(100);
////        Integer in3 = new Integer(100);
//        Integer in4 = Integer.parseInt("10");
//
////        Long lon = 1000l;
////        Long lon1 = Long.valueOf(1000);
////        Long lon2 = new Long(1000l);
//        Long lon3 = Long.parseLong("1000l");
//
//        Float flol =23.51f;
////        Float flo1 = Float.valueOf(23.51f);
////        Float flo2 = new Float(23.51f);
//        Float flo3 = Float.parseFloat("23.51f");
//
//        Double dub = 123.4;
////        Double dub1 = new Double(123.4);
////        Double dub2 = Double.valueOf(123.4);
//        Double dub3 = Double.parseDouble("123.4");
//
//        Boolean one = true;
////        Boolean one1 = new Boolean(true);
////        Boolean one2 = Boolean.valueOf(true);
//        Boolean one3 = Boolean.parseBoolean("true");

        Double qw = 12.456;
        byte q = qw.byteValue();
        short s = qw.shortValue();
        int i = qw.intValue();
        float ff = qw.floatValue();
        long lll = qw.longValue();
        Double dq = 0.0;
        double dq1 = qw / dq;


        System.out.println(dq1);
        System.out.println(q + ";" + s + ";" + i + ";" + ff + ";" + lll + ".");

    }
}
