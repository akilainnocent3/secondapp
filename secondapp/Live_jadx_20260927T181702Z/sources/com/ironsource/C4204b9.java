package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.b9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4204b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f61082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f61083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private W f61084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f61085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    private String f61086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    private String f61087f;

    public C4204b9(@oy.l String appKey, @oy.l String userId) {
        kotlin.jvm.internal.m0.p(appKey, "appKey");
        kotlin.jvm.internal.m0.p(userId, "userId");
        this.f61082a = appKey;
        this.f61083b = userId;
    }

    @oy.l
    public final String a() {
        return this.f61082a;
    }

    @oy.l
    public final String b() {
        return this.f61083b;
    }

    public final boolean c() {
        return this.f61085d;
    }

    @oy.l
    public final String d() {
        return this.f61082a;
    }

    @oy.m
    public final W e() {
        return this.f61084c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4204b9)) {
            return false;
        }
        C4204b9 c4204b9 = (C4204b9) obj;
        return kotlin.jvm.internal.m0.g(this.f61082a, c4204b9.f61082a) && kotlin.jvm.internal.m0.g(this.f61083b, c4204b9.f61083b);
    }

    @oy.m
    public final String f() {
        return this.f61087f;
    }

    @oy.m
    public final String g() {
        return this.f61086e;
    }

    @oy.l
    public final String h() {
        return this.f61083b;
    }

    public int hashCode() {
        return (this.f61082a.hashCode() * 31) + this.f61083b.hashCode();
    }

    @oy.l
    public String toString() {
        return "InitConfig(appKey=" + this.f61082a + ", userId=" + this.f61083b + gi.j.f86771d;
    }

    @oy.l
    public final C4204b9 a(@oy.l String appKey, @oy.l String userId) {
        kotlin.jvm.internal.m0.p(appKey, "appKey");
        kotlin.jvm.internal.m0.p(userId, "userId");
        return new C4204b9(appKey, userId);
    }

    public final void b(@oy.m String str) {
        this.f61086e = str;
    }

    public static /* synthetic */ C4204b9 a(C4204b9 c4204b9, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4204b9.f61082a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4204b9.f61083b;
        }
        return c4204b9.a(str, str2);
    }

    public final void a(@oy.m W w10) {
        this.f61084c = w10;
    }

    public final void a(boolean z10) {
        this.f61085d = z10;
    }

    public final void a(@oy.m String str) {
        this.f61087f = str;
    }

    public final <T> T a(@oy.l Kb<C4204b9, T> mapper) {
        kotlin.jvm.internal.m0.p(mapper, "mapper");
        return mapper.a(this);
    }
}
