package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ym1 f155480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f155481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f155482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f155483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f155484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f155485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f155486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f155487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f155488i;

    public sm1(ym1 ym1Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        ni.a(!z13 || z11);
        ni.a(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        ni.a(z14);
        this.f155480a = ym1Var;
        this.f155481b = j10;
        this.f155482c = j11;
        this.f155483d = j12;
        this.f155484e = j13;
        this.f155485f = z10;
        this.f155486g = z11;
        this.f155487h = z12;
        this.f155488i = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sm1.class == obj.getClass()) {
            sm1 sm1Var = (sm1) obj;
            if (this.f155481b == sm1Var.f155481b && this.f155482c == sm1Var.f155482c && this.f155483d == sm1Var.f155483d && this.f155484e == sm1Var.f155484e && this.f155485f == sm1Var.f155485f && this.f155486g == sm1Var.f155486g && this.f155487h == sm1Var.f155487h && this.f155488i == sm1Var.f155488i && ib3.a(this.f155480a, sm1Var.f155480a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f155480a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f155481b)) * 31) + ((int) this.f155482c)) * 31) + ((int) this.f155483d)) * 31) + ((int) this.f155484e)) * 31) + (this.f155485f ? 1 : 0)) * 31) + (this.f155486g ? 1 : 0)) * 31) + (this.f155487h ? 1 : 0)) * 31) + (this.f155488i ? 1 : 0);
    }
}
