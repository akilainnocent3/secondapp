package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w93 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s93 f157248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f157249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f157250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f157251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f157252f;

    public w93(s93 s93Var, HashMap map, HashMap map2, HashMap map3) {
        this.f157248b = s93Var;
        this.f157251e = map2;
        this.f157252f = map3;
        this.f157250d = Collections.unmodifiableMap(map);
        this.f157249c = s93Var.a();
    }

    @Override // yads.r43
    public final long a(int i10) {
        return this.f157249c[i10];
    }

    @Override // yads.r43
    public final List b(long j10) {
        return this.f157248b.a(j10, this.f157250d, this.f157251e, this.f157252f);
    }

    @Override // yads.r43
    public final int a() {
        return this.f157249c.length;
    }

    @Override // yads.r43
    public final int a(long j10) {
        int iA = ib3.a(this.f157249c, j10, false);
        if (iA < this.f157249c.length) {
            return iA;
        }
        return -1;
    }
}
