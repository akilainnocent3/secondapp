package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qt implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f154596b;

    public qt(List list) {
        this.f154596b = list;
    }

    @Override // yads.r43
    public final int a() {
        return 1;
    }

    @Override // yads.r43
    public final List b(long j10) {
        return j10 >= 0 ? this.f154596b : Collections.EMPTY_LIST;
    }

    @Override // yads.r43
    public final int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
