package com.mt;

import java.util.HashMap;

/**
 * Created by mthierry on 6/20/16.
 */
public class RomanNumber {
    private String romanNumber;
    private int value;

    HashMap<Integer, String> map;

    {
        map = new HashMap<Integer, String>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
    }

    public RomanNumber() {
    }

    public String toRoman(int number) {
        StringBuilder sb = new StringBuilder();

        if (number == 0) {
            sb.append("x");
        } else {
            if (number / 1000 > 0) {
                sb.append("M");
                number = number % 1000;
            }

            if (number / 100 > 0) {
                sb.append("C");
                number = number % 100;
            }

            if (number / 10 > 0) {
                sb.append(oneToNine(number - 10, map.get(10)));
                sb.append("X");
                ///sb.append(oneToNine(number - 10));
                number = number % 10;
            }

            sb.append(oneToNine(number, map.get(1)));
        }
        return sb.toString();
    }

    private StringBuilder oneToNine(int number, String one) {
        StringBuilder sb = new StringBuilder();
        switch (number) {
            case 9:
                sb.append(map.get(1));
                sb.append(map.get(10));
                break;
            case 8:
                sb.append(map.get(5));
                sb.append(map.get(1));
                sb.append(map.get(1));
                sb.append(map.get(1));
                break;
            case 7:
                sb.append(map.get(5));
                sb.append(map.get(1));
                sb.append(map.get(1));
                break;
            case 6:
                sb.append(map.get(5));
                sb.append(map.get(1));
                break;
            case 5:
                sb.append(map.get(number));
                break;
            case 4:
                sb.append(map.get(1));
                sb.append(map.get(5));
                break;
            case 3:
                sb.append(one);
            case 2:
                sb.append(one);
            case 1:
                if (one.equalsIgnoreCase(map.get(1)))
                    sb.append(one);
                break;
            case 0:
                break;
        }
        return sb;
    }

    public String getRomanNumber() {
        return romanNumber;
    }

    public void setRomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
