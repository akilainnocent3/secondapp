package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class cal extends w8h0<AtomicLong> {
    public final /* synthetic */ w8h0 a;

    public cal(w8h0 w8h0Var) {
        this.a = w8h0Var;
    }

    @Override // defpackage.w8h0
    public final AtomicLong read(JsonReader jsonReader) {
        return new AtomicLong(((Number) this.a.read(jsonReader)).longValue());
    }

    @Override // defpackage.w8h0
    public final void write(JsonWriter jsonWriter, AtomicLong atomicLong) {
        this.a.write(jsonWriter, Long.valueOf(atomicLong.get()));
    }
}
