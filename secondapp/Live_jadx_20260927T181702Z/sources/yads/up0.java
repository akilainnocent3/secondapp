package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class up0 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f156540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p51 f156541c;

    public up0(long j10, sm2 sm2Var) {
        this.f156540b = j10;
        this.f156541c = sm2Var;
    }

    @Override // yads.r43
    public final int a() {
        return 1;
    }

    @Override // yads.r43
    public final List b(long j10) {
        if (j10 >= this.f156540b) {
            return this.f156541c;
        }
        m51 m51Var = p51.f153747c;
        return sm2.f155489f;
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 == 0) {
            return this.f156540b;
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final int a(long j10) {
        return this.f156540b > j10 ? 0 : -1;
    }
}
