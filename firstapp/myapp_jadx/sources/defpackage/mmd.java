package defpackage;

import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public interface mmd {
    default float C1(float f) {
        return getDensity() * f;
    }

    default float D0(long j) {
        if (!pmf0.a(omf0.b(j), 4294967296L)) {
            ykn.b("Only Sp can convert to Px");
        }
        return C1(X(j));
    }

    default int I1(long j) {
        return Math.round(D0(j));
    }

    default long N(float f) {
        float[] fArr = g9i.a;
        if (y1() < 1.03f) {
            return d2l.g(f / y1(), 4294967296L);
        }
        f9i f9iVarA = g9i.a(y1());
        return d2l.g(f9iVarA != null ? f9iVarA.a(f) : f / y1(), 4294967296L);
    }

    default long O(long j) {
        if (j != 9205357640488583168L) {
            return jc1.a(v1(Float.intBitsToFloat((int) (j >> 32))), v1(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long U1(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fC1 = C1(k7f.c(j));
        float fC2 = C1(k7f.b(j));
        return (((long) Float.floatToRawIntBits(fC1)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L);
    }

    default float X(long j) {
        if (!pmf0.a(omf0.b(j), 4294967296L)) {
            ykn.b("Only Sp can convert to Px");
        }
        float[] fArr = g9i.a;
        if (y1() < 1.03f) {
            return y1() * omf0.c(j);
        }
        f9i f9iVarA = g9i.a(y1());
        if (f9iVarA != null) {
            return f9iVarA.b(omf0.c(j));
        }
        return y1() * omf0.c(j);
    }

    default long g0(float f) {
        return N(v1(f));
    }

    float getDensity();

    default float u1(int i) {
        return i / getDensity();
    }

    default float v1(float f) {
        return f / getDensity();
    }

    default int y0(float f) {
        float fC1 = C1(f);
        return Float.isInfinite(fC1) ? Reader.READ_DONE : Math.round(fC1);
    }

    float y1();
}
