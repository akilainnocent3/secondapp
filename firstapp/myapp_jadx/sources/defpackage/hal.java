package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class hal<T> implements y2b<ResponseBody, T> {
    public final eal a;
    public final w8h0<T> b;

    public hal(eal ealVar, w8h0<T> w8h0Var) {
        this.a = ealVar;
        this.b = w8h0Var;
    }

    @Override // defpackage.y2b
    public final Object convert(ResponseBody responseBody) {
        ResponseBody responseBody2 = responseBody;
        Reader readerCharStream = responseBody2.charStream();
        this.a.getClass();
        JsonReader jsonReader = new JsonReader(readerCharStream);
        jsonReader.setStrictness(d9e0.b);
        try {
            T t = this.b.read(jsonReader);
            if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new kdp("JSON document was not fully consumed.");
            }
            responseBody2.close();
            return t;
        } catch (Throwable th) {
            responseBody2.close();
            throw th;
        }
    }
}
