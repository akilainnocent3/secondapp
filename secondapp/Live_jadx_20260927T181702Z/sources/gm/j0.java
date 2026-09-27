package gm;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {
    public j0() {
        throw new UnsupportedOperationException();
    }

    public static com.google.gson.j a(JsonReader jsonReader) throws com.google.gson.n {
        boolean z10;
        try {
            try {
                jsonReader.peek();
                z10 = false;
                try {
                    return TypeAdapters.V.e(jsonReader);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return com.google.gson.l.f52561b;
                    }
                    throw new com.google.gson.t(e);
                }
            } catch (EOFException e11) {
                e = e11;
                z10 = true;
            }
        } catch (MalformedJsonException e12) {
            throw new com.google.gson.t(e12);
        } catch (IOException e13) {
            throw new com.google.gson.k(e13);
        } catch (NumberFormatException e14) {
            throw new com.google.gson.t(e14);
        }
    }

    public static void b(com.google.gson.j jVar, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.V.i(jsonWriter, jVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends Writer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Appendable f87163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f87164c = new a();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements CharSequence {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public char[] f87165b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f87166c;

            public a() {
            }

            public void a(char[] cArr) {
                this.f87165b = cArr;
                this.f87166c = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f87165b[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f87165b.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f87165b, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f87166c == null) {
                    this.f87166c = new String(this.f87165b);
                }
                return this.f87166c;
            }
        }

        public b(Appendable appendable) {
            this.f87163b = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.f87164c.a(cArr);
            this.f87163b.append(this.f87164c, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f87163b.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f87163b.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.f87163b.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.f87163b.append(str, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
