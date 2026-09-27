package yads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class tl1 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f155942g = new wq() { // from class: yads.kb4
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return tl1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f155943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f155944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f155945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f155946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f155947f;

    public tl1(sl1 sl1Var) {
        this.f155943b = sl1Var.f155473a;
        this.f155944c = sl1Var.f155474b;
        this.f155945d = sl1Var.f155475c;
        this.f155946e = sl1Var.f155476d;
        this.f155947f = sl1Var.f155477e;
    }

    public static ul1 a(Bundle bundle) {
        sl1 sl1Var = new sl1();
        long j10 = bundle.getLong(Integer.toString(0, 36), 0L);
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        sl1Var.f155473a = j10;
        long j11 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
        if (j11 != Long.MIN_VALUE && j11 < 0) {
            throw new IllegalArgumentException();
        }
        sl1Var.f155474b = j11;
        sl1Var.f155475c = bundle.getBoolean(Integer.toString(2, 36), false);
        sl1Var.f155476d = bundle.getBoolean(Integer.toString(3, 36), false);
        sl1Var.f155477e = bundle.getBoolean(Integer.toString(4, 36), false);
        return new ul1(sl1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl1)) {
            return false;
        }
        tl1 tl1Var = (tl1) obj;
        return this.f155943b == tl1Var.f155943b && this.f155944c == tl1Var.f155944c && this.f155945d == tl1Var.f155945d && this.f155946e == tl1Var.f155946e && this.f155947f == tl1Var.f155947f;
    }

    public final int hashCode() {
        long j10 = this.f155943b;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f155944c;
        return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f155945d ? 1 : 0)) * 31) + (this.f155946e ? 1 : 0)) * 31) + (this.f155947f ? 1 : 0);
    }
}
