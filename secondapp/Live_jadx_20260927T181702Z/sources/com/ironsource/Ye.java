package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final O f60382a;

    public Ye(@oy.m O o10) {
        this.f60382a = o10;
    }

    @oy.m
    public final O a() {
        return this.f60382a;
    }

    @oy.l
    public abstract EnumC4282ff b();

    @oy.l
    public final C4531u a(@oy.l Kb<Ye, C4531u> mapper) {
        kotlin.jvm.internal.m0.p(mapper, "mapper");
        return mapper.a(this);
    }
}
