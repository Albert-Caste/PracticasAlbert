public class ConvertNumToBinary {

    public static void main(String[] args){
        int num = Reuse.enterInt("Please, enter decimal number to convert to binary: ");
        String  numBinary = covertNumBinary(num);

        System.out.println("the number converted to binary is: " + numBinary);

    }

    public static boolean checkPair(int inputNum){
        boolean flag = false;
        if (inputNum % 2 == 0){
            flag = true;
        }

        return flag ;

    }

    public static String reverseString(String text){
        String reverseText = "";

        for (int i=text.length()-1; i>=0 ;i--){
            reverseText+=text.charAt(i);
        }

        return reverseText;
    }

    public static String covertNumBinary(int num){
        String convertedNum = " ";


        for (int i = num; i>0; i/=2){

            if(checkPair(i)){
                convertedNum +="0";
            }else {
                convertedNum+="1";
            }


        }


        return reverseString(convertedNum);
    }





}
