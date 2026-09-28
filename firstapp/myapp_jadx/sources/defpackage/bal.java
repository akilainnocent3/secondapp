package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class bal extends w8h0<Number> {
    @Override // defpackage.w8h0
    public final Number read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return Float.valueOf((float) jsonReader.nextDouble());
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // defpackage.w8h0
    public final void write(JsonWriter jsonWriter, Number number) throws IOException {
        Number numberValueOf = number;
        if (numberValueOf == null) {
            jsonWriter.nullValue();
            return;
        }
        float fFloatValue = numberValueOf.floatValue();
        eal.a(fFloatValue);
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(fFloatValue);
        }
        jsonWriter.value(numberValueOf);
    }
}
