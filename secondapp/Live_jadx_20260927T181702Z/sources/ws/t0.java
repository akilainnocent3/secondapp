package ws;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final i f143807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final List<ou.k1> f143808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public final t0 f143809c;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(@oy.l i classifierDescriptor, @oy.l List<? extends ou.k1> arguments, @oy.m t0 t0Var) {
        kotlin.jvm.internal.m0.p(classifierDescriptor, "classifierDescriptor");
        kotlin.jvm.internal.m0.p(arguments, "arguments");
        this.f143807a = classifierDescriptor;
        this.f143808b = arguments;
        this.f143809c = t0Var;
    }

    @oy.l
    public final List<ou.k1> a() {
        return this.f143808b;
    }

    @oy.l
    public final i b() {
        return this.f143807a;
    }

    @oy.m
    public final t0 c() {
        return this.f143809c;
    }
}
