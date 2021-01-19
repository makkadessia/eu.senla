package eu.senla.Task1;

public class Main {
    static boolean aBoolean;
    static byte aByte;
    static short bShort;
    static int cInt;
    static long dLong;
    static double eDouble;
    static float fFloat;
    static char gChar;

    static String StringWrapper;
    static Boolean BooleanWrapper;
    static Byte ByteWrapper;
    static Short ShortWrapper;
    static Integer IntegerWrapper;
    static Long LongWrapper;
    static Double DoubleWrapper;
    static Float FloatWrapper;
    static Character CharWrapper;


    public static void main(String[] args) {

        Number number = new Number();
        number.setaBoolean((boolean) true);
        System.out.println("boolean is: " + number.getaBoolean());

        number.setaByte((byte) 77); //byte from -128 to 127  1b
        System.out.println("byte "+ number.getaByte());

        number.setbShort((short) 999);  //short from -32768 to 32767  2b
        System.out.println("short "+ number.getbShort());

        number.setcInt((int) 1111111299);  //int -2147483648 to 2147483647  4b
        System.out.println("int "+ number.getcInt());

        number.setdLong((long) 32900); //long –9223372036854775808 to 9223372036854775807  8b
        System.out.println("long "+ number.getdLong());

        number.seteDouble((double) 237600.25); //double
        System.out.println("double "+ number.geteDouble());

        number.setfFloat((float) 523.75);
        System.out.println("float " + number.getfFloat());

        number.setgChar((char) 'X');
        System.out.println("char " + number.getgChar());

        number.setStringWrapper((String) "Hello world");
        System.out.println("String type: " + number.getStringWrapper());

        number.setBooleanWrapper((Boolean) false);
        System.out.println("Boolean Wrapper is: " + number.getBooleanWrapper());

        number.setByteWrapper((byte) 126);  //because Byte class  wraps a value of primitive class byte in a object
        System.out.println("Byte Wrapper " + number.getByteWrapper());

        number.setShortWrapper((short) 555);
        System.out.println("Short Wrapper: " + number.getShortWrapper());

        number.setIntegerWrapper((Integer) 325973);
        System.out.println("Integer Wrapper: " + number.getIntegerWrapper());

        number.setLongWrapper((long) 534476643);
        System.out.println("Long Wrapper: " + number.getLongWrapper());

        number.setDoubleWrapper((Double) 543274.234);
        System.out.println("Double Wrapper: " + number.getDoubleWrapper());

        number.setFloatWrapper((float) 456.23);
        System.out.println("Float Wrapper: " + number.getFloatWrapper());

        number.setCharWrapper((Character) 'H');
        System.out.println("Character Wrapper: " + number.getCharWrapper());

        System.out.println();
        System.out.println("Begin play with variables ");
        System.out.println();

        number.setcInt((int) number.getaByte() + 1); // aByte to cInt + 1
        System.out.println("aByte to cInt + 1: " + number.getcInt());

        number.setStringWrapper((String) number.getStringWrapper() + " " + number.getcInt());
        System.out.println("String + cInt: " + number.getStringWrapper());

        number.setStringWrapper((String) number.getStringWrapper() + " " + number.getCharWrapper());
        System.out.println("String + CharWrapper: " + number.getStringWrapper());

        //  number.setLongWrapper((Long) number.getLongWrapper() + " " + number.getDoubleWrapper()); невозможная операция
        //  number.setDoubleWrapper((Double) number.getDoubleWrapper() + " " + number.getFloatWrapper()); невозможная операция, предполагает тип String
        //  number.setLongWrapper((Long) number.getLongWrapper() + number.getDoubleWrapper());   ошибка операции

        number.setDoubleWrapper((Double) number.getDoubleWrapper() + number.getFloatWrapper());
        System.out.println("Double Wrapper + Float Wrapper: " + number.getDoubleWrapper());

        number.setbShort((short) number.getaByte());
        System.out.println("aByte to bShort: " + number.getbShort());
        System.out.println();

        number.setbShort((short) 999);
        System.out.println("Back bShort value to: " +number.getbShort());

        System.out.println("aByte is: " + number.getaByte());
        number.setaByte((byte) number.getbShort());
        System.out.println("bShort (999) to aByte (77): " + number.getaByte());
        System.out.println("There is trouble to put Short type in Byte");
        System.out.println();

        System.out.println("Long Wr: " + number.getLongWrapper());
        System.out.println("Double Wr: " + number.getDoubleWrapper());
        System.out.println("Long Wrapper + Double Wrapper: " + number.getLongWrapper() + number.getDoubleWrapper());
    }
}
