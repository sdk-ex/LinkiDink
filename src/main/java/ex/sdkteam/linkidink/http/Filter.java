package ex.sdkteam.linkidink.http;

import ex.sdkteam.linkidink.MainController;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.regex.*;
import java.lang.StringBuilder;

/**
 * @class Filter
 * <p>
 *  The class 'Filter' is meant for providing the logic to properly parse a URI,
 *  as to try and auto-correct if you will, the input provided from the user before
 *  a request is actually made. This must be done carefully though, as avoiding making
 *  changes to the URI which may cause the wrong files to be downloaded is important.
 *  </p>
 */
public class Filter {


    /* Class Constructors */



    // Parsing for Server Input: RE


    // Parsing for User Input: RE, ^1
    Pattern pat = new Pattern.compile("");

    public boolean isValidUri(String input) {
        if() {
            return true;
        }
        else {
            return false;
        }
    }
}

