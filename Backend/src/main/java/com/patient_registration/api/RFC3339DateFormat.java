package com.patient_registration.api;

import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.databind.util.ISO8601Utils;

import java.text.FieldPosition;
import java.util.Date;

/**
 * This class is used to define the date format.
 */
public class RFC3339DateFormat extends ISO8601DateFormat {

    /**
     * Returns the date in form of a string.
     * @param date {@link Date} This is the date format.
     * @param toAppendTo {@link StringBuffer} The date format is printed as a String.
     * @param fieldPosition {@link FieldPosition}
     * @return date in a string format.
     */
    // Same as ISO8601DateFormat but serializing milliseconds.
    @Override
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        String value = ISO8601Utils.format(date, true);
        toAppendTo.append(value);
        return toAppendTo;
    }

}