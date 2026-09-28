package defpackage;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class cfp extends JsonWriter {
    public static final a d = new a();
    public static final cep e = new cep("closed");
    public final ArrayList a;
    public String b;
    public tcp c;

    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public cfp() {
        super(d);
        this.a = new ArrayList();
        this.c = tdp.a;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() {
        bcp bcpVar = new bcp();
        f(bcpVar);
        this.a.add(bcpVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() {
        xdp xdpVar = new xdp();
        f(xdpVar);
        this.a.add(xdpVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            arrayList.add(e);
        } else {
            i08.a("Incomplete document");
        }
    }

    public final tcp d() {
        return (tcp) rh6.a(1, this.a);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || this.b != null) {
            fm20.a();
            return null;
        }
        if (d() instanceof bcp) {
            arrayList.remove(arrayList.size() - 1);
            return this;
        }
        fm20.a();
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || this.b != null) {
            fm20.a();
            return null;
        }
        if (d() instanceof xdp) {
            arrayList.remove(arrayList.size() - 1);
            return this;
        }
        fm20.a();
        return null;
    }

    public final void f(tcp tcpVar) {
        if (this.b != null) {
            tcpVar.getClass();
            if (!(tcpVar instanceof tdp) || getSerializeNulls()) {
                ((xdp) d()).h(this.b, tcpVar);
            }
            this.b = null;
            return;
        }
        if (this.a.isEmpty()) {
            this.c = tcpVar;
            return;
        }
        tcp tcpVarD = d();
        if (tcpVarD instanceof bcp) {
            ((bcp) tcpVarD).h(tcpVar);
        } else {
            fm20.a();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter jsonValue(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.a.isEmpty() || this.b != null) {
            ib5.a("Did not expect a name");
            return null;
        }
        if (d() instanceof xdp) {
            this.b = str;
            return this;
        }
        ib5.a("Please begin an object before writing a name.");
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() {
        f(tdp.a);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) {
        if (number == null) {
            f(tdp.a);
            return this;
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                z9l.a(number, "JSON forbids NaN and infinities: ");
                return null;
            }
        }
        f(new cep(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() {
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(float f) {
        if (!isLenient() && (Float.isNaN(f) || Float.isInfinite(f))) {
            fcy.a(f, "JSON forbids NaN and infinities: ");
            return null;
        }
        f(new cep(Float.valueOf(f)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d2) {
        if (!isLenient() && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            pfp.a(d2, "JSON forbids NaN and infinities: ");
            return null;
        }
        f(new cep(Double.valueOf(d2)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) {
        f(new cep(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) {
        if (bool == null) {
            f(tdp.a);
            return this;
        }
        f(new cep(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) {
        f(new cep(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) {
        if (str == null) {
            f(tdp.a);
            return this;
        }
        f(new cep(str));
        return this;
    }
}
