package zt;

import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f162369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f162370c;

    a(boolean z10, boolean z11) {
        this.f162369b = z10;
        this.f162370c = z11;
    }

    public final boolean g() {
        return this.f162369b;
    }

    public final boolean h() {
        return this.f162370c;
    }

    /* synthetic */ a(boolean z10, boolean z11, int i10, x xVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }
}
