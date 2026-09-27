package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final Y1 f60328a = new Y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final String f60329b = "trials_fail";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final String f60330c = "parsing";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final String f60331d = "other";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final String f60332e = "disabled";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final String f60333f = "-1";

    private Y1() {
    }

    @oy.l
    public final String a(boolean z10) {
        if (!z10) {
            return f60333f;
        }
        return "fallback_" + System.currentTimeMillis();
    }

    public static /* synthetic */ String a(Y1 y10, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return y10.a(z10, num);
    }

    @oy.l
    public final String a(boolean z10, @oy.m Integer num) {
        if (!z10) {
            return f60332e;
        }
        if (num != null && num.intValue() == 1003) {
            return f60330c;
        }
        if (num != null && num.intValue() == 1008) {
            return f60330c;
        }
        if (num != null && num.intValue() == 1002) {
            return f60330c;
        }
        if (num != null && num.intValue() == 1006) {
            return f60329b;
        }
        return (num != null && num.intValue() == 1001) ? f60329b : "other";
    }
}
