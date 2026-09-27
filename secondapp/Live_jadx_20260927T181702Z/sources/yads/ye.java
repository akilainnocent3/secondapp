package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f158260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s63 f158261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f158262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ym1 f158263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f158264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s63 f158265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f158266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ym1 f158267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f158268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f158269j;

    public ye(long j10, s63 s63Var, int i10, ym1 ym1Var, long j11, s63 s63Var2, int i11, ym1 ym1Var2, long j12, long j13) {
        this.f158260a = j10;
        this.f158261b = s63Var;
        this.f158262c = i10;
        this.f158263d = ym1Var;
        this.f158264e = j11;
        this.f158265f = s63Var2;
        this.f158266g = i11;
        this.f158267h = ym1Var2;
        this.f158268i = j12;
        this.f158269j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ye.class == obj.getClass()) {
            ye yeVar = (ye) obj;
            if (this.f158260a == yeVar.f158260a && this.f158262c == yeVar.f158262c && this.f158264e == yeVar.f158264e && this.f158266g == yeVar.f158266g && this.f158268i == yeVar.f158268i && this.f158269j == yeVar.f158269j && l92.a(this.f158261b, yeVar.f158261b) && l92.a(this.f158263d, yeVar.f158263d) && l92.a(this.f158265f, yeVar.f158265f) && l92.a(this.f158267h, yeVar.f158267h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f158260a), this.f158261b, Integer.valueOf(this.f158262c), this.f158263d, Long.valueOf(this.f158264e), this.f158265f, Integer.valueOf(this.f158266g), this.f158267h, Long.valueOf(this.f158268i), Long.valueOf(this.f158269j)});
    }
}
