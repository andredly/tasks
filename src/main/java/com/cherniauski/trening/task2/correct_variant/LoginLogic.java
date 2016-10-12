package com.cherniauski.trening.task2.correct_variant;

/**
 * Created by ivc4 on 10.10.2016.
 */
    class LoginLogic {
    private final static int PERDONEL_NUMBER_ADMIN=1;
    private final static String ADMIN_PASS="123";
    static boolean checkLogin(int personnelNumber, String enterPass){
        return personnelNumber==PERDONEL_NUMBER_ADMIN&&ADMIN_PASS.equals(enterPass);
    }
}
