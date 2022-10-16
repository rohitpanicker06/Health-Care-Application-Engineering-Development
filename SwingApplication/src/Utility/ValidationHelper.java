/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.EmployeePojo;

/**
 *
 * @author rohitPanicker
 */
public class ValidationHelper {

    public static boolean isValidName(String name) {
        return RegexCheckHelper.dynamicRegexCheckHelper(RegexConstants.NAME_REGEX, name);
    }

    public static boolean isInteger(String integerString) {
        return RegexCheckHelper.dynamicRegexCheckHelper(RegexConstants.INTEGER_REGEX, integerString);

    }

    public static boolean isValidEmailID(String emailId) {
        return RegexCheckHelper.dynamicRegexCheckHelper(RegexConstants.EMAIL_REGEX, emailId);
    }

    public static boolean checkPhoneNumberWith10Digits(String phoneNumber) {
        return RegexCheckHelper.dynamicRegexCheckHelper(RegexConstants.PHONE_NUMBER_VALIDATOR_10_DIGIT, phoneNumber);
    }

}
