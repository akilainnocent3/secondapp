package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class yep extends JsonReader {
    public static final a e = new a();
    public static final Object f = new Object();
    public Object[] a;
    public int b;
    public String[] c;
    public int[] d;

    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public yep(tcp tcpVar) {
        super(e);
        this.a = new Object[32];
        this.b = 0;
        this.c = new String[32];
        this.d = new int[32];
        o(tcpVar);
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() {
        d(JsonToken.BEGIN_ARRAY);
        o(((bcp) l()).a.iterator());
        this.d[this.b - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() {
        d(JsonToken.BEGIN_OBJECT);
        o(((hgs.b) ((xdp) l()).a.entrySet()).iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a = new Object[]{f};
        this.b = 1;
    }

    public final void d(JsonToken jsonToken) {
        if (peek() == jsonToken) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(jsonToken);
        sb.append(" but was ");
        sb.append(peek());
        lpd0.a(sb, f());
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() {
        d(JsonToken.END_ARRAY);
        m();
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() {
        d(JsonToken.END_OBJECT);
        this.c[this.b - 1] = null;
        m();
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String f() {
        return " at path ".concat(getPath(false));
    }

    public final String g(boolean z) {
        d(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) l()).next();
        String str = (String) entry.getKey();
        this.c[this.b - 1] = z ? "<skipped>" : str;
        o(entry.getValue());
        return str;
    }

    public final String getPath(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.a;
            Object obj = objArr[i];
            if (obj instanceof bcp) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.d[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof xdp) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.c[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_DOCUMENT) ? false : true;
    }

    public final Object l() {
        return this.a[this.b - 1];
    }

    public final Object m() {
        Object[] objArr = this.a;
        int i = this.b - 1;
        this.b = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() {
        d(JsonToken.BOOLEAN);
        boolean zA = ((cep) m()).a();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zA;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(jsonTokenPeek);
            lpd0.a(sb, f());
            return 0.0d;
        }
        double dI = ((cep) l()).i();
        if (!isLenient() && (Double.isNaN(dI) || Double.isInfinite(dI))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dI);
        }
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dI;
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(jsonTokenPeek);
            lpd0.a(sb, f());
            return 0;
        }
        int iB = ((cep) l()).b();
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iB;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(jsonTokenPeek);
            lpd0.a(sb, f());
            return 0L;
        }
        cep cepVar = (cep) l();
        long jLongValue = cepVar.a instanceof Number ? cepVar.j().longValue() : Long.parseLong(cepVar.f());
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jLongValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() {
        return g(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() {
        d(JsonToken.NULL);
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() throws MalformedJsonException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.NUMBER) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(jsonTokenPeek);
            lpd0.a(sb, f());
            return null;
        }
        String strF = ((cep) m()).f();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strF;
    }

    public final void o(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.a = Arrays.copyOf(objArr, i2);
            this.d = Arrays.copyOf(this.d, i2);
            this.c = (String[]) Arrays.copyOf(this.c, i2);
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() throws MalformedJsonException {
        if (this.b == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objL = l();
        if (objL instanceof Iterator) {
            boolean z = this.a[this.b - 2] instanceof xdp;
            Iterator it = (Iterator) objL;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            o(it.next());
            return peek();
        }
        if (objL instanceof xdp) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objL instanceof bcp) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (objL instanceof cep) {
            Serializable serializable = ((cep) objL).a;
            if (serializable instanceof String) {
                return JsonToken.STRING;
            }
            if (serializable instanceof Boolean) {
                return JsonToken.BOOLEAN;
            }
            if (serializable instanceof Number) {
                return JsonToken.NUMBER;
            }
            x01.a();
            return null;
        }
        if (objL instanceof tdp) {
            return JsonToken.NULL;
        }
        if (objL == f) {
            ib5.a("JsonReader is closed");
            return null;
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objL.getClass().getName() + " is not supported");
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() throws MalformedJsonException {
        int i = b.a[peek().ordinal()];
        if (i == 1) {
            g(true);
            return;
        }
        if (i == 2) {
            endArray();
            return;
        }
        if (i == 3) {
            endObject();
            return;
        }
        if (i != 4) {
            m();
            int i2 = this.b;
            if (i2 > 0) {
                int[] iArr = this.d;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return yep.class.getSimpleName().concat(f());
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        return getPath(false);
    }
}
