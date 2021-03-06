package io.searchbox.core.search.aggregation;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cfstout
 */
public class PercentilesAggregation extends Aggregation {

    public static final String TYPE = "percentiles";

    private Map<String, Double> percentiles;

    public PercentilesAggregation(String name, JsonObject percentilesAggregation) {
        super(name, percentilesAggregation);
        percentiles = new HashMap<String, Double>();
        JsonObject values = percentilesAggregation.getAsJsonObject(String.valueOf(AggregationField.VALUES));
        for (Map.Entry<String, JsonElement> entry : values.entrySet()) {
            if(!(Double.isNaN(entry.getValue().getAsDouble()))) {
                percentiles.put(entry.getKey(), entry.getValue().getAsDouble());
            }
        }
    }

    public Map<String, Double> getPercentiles() {
        return percentiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PercentilesAggregation rhs = (PercentilesAggregation) o;
        return new EqualsBuilder()
                .append(getPercentiles(), rhs.getPercentiles())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getPercentiles())
                .toHashCode();
    }
}
