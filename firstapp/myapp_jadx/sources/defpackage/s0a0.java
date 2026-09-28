package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s0a0 {
    public static final long b = d0a0.h(Float.NaN, Float.NaN);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ s0a0(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        ib5.a("SliderRange is unspecified");
        return 0.0f;
    }

    public static final float b(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        ib5.a("SliderRange is unspecified");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0a0) {
            return this.a == ((s0a0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        float f = d0a0.a;
        long j = b;
        long j2 = this.a;
        if (j2 == j) {
            return "FloatRange.Unspecified";
        }
        return b(j2) + ".." + a(j2);
    }
}
