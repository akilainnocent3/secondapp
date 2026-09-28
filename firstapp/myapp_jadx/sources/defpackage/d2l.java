package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d2l {
    public static final /* synthetic */ int a = 0;

    public static final void a(long j) {
        pmf0[] pmf0VarArr = omf0.b;
        if ((j & 1095216660480L) == 0) {
            ykn.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void b(long j, long j2) {
        pmf0[] pmf0VarArr = omf0.b;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            ykn.a("Cannot perform operation for Unspecified type.");
        }
        if (pmf0.a(omf0.b(j), omf0.b(j2))) {
            return;
        }
        ykn.a("Cannot perform operation for " + ((Object) pmf0.b(omf0.b(j))) + " and " + ((Object) pmf0.b(omf0.b(j2))));
    }

    public static final long c(int i) {
        return g(i, 8589934592L);
    }

    public static final long d(double d) {
        return g((float) d, 4294967296L);
    }

    public static final long e(float f) {
        return g(f, 4294967296L);
    }

    public static final long f(int i) {
        return g(i, 4294967296L);
    }

    public static final long g(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        pmf0[] pmf0VarArr = omf0.b;
        return jFloatToRawIntBits;
    }
}
