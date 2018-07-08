package com.github.dmn1k;

import io.vavr.Tuple2;
import lombok.Value;

@Value
public class TableCell {
    private String value;
    private boolean isPrimaryKey;

    public static TableCell create(Tuple2<String, Boolean> valuePrimKeyTuple){
        return new TableCell(valuePrimKeyTuple._1, valuePrimKeyTuple._2);
    }
}
