package com.google.gson.internal.bind;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends JsonWriter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Writer f52540e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f52541f = new p("closed");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<j> f52542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f52543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f52544d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public c() {
        super(f52540e);
        this.f52542b = new ArrayList();
        this.f52544d = l.f52561b;
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter beginArray() throws IOException {
        g gVar = new g();
        i(gVar);
        this.f52542b.add(gVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter beginObject() throws IOException {
        m mVar = new m();
        i(mVar);
        this.f52542b.add(mVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f52542b.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f52542b.add(f52541f);
    }

    public j d() {
        if (this.f52542b.isEmpty()) {
            return this.f52544d;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f52542b);
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter endArray() throws IOException {
        if (this.f52542b.isEmpty() || this.f52543c != null) {
            throw new IllegalStateException();
        }
        if (!(h() instanceof g)) {
            throw new IllegalStateException();
        }
        List<j> list = this.f52542b;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter endObject() throws IOException {
        if (this.f52542b.isEmpty() || this.f52543c != null) {
            throw new IllegalStateException();
        }
        if (!(h() instanceof m)) {
            throw new IllegalStateException();
        }
        List<j> list = this.f52542b;
        list.remove(list.size() - 1);
        return this;
    }

    public final j h() {
        List<j> list = this.f52542b;
        return list.get(list.size() - 1);
    }

    public final void i(j jVar) {
        if (this.f52543c != null) {
            if (!jVar.w() || getSerializeNulls()) {
                ((m) h()).z(this.f52543c, jVar);
            }
            this.f52543c = null;
            return;
        }
        if (this.f52542b.isEmpty()) {
            this.f52544d = jVar;
            return;
        }
        j jVarH = h();
        if (!(jVarH instanceof g)) {
            throw new IllegalStateException();
        }
        ((g) jVarH).z(jVar);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f52542b.isEmpty() || this.f52543c != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(h() instanceof m)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f52543c = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter nullValue() throws IOException {
        i(l.f52561b);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        i(new p(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter value(boolean z10) throws IOException {
        i(new p(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        i(new p(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter value(float f10) throws IOException {
        if (!isLenient() && (Float.isNaN(f10) || Float.isInfinite(f10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f10);
        }
        i(new p(Float.valueOf(f10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter value(double d10) throws IOException {
        if (!isLenient() && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        i(new p(Double.valueOf(d10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter value(long j10) throws IOException {
        i(new p(Long.valueOf(j10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    @qj.a
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        i(new p(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }
}
