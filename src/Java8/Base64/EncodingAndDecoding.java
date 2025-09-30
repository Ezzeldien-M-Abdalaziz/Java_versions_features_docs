package Java8.Base64;

import java.util.Arrays;
import java.util.Base64;

public class EncodingAndDecoding {

    public static void main(String[] args) {

        String encode = Base64.getEncoder().encodeToString("Bye".getBytes());
        System.out.println(encode);

        String encodedHiThere = "SGkgdGhlcmU";
        String decode = new String(Base64.getDecoder().decode(encodedHiThere));
        System.out.println(decode);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedHiThere);
        System.out.println(Arrays.toString(decodedBytes)); // shows numeric byte values   //ascii value for SGkgdGhlcmU
    }
}
