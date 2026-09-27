package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import gm.j0;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements Iterator<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonReader f52565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f52566c;

    public s(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j next() throws n {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return j0.a(this.f52565b);
        } catch (OutOfMemoryError | StackOverflowError e10) {
            throw new n("Failed parsing JSON source to Json", e10);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z10;
        synchronized (this.f52566c) {
            try {
                try {
                    try {
                        z10 = this.f52565b.peek() != JsonToken.END_DOCUMENT;
                    } catch (IOException e10) {
                        throw new k(e10);
                    }
                } catch (MalformedJsonException e11) {
                    throw new t(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public s(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.f52565b = jsonReader;
        jsonReader.setStrictness(w.LENIENT);
        this.f52566c = new Object();
    }
}
