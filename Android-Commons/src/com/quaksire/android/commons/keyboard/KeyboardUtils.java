package com.quaksire.android.commons.keyboard;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 *
 * @author julio
 */
public class KeyboardUtils {

    /**
     * Hide keyboard from EditText
     * @param context
     * @param focusedField 
     */
    public static void hideSoftKeyboard(Context context, EditText focusedField) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(focusedField.getWindowToken(), 0);
    }
    
}
