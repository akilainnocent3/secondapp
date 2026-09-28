package defpackage;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class w8e0 {
    public static tcp a(JsonReader jsonReader) {
        boolean z;
        try {
            try {
                jsonReader.peek();
                z = false;
                try {
                    return (tcp) TypeAdapters.z.read(jsonReader);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return tdp.a;
                    }
                    throw new qep(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (MalformedJsonException e3) {
            throw new qep(e3);
        } catch (IOException e4) {
            throw new kdp(e4);
        } catch (NumberFormatException e5) {
            throw new qep(e5);
        }
    }

    public static Writer b(StringBuilder sb) {
        return new a(sb);
    }

    public static final class a extends Writer {
        public final StringBuilder a;
        public final C1241a b = new C1241a();

        /* JADX INFO: renamed from: w8e0$a$a, reason: collision with other inner class name */
        public static class C1241a implements CharSequence {
            public char[] a;
            public String b;

            @Override // java.lang.CharSequence
            public final char charAt(int i) {
                return this.a[i];
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.a.length;
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i, int i2) {
                return new String(this.a, i, i2 - i);
            }

            @Override // java.lang.CharSequence
            public final String toString() {
                String str = this.b;
                if (str != null) {
                    return str;
                }
                String str2 = new String(this.a);
                this.b = str2;
                return str2;
            }
        }

        public a(StringBuilder sb) {
            this.a = sb;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence) {
            this.a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            C1241a c1241a = this.b;
            c1241a.a = cArr;
            c1241a.b = null;
            this.a.append((CharSequence) c1241a, i, i2 + i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            this.a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence, int i, int i2) {
            this.a.append(charSequence, i, i2);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            this.a.append(charSequence, i, i2);
            return this;
        }

        @Override // java.io.Writer
        public final void write(String str, int i, int i2) {
            Objects.requireNonNull(str);
            this.a.append((CharSequence) str, i, i2 + i);
        }

        @Override // java.io.Writer
        public final void write(int i) {
            this.a.append((char) i);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }
    }
}
