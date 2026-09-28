package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w8h0<T> {

    public final class a extends w8h0<T> {
        public a() {
        }

        @Override // defpackage.w8h0
        public final T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (T) w8h0.this.read(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        public final String toString() {
            return "NullSafeTypeAdapter[" + w8h0.this + "]";
        }

        @Override // defpackage.w8h0
        public final void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
            } else {
                w8h0.this.write(jsonWriter, t);
            }
        }
    }

    public final T fromJson(Reader reader) {
        return read(new JsonReader(reader));
    }

    public final T fromJsonTree(tcp tcpVar) {
        try {
            return read(new yep(tcpVar));
        } catch (IOException e) {
            throw new kdp(e);
        }
    }

    public final w8h0<T> nullSafe() {
        return !(this instanceof a) ? new a() : this;
    }

    public abstract T read(JsonReader jsonReader);

    public final String toJson(T t) {
        StringBuilder sb = new StringBuilder();
        try {
            toJson(w8e0.b(sb), t);
            return sb.toString();
        } catch (IOException e) {
            throw new kdp(e);
        }
    }

    public final tcp toJsonTree(T t) {
        try {
            cfp cfpVar = new cfp();
            write(cfpVar, t);
            ArrayList arrayList = cfpVar.a;
            if (arrayList.isEmpty()) {
                return cfpVar.c;
            }
            throw new IllegalStateException("Expected one JSON element but was " + arrayList);
        } catch (IOException e) {
            throw new kdp(e);
        }
    }

    public abstract void write(JsonWriter jsonWriter, T t);

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final void toJson(Writer writer, T t) {
        write(new JsonWriter(writer), t);
    }
}
