package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class q43 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o20[] f154264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f154265c;

    public q43(o20[] o20VarArr, long[] jArr) {
        this.f154264b = o20VarArr;
        this.f154265c = jArr;
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f154265c;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        o20 o20Var;
        int iB = ib3.b(this.f154265c, j10, false);
        return (iB == -1 || (o20Var = this.f154264b[iB]) == o20.f153316s) ? Collections.EMPTY_LIST : Collections.singletonList(o20Var);
    }

    @Override // yads.r43
    public final int a() {
        return this.f154265c.length;
    }

    @Override // yads.r43
    public final int a(long j10) {
        int iA = ib3.a(this.f154265c, j10, false);
        if (iA < this.f154265c.length) {
            return iA;
        }
        return -1;
    }
}
