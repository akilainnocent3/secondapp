package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f59991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final String f59992b;

    public Rc(@oy.l String url, @oy.m String str) {
        kotlin.jvm.internal.m0.p(url, "url");
        this.f59991a = url;
        this.f59992b = str;
    }

    @oy.l
    public final String a() {
        return this.f59991a;
    }

    @oy.m
    public final String b() {
        return this.f59992b;
    }

    @oy.m
    public final String c() {
        return this.f59992b;
    }

    @oy.l
    public final String d() {
        return this.f59991a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rc)) {
            return false;
        }
        Rc rc2 = (Rc) obj;
        return kotlin.jvm.internal.m0.g(this.f59991a, rc2.f59991a) && kotlin.jvm.internal.m0.g(this.f59992b, rc2.f59992b);
    }

    public int hashCode() {
        int iHashCode = this.f59991a.hashCode() * 31;
        String str = this.f59992b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @oy.l
    public String toString() {
        return "OpenUrl(url=" + this.f59991a + ", packageName=" + this.f59992b + gi.j.f86771d;
    }

    public /* synthetic */ Rc(String str, String str2, int i10, kotlin.jvm.internal.x xVar) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    @oy.l
    public final Rc a(@oy.l String url, @oy.m String str) {
        kotlin.jvm.internal.m0.p(url, "url");
        return new Rc(url, str);
    }

    public static /* synthetic */ Rc a(Rc rc2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rc2.f59991a;
        }
        if ((i10 & 2) != 0) {
            str2 = rc2.f59992b;
        }
        return rc2.a(str, str2);
    }
}
