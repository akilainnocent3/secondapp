package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class j58 {
    public static final long b = r58.d(4278190080L);
    public static final long c = r58.d(4282664004L);
    public static final long d = r58.d(4287137928L);
    public static final long e = r58.d(4291611852L);
    public static final long f = r58.d(4294967295L);
    public static final long g = r58.d(4294901760L);
    public static final long h = r58.d(4278255360L);
    public static final long i = r58.d(4278190335L);
    public static final long j = r58.d(4294967040L);
    public static final long k = r58.d(4278255615L);
    public static final long l;
    public static final long m;
    public static final /* synthetic */ int n = 0;
    public final long a;

    static {
        r58.d(4294902015L);
        l = r58.b(0);
        m = r58.a(0.0f, 0.0f, 0.0f, 0.0f, x68.u);
    }

    public /* synthetic */ j58(long j2) {
        this.a = j2;
    }

    public static final /* synthetic */ j58 a(long j2) {
        return new j58(j2);
    }

    public static final long b(long j2, h68 h68Var) {
        jva jvaVarD;
        h68 h68VarF = f(j2);
        int i2 = h68VarF.c;
        int i3 = h68Var.c;
        if ((i2 | i3) < 0) {
            jvaVarD = i68.d(h68VarF, h68Var);
        } else {
            msw<jva> mswVar = kva.a;
            int i4 = i2 | (i3 << 6);
            jva jvaVarB = mswVar.b(i4);
            if (jvaVarB == null) {
                jvaVarB = i68.d(h68VarF, h68Var);
                mswVar.h(i4, jvaVarB);
            }
            jvaVarD = jvaVarB;
        }
        return jvaVarD.a(j2);
    }

    public static long c(float f2, long j2) {
        return r58.a(h(j2), g(j2), e(j2), f2, f(j2));
    }

    public static final float d(long j2) {
        float fA;
        float f2;
        long j3 = 63 & j2;
        nbh0.a aVar = nbh0.b;
        if (j3 == 0) {
            fA = (float) j250.a((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fA = (float) j250.a((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fA / f2;
    }

    public static final float e(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        nbh0.a aVar = nbh0.b;
        if (j3 == 0) {
            return ((float) j250.a((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - mwh.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final h68 f(long j2) {
        float[] fArr = x68.a;
        nbh0.a aVar = nbh0.b;
        return x68.y[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        nbh0.a aVar = nbh0.b;
        if (j3 == 0) {
            return ((float) j250.a((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - mwh.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        nbh0.a aVar = nbh0.b;
        if (j3 == 0) {
            return ((float) j250.a((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - mwh.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        return j26.a(sb, f(j2).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j58) {
            return this.a == ((j58) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
