package yads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yl1 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final yl1 f158396g = new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wq f158397h = new wq() { // from class: yads.pe4
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return yl1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f158398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f158399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f158400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f158401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f158402f;

    public yl1(long j10, long j11, long j12, float f10, float f11) {
        this.f158398b = j10;
        this.f158399c = j11;
        this.f158400d = j12;
        this.f158401e = f10;
        this.f158402f = f11;
    }

    public static yl1 a(Bundle bundle) {
        return new yl1(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl1)) {
            return false;
        }
        yl1 yl1Var = (yl1) obj;
        return this.f158398b == yl1Var.f158398b && this.f158399c == yl1Var.f158399c && this.f158400d == yl1Var.f158400d && this.f158401e == yl1Var.f158401e && this.f158402f == yl1Var.f158402f;
    }

    public final int hashCode() {
        long j10 = this.f158398b;
        long j11 = this.f158399c;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f158400d;
        int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.f158401e;
        int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f158402f;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
