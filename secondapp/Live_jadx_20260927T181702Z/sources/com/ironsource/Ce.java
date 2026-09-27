package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ce {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private static Boolean f58534b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final Ce f58533a = new Ce();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private static Be f58535c = Be.NOT_INIT;

    private Ce() {
    }

    @oy.l
    public final synchronized Be a() {
        return f58535c;
    }

    @oy.l
    public final Be b() {
        Boolean bool = f58534b;
        if (bool == null ? true : kotlin.jvm.internal.m0.g(bool, Boolean.FALSE)) {
            return Be.NOT_INIT;
        }
        if (kotlin.jvm.internal.m0.g(bool, Boolean.TRUE)) {
            return f58535c;
        }
        throw new dr.o0();
    }

    public final synchronized void a(@oy.l Be be2) {
        kotlin.jvm.internal.m0.p(be2, "<set-?>");
        f58535c = be2;
    }

    public final void a(boolean z10) {
        f58534b = Boolean.valueOf(z10);
    }
}
