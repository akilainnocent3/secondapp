package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f151610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f151611b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn(Map map) {
        this(t01.a(map, u11.U), t01.a(map, u11.V));
        t01.a(map, u11.T);
    }

    public final boolean a() {
        return this.f151610a;
    }

    public kn(boolean z10, boolean z11) {
        this.f151610a = z10;
        this.f151611b = z11;
    }
}
