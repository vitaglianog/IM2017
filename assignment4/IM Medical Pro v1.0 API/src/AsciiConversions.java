/**
 * Simple program to open communications ports and connect to Agilent Monitor
 * 16 bit char to 8 bit char conversion table
 * @version 1.2 - 30 Set 2003
 * @author Francisco Cardoso (fmcc@student.dei.uc.pt)
 * @author Ricardo Sal (ricsal@student.dei.uc.pt)
 */

package src;

public class AsciiConversions {
    static char WHITE_SPACE = ' ';
    static char[] char_tbl = /* the font table as global char field */
            {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
                40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
                60, 61, 62, 63, 64, 65, 66, 67, 68, 69,
                70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
                80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
                90, 91, 92, 93, 94, 95, 96, 97, 98, 99,
                100, 101, 102, 103, 104, 105, 106, 107, 108, 109,
                110, 111, 112, 113, 114, 115, 116, 117, 118, 119,
                120, 121, 122, 123, 124, 125, 126,
                ' ',
                ' ', /* 128   */
                ' ',
                ' ', /* 130   */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ', /* 140  */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ', /* 150  */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ', /* 160  */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                96, /* 169   `  */
                94, /* 170   ^  */
                ' ',
                126, /* 172   ~  */
                151, /* 173   �  */
                150, /* 174   �  */
                156, /* 175   �  */
                ' ',
                ' ',
                17, /* 178     */
                248, /* 179   �  */
                128, /* 180   �  */
                135, /* 181   �  */
                165, /* 182   �  */
                164, /* 183   �  */
                173, /* 184   �  */
                ' ',
                ' ',
                156, /* 187   �  */
                157, /* 188   ?  */
                21, /* 189     */
                159, /* 190   �  */
                155, /* 191   �  */
                131, /* 192   �  */
                136, /* 193   �  */
                147, /* 194   �  */
                150, /* 195   �  */
                160, /* 196   �  */
                130, /* 197   �  */
                162, /* 198   �  */
                163, /* 199   �  */
                133, /* 200   �  */
                138, /* 201   �  */
                149, /* 202   �  */
                151, /* 203   �  */
                132, /* 204   �  */
                137, /* 205   �  */
                148, /* 206   �  */
                129, /* 207   ?  */
                143, /* 208   ?  */
                173, /* 209   �  */
                237, /* 210   �  */
                146, /* 211   �  */
                134, /* 212   �  */
                161, /* 213   �  */
                237, /* 214   �  */
                145, /* 215   �  */
                142, /* 216   �  */
                141, /* 217   ?  */
                153, /* 218   �  */
                154, /* 219   �  */
                144, /* 220   ?  */
                139, /* 221   �  */
                225, /* 222   �  */
                147, /* 223   �  */
                160, /* 224   �  */
                65, /* 225   A  */
                97, /* 226   a  */
                68, /* 227   D  */
                ' ',
                161, /* 229   �  */
                141, /* 230   ?  */
                162, /* 231   �  */
                149, /* 232   �  */
                79, /* 233   O  */
                111, /* 234   o  */
                83, /* 235   S  */
                115, /* 236   s  */
                163, /* 237   �  */
                152, /* 238   �  */
                152, /* 239   �  */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                45, /* 246   -  */
                172, /* 247   �  */
                171, /* 248   �  */
                97, /* 249   a  */
                111, /* 250   o  */
                174, /* 251   �  */
                219, /* 252   �  */
                175, /* 253   �  */
                18, /* 254     */
                ' ',
                ' ', /* 0        */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ', /* 10       */
                ' ',
                ' ',
                179, /* 13    �  */
                196, /* 14    �  */
                197, /* 15    �  */
                192, /* 16    �  */
                217, /* 17    �  */
                218, /* 18    �  */
                191, /* 19    �  */
                195, /* 20    �  */
                180, /* 21    �  */
                194, /* 22    �  */
                193, /* 23    �  */
                24, /* 24      */
                25, /* 25      */
                253, /* 26    �  */
                53, /* 27    5  */
                67, /* 28    C  */
                70, /* 29    F  */
                108, /* 30    l  */
                50, /* 31    2  */
                72, /* 32    H  */
                51, /* 33    3  */
                ' ',
                ' ',
                17, /* 36      */
                16, /* 37      */
                30, /* 38      */
                31, /* 39      */
                WHITE_SPACE, /* 40       */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE, /* 50       */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE, /* 60       */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE, /* 70       */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE, /* 80       */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                42, /* 87    *  */
                42, /* 88    *  */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                40, /* 92    (  */
                41, /* 93    )  */
                47, /* 94    /  */
                WHITE_SPACE,
                WHITE_SPACE,
                63, /* 97    ?  */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE, /* 100      */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                48, /* 108   0  */
                49, /* 109   1  */
                50, /* 110   2  */
                51, /* 111   3  */
                52, /* 112   4  */
                53, /* 113   5  */
                54, /* 114   6  */
                55, /* 115   7  */
                56, /* 116   8  */
                57, /* 117   9  */
                47, /* 118   /  */
                WHITE_SPACE,
                WHITE_SPACE, /* 120      */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE, /* 123      */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE, /* 10    */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE, /* 20    */
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE,
                WHITE_SPACE, /* 30    */
                WHITE_SPACE,


                /* repetition  for the small char set              */

                32, 33, 34, 35, 36, 37, 38, 39,
                40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
                60, 61, 62, 63, 64, 65, 66, 67, 68, 69,
                70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
                80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
                90, 91, 92, 93, 94, 95, 96, 97, 98, 99,
                100, 101, 102, 103, 104, 105, 106, 107, 108, 109,
                110, 111, 112, 113, 114, 115, 116, 117, 118, 119,
                120, 121, 122, 123, 124, 125, 126, 127,
                ' ', /* 128   */
                ' ',
                ' ', /* 130   */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ', /* 140  */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ', /* 150  */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ', /* 160  */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                96, /* 169   `  */
                94, /* 170   ^  */
                ' ',
                126, /* 172   ~  */
                151, /* 173   �  */
                150, /* 174   �  */
                156, /* 175   �  */
                ' ',
                ' ',
                17, /* 178     */
                248, /* 179   �  */
                128, /* 180   �  */
                135, /* 181   �  */
                165, /* 182   �  */
                164, /* 183   �  */
                173, /* 184   �  */
                ' ',
                ' ',
                156, /* 187   �  */
                157, /* 188   ?  */
                21, /* 189     */
                159, /* 190   �  */
                155, /* 191   �  */
                131, /* 192   �  */
                136, /* 193   �  */
                147, /* 194   �  */
                150, /* 195   �  */
                160, /* 196   �  */
                130, /* 197   �  */
                162, /* 198   �  */
                163, /* 199   �  */
                133, /* 200   �  */
                138, /* 201   �  */
                149, /* 202   �  */
                151, /* 203   �  */
                132, /* 204   �  */
                137, /* 205   �  */
                148, /* 206   �  */
                129, /* 207   ?  */
                143, /* 208   ?  */
                173, /* 209   �  */
                237, /* 210   �  */
                146, /* 211   �  */
                134, /* 212   �  */
                161, /* 213   �  */
                237, /* 214   �  */
                145, /* 215   �  */
                142, /* 216   �  */
                141, /* 217   ?  */
                153, /* 218   �  */
                154, /* 219   �  */
                144, /* 220   ?  */
                139, /* 221   �  */
                225, /* 222   �  */
                147, /* 223   �  */
                160, /* 224   �  */
                65, /* 225   A  */
                97, /* 226   a  */
                68, /* 227   D  */
                ' ',
                161, /* 229   �  */
                141, /* 230   ?  */
                162, /* 231   �  */
                149, /* 232   �  */
                79, /* 233   O  */
                111, /* 234   o  */
                83, /* 235   S  */
                115, /* 236   s  */
                163, /* 237   �  */
                152, /* 238   �  */
                152, /* 239   �  */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                45, /* 246   -  */
                172, /* 247   �  */
                171, /* 248   �  */
                97, /* 249   a  */
                111, /* 250   o  */
                174, /* 251   �  */
                219, /* 252   �  */
                175, /* 253   �  */
                18, /* 254     */
                ' ',
                ' ', /* 0        */
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ',
                ' ', /* 10       */
                ' ',
                ' ',
                179, /* 13    �  */
                196, /* 14    �  */
                197, /* 15    �  */
                192, /* 16    �  */
                217, /* 17    �  */
                218, /* 18    �  */
                191, /* 19    �  */
                195, /* 20    �  */
                180, /* 21    �  */
                194, /* 22    �  */
                193, /* 23    �  */
                24, /* 24      */
                25, /* 25      */
                253, /* 26    �  */
                53, /* 27    5  */
                67, /* 28    C  */
                70, /* 29    F  */
                108, /* 30    l  */
                50, /* 31    2  */
                72, /* 32    H  */
                51, /* 33    3  */
                ' ',
                ' ',
                17, /* 36      */
                16, /* 37      */
                30, /* 38      */
                31, /* 39      */
                0};

    public static String c16_to_c8(int[] num) {
        String out = "";
        for (int i = 0; i < num.length; i++) {
            out = out + char_tbl[num[i]];
        }
        return out;
    }

}