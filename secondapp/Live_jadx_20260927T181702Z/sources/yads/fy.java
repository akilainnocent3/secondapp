package yads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fy extends hy {
    @Override // yads.hy
    public final int a() {
        return 0;
    }

    @Override // yads.hy
    public final hy b(boolean z10, boolean z11) {
        return a(lq.a(z11, z10));
    }

    public static hy a(int i10) {
        if (i10 < 0) {
            return hy.f150338b;
        }
        return i10 > 0 ? hy.f150339c : hy.f150337a;
    }

    @Override // yads.hy
    public final hy a(int i10, int i11) {
        int i12;
        if (i10 < i11) {
            i12 = -1;
        } else {
            i12 = i10 > i11 ? 1 : 0;
        }
        return a(i12);
    }

    @Override // yads.hy
    public final hy a(long j10, long j11) {
        int i10;
        if (j10 < j11) {
            i10 = -1;
        } else {
            i10 = j10 > j11 ? 1 : 0;
        }
        return a(i10);
    }

    @Override // yads.hy
    public final hy a(Object obj, Object obj2, Comparator comparator) {
        return a(comparator.compare(obj, obj2));
    }

    @Override // yads.hy
    public final hy a(boolean z10, boolean z11) {
        return a(lq.a(z10, z11));
    }
}
