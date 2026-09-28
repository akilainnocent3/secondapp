package defpackage;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes8.dex */
public final class gal<T> implements y2b<T, RequestBody> {
    public static final MediaType c = MediaType.get("application/json; charset=UTF-8");
    public final eal a;
    public final w8h0<T> b;

    public gal(eal ealVar, w8h0 w8h0Var) {
        this.a = ealVar;
        this.b = w8h0Var;
    }

    @Override // defpackage.y2b
    public final RequestBody convert(Object obj) throws IOException {
        lb5 lb5Var = new lb5();
        JsonWriter jsonWriterI = this.a.i(new OutputStreamWriter(lb5Var.F1(), StandardCharsets.UTF_8));
        this.b.write(jsonWriterI, obj);
        jsonWriterI.close();
        return RequestBody.create(c, lb5Var.B0(lb5Var.b));
    }
}
