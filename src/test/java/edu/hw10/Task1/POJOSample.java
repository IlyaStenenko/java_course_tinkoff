package edu.hw10.Task1;

import edu.hw10.Task1.Annotations.Max;
import edu.hw10.Task1.Annotations.Min;
import edu.hw10.Task1.Annotations.NotNull;

public class POJOSample {

    private Integer sampleNotNullIntWrapper;
    private Double sampleDoubleWrapper;

    private POJOSample(Integer sampleNotNullIntWrapper, Double sampleDoubleWrapper) {
        this.sampleNotNullIntWrapper = sampleNotNullIntWrapper;
        this.sampleDoubleWrapper = sampleDoubleWrapper;
    }

    public static POJOSample create(
            @NotNull @Max(1000) @Min(-1000)
            Integer sampleNotNullIntWrapper,
            @Max(1000) @Min(-1000)
            Double sampleDoubleWrapper
    ) {
        return new POJOSample(sampleNotNullIntWrapper, sampleDoubleWrapper);
    }

    public Integer getSampleNotNullIntWrapper() {
        return sampleNotNullIntWrapper;
    }

    public Double getSampleDoubleWrapper() {
        return sampleDoubleWrapper;
    }
}
