package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a730 implements vby {
    public static final Charset e = Charset.forName("UTF-8");
    public static final hjh f = new hjh("key", be1.a(ae1.a(v630.class, new o11(1))));
    public static final hjh g = new hjh("value", be1.a(ae1.a(v630.class, new o11(2))));
    public static final z630 h = new z630();
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final d730 d = new d730(this);

    public a730(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
    }

    public static int k(hjh hjhVar) {
        v630 v630Var = (v630) ((Annotation) hjhVar.b.get(v630.class));
        if (v630Var != null) {
            return v630Var.tag();
        }
        throw new k4g("Field has no @Protobuf config");
    }

    @Override // defpackage.vby
    public final vby a(hjh hjhVar, Object obj) throws IOException {
        i(hjhVar, obj, true);
        return this;
    }

    public final void b(hjh hjhVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        l((k(hjhVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(hjh hjhVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return;
        }
        v630 v630Var = (v630) ((Annotation) hjhVar.b.get(v630.class));
        if (v630Var == null) {
            throw new k4g("Field has no @Protobuf config");
        }
        int iOrdinal = v630Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(v630Var.tag() << 3);
            l(i);
        } else if (iOrdinal == 1) {
            l(v630Var.tag() << 3);
            l((i << 1) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((v630Var.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    @Override // defpackage.vby
    public final vby d(hjh hjhVar, boolean z) throws IOException {
        c(hjhVar, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.vby
    public final vby e(hjh hjhVar, int i) throws IOException {
        c(hjhVar, i, true);
        return this;
    }

    @Override // defpackage.vby
    public final vby f(hjh hjhVar, double d) throws IOException {
        b(hjhVar, d, true);
        return this;
    }

    @Override // defpackage.vby
    public final vby g(hjh hjhVar, long j) throws IOException {
        h(hjhVar, j, true);
        return this;
    }

    public final void h(hjh hjhVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        v630 v630Var = (v630) ((Annotation) hjhVar.b.get(v630.class));
        if (v630Var == null) {
            throw new k4g("Field has no @Protobuf config");
        }
        int iOrdinal = v630Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(v630Var.tag() << 3);
            m(j);
        } else if (iOrdinal == 1) {
            l(v630Var.tag() << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((v630Var.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(hjh hjhVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((k(hjhVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(e);
            l(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(hjhVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(h, hjhVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(hjhVar, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            l((k(hjhVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(hjhVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(hjhVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((k(hjhVar) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return;
        }
        uby ubyVar = (uby) this.b.get(obj.getClass());
        if (ubyVar != null) {
            j(ubyVar, hjhVar, obj, z);
            return;
        }
        yuh0 yuh0Var = (yuh0) this.c.get(obj.getClass());
        if (yuh0Var != null) {
            d730 d730Var = this.d;
            d730Var.a = false;
            d730Var.c = hjhVar;
            d730Var.b = z;
            yuh0Var.a(obj, d730Var);
            return;
        }
        if (obj instanceof m630) {
            c(hjhVar, ((m630) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            c(hjhVar, ((Enum) obj).ordinal(), true);
        } else {
            j(c730.a.a, hjhVar, obj, z);
        }
    }

    public final void j(uby ubyVar, hjh hjhVar, Object obj, boolean z) throws IOException {
        r6s r6sVar = new r6s();
        r6sVar.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = r6sVar;
            try {
                ubyVar.a(obj, this);
                this.a = outputStream;
                long j = r6sVar.a;
                r6sVar.close();
                if (z && j == 0) {
                    return;
                }
                l((k(hjhVar) << 3) | 2);
                m(j);
                ubyVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                r6sVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    public final void m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
