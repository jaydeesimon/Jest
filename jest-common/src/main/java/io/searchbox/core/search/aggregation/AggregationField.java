package io.searchbox.core.search.aggregation;

import java.util.List;
import java.util.Map;

/**
 * @author cfstout
 */
public enum AggregationField {
    VALUE("value"),
    BUCKETS("buckets"),
    KEY("key"), //Can be String or Long
    KEY_AS_STRING("key_as_string"),
    DOC_COUNT("doc_count"),
    FROM("from"),
    TO("to"),
    FROM_AS_STRING("from_as_string"),
    TO_AS_STRING("to_as_string"),
    SUM_OF_SQUARES("sum_of_squares"),
    VARIANCE("variance"),
    STD_DEVIATION("std_deviation"),
    BOUNDS("bounds"),
    TOP_LEFT("top_left"),
    BOTTOM_RIGHT("bottom_right"),
    LAT("lat"),
    LON("lon"),
    UNIT("unit"),
    VALUES("values"),
    SCORE("score"),
    BG_COUNT("bg_count"), //Background Count
    COUNT("count"),
    MIN("min"),
    MAX("max"),
    AVG("avg"),
    SUM("sum"),
    DOC_COUNT_ERROR_UPPER_BOUND("doc_count_error_upper_bound"),
    SUM_OTHER_DOC_COUNT("sum_other_doc_count");

    private final String field;

    private AggregationField(String s) {
        field = s;
    }

    public String toString() {
        return field;
    }

    public boolean equals(String s) {
        return s.equals(toString());
    }
}

