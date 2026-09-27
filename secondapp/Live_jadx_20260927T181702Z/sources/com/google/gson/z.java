package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.ironsource.C4235d4;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z<T> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class b extends z<T> {
        public b() {
        }

        @Override // com.google.gson.z
        public T e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (T) z.this.e(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.z
        public void i(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
            } else {
                z.this.i(jsonWriter, t10);
            }
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + z.this + C4235d4.j.f61462e;
        }
    }

    public final T a(Reader reader) throws IOException {
        return e(new JsonReader(reader));
    }

    public final T b(String str) throws IOException {
        return a(new StringReader(str));
    }

    public final T c(j jVar) {
        try {
            return e(new com.google.gson.internal.bind.b(jVar));
        } catch (IOException e10) {
            throw new k(e10);
        }
    }

    public final z<T> d() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract T e(JsonReader jsonReader) throws IOException;

    public final String f(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            g(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new k(e10);
        }
    }

    public final void g(Writer writer, T t10) throws IOException {
        i(new JsonWriter(writer), t10);
    }

    public final j h(T t10) {
        try {
            com.google.gson.internal.bind.c cVar = new com.google.gson.internal.bind.c();
            i(cVar, t10);
            return cVar.d();
        } catch (IOException e10) {
            throw new k(e10);
        }
    }

    public abstract void i(JsonWriter jsonWriter, T t10) throws IOException;
}
