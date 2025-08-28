
    import java.text.DecimalFormat;
    public class numberToWords {
        private static final String[] tensNames = {
                "", " Ten", " Twenty", " Thirty", " Forty", " Fifty",
                " Sixty", " Seventy", " Eighty", " Ninety"
        };

        private static final String[] numNames = {
                "", " One", " Two", " Three", " Four", " Five", " Six",
                " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve",
                " Thirteen", " Fourteen", " Fifteen", " Sixteen",
                " Seventeen", " Eighteen", " Nineteen"
        };

        private static String convertLessThanOneThousand(int number) {
            String current;

            if (number % 100 < 20) {
                current = numNames[number % 100];
                number /= 100;
            } else {
                current = numNames[number % 10];
                number /= 10;

                current = tensNames[number % 10] + current;
                number /= 10;
            }
            if (number == 0) return current.trim();
            return numNames[number] + " Hundred" + current;
        }

        public static String convert(long number) {
            if (number == 0) return "Zero";

            String snumber = Long.toString(number);
            String mask = "000000000000";
            DecimalFormat df = new DecimalFormat(mask);
            snumber = df.format(number);

            int billions = Integer.parseInt(snumber.substring(0, 3));
            int millions = Integer.parseInt(snumber.substring(3, 6));
            int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
            int thousands = Integer.parseInt(snumber.substring(9, 12));

            String tradBillions = billions > 0 ? convertLessThanOneThousand(billions) + " Billion " : "";
            String tradMillions = millions > 0 ? convertLessThanOneThousand(millions) + " Million " : "";
            String tradHundredThousands = hundredThousands > 0 ? convertLessThanOneThousand(hundredThousands) + " Thousand " : "";
            String tradThousand = convertLessThanOneThousand(thousands);

            return (tradBillions + tradMillions + tradHundredThousands + tradThousand).trim();
        }

        public static void main(String[] args) {
            long number = 123;
            System.out.println(convert(number));
        }
    }


