package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y93 implements r43 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y93 f158203c = new y93();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f158204b;

    public y93() {
        this.f158204b = Collections.EMPTY_LIST;
    }

    @Override // yads.r43
    public final int a() {
        return 1;
    }

    @Override // yads.r43
    public final List b(long j10) {
        return j10 >= 0 ? this.f158204b : Collections.EMPTY_LIST;
    }

    @Override // yads.r43
    public final int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public y93(o20 o20Var) {
        this.f158204b = Collections.singletonList(o20Var);
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
