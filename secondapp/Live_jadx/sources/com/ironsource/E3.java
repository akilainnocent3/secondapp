package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private String f58872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private String f58873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private String f58874c;

    public E3(@oy.l String cachedAppKey, @oy.l String cachedUserId, @oy.l String cachedSettings) {
        kotlin.jvm.internal.m0.p(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.m0.p(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.m0.p(cachedSettings, "cachedSettings");
        this.f58872a = cachedAppKey;
        this.f58873b = cachedUserId;
        this.f58874c = cachedSettings;
    }

    @oy.l
    public final String a() {
        return this.f58872a;
    }

    @oy.l
    public final String b() {
        return this.f58873b;
    }

    @oy.l
    public final String c() {
        return this.f58874c;
    }

    @oy.l
    public final String d() {
        return this.f58872a;
    }

    @oy.l
    public final String e() {
        return this.f58874c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E3)) {
            return false;
        }
        E3 e10 = (E3) obj;
        return kotlin.jvm.internal.m0.g(this.f58872a, e10.f58872a) && kotlin.jvm.internal.m0.g(this.f58873b, e10.f58873b) && kotlin.jvm.internal.m0.g(this.f58874c, e10.f58874c);
    }

    @oy.l
    public final String f() {
        return this.f58873b;
    }

    public int hashCode() {
        return (((this.f58872a.hashCode() * 31) + this.f58873b.hashCode()) * 31) + this.f58874c.hashCode();
    }

    @oy.l
    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.f58872a + ", cachedUserId=" + this.f58873b + ", cachedSettings=" + this.f58874c + gi.j.f86771d;
    }

    @oy.l
    public final E3 a(@oy.l String cachedAppKey, @oy.l String cachedUserId, @oy.l String cachedSettings) {
        kotlin.jvm.internal.m0.p(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.m0.p(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.m0.p(cachedSettings, "cachedSettings");
        return new E3(cachedAppKey, cachedUserId, cachedSettings);
    }

    public final void b(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<set-?>");
        this.f58874c = str;
    }

    public final void c(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<set-?>");
        this.f58873b = str;
    }

    public static /* synthetic */ E3 a(E3 e10, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = e10.f58872a;
        }
        if ((i10 & 2) != 0) {
            str2 = e10.f58873b;
        }
        if ((i10 & 4) != 0) {
            str3 = e10.f58874c;
        }
        return e10.a(str, str2, str3);
    }

    public final void a(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<set-?>");
        this.f58872a = str;
    }
}
