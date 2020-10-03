package com.Java_Technical;



import java.util.Arrays;


public class ReverstringArray {


//    @Test(enabled = false)
//    public void permissionTest() {
//        String token = getTokenForUserWithoutPermissions(user1);
//        PseudoCode pseudoCode = new PseudoCode(token);
//        try {
//            pseudoCode.createTheThing();
//        } catch (SdkResponseException e) {
//            Assert.assertTrue(e.getStatusCode() == 404);
//        }
//
//        String token2 = getTokenForUserWithPermissions(user2);
//        PseudoCode pseudoCode2 = new PseudoCode(token2);
//        pseudoCode.createTheThing();
//    }



    public static void main(String[] args) {

        String str="I am heading home";

        System.out.println(str);

        StringBuilder str1=new StringBuilder(str);

        System.out.println(str1.reverse());
        //

        char[] array =str.toCharArray();

        System.out.println(array.length);

        StringBuilder reverse= new StringBuilder();

        for (int i=array.length-1; i>=0;i--){

            reverse.append(str.charAt(i));

        }

        System.out.println("reverse::::" +reverse);
        //

        int[] b = new int[]{1, 2, 3, 4, 19900, 1999};

        Arrays.sort(b);


        System.out.println(b[b.length-2]);

        /*
    Assumptions:
        user1 does NOT have permissions to "create the thing".
        user2 DOES have permissions to "create the thing".
    Test:
        Make sure user1 CANNOT "create the thing" and make sure user2 CAN "create the thing".
 */

    }
}
