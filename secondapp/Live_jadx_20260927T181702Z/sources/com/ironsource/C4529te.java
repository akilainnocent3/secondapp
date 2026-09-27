package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.te, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4529te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f64170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final String f64171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final List<IronSource.a> f64172c;

    public C4529te(@oy.l String appKey, @oy.m String str, @oy.l List<IronSource.a> legacyAdFormats) {
        kotlin.jvm.internal.m0.p(appKey, "appKey");
        kotlin.jvm.internal.m0.p(legacyAdFormats, "legacyAdFormats");
        this.f64170a = appKey;
        this.f64171b = str;
        this.f64172c = legacyAdFormats;
    }

    @oy.l
    public final String a() {
        return this.f64170a;
    }

    @oy.m
    public final String b() {
        return this.f64171b;
    }

    @oy.l
    public final List<IronSource.a> c() {
        return this.f64172c;
    }

    @oy.l
    public final String d() {
        return this.f64170a;
    }

    @oy.l
    public final List<IronSource.a> e() {
        return this.f64172c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4529te)) {
            return false;
        }
        C4529te c4529te = (C4529te) obj;
        return kotlin.jvm.internal.m0.g(this.f64170a, c4529te.f64170a) && kotlin.jvm.internal.m0.g(this.f64171b, c4529te.f64171b) && kotlin.jvm.internal.m0.g(this.f64172c, c4529te.f64172c);
    }

    @oy.m
    public final String f() {
        return this.f64171b;
    }

    public int hashCode() {
        int iHashCode = this.f64170a.hashCode() * 31;
        String str = this.f64171b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f64172c.hashCode();
    }

    @oy.l
    public String toString() {
        return "SdkInitRequest(appKey=" + this.f64170a + ", userId=" + this.f64171b + ", legacyAdFormats=" + this.f64172c + gi.j.f86771d;
    }

    @oy.l
    public final C4529te a(@oy.l String appKey, @oy.m String str, @oy.l List<IronSource.a> legacyAdFormats) {
        kotlin.jvm.internal.m0.p(appKey, "appKey");
        kotlin.jvm.internal.m0.p(legacyAdFormats, "legacyAdFormats");
        return new C4529te(appKey, str, legacyAdFormats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4529te a(C4529te c4529te, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4529te.f64170a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4529te.f64171b;
        }
        if ((i10 & 4) != 0) {
            list = c4529te.f64172c;
        }
        return c4529te.a(str, str2, list);
    }

    public final void a(@oy.l List<? extends IronSource.a> adFormats) {
        kotlin.jvm.internal.m0.p(adFormats, "adFormats");
        this.f64172c.clear();
        this.f64172c.addAll(adFormats);
    }

    public /* synthetic */ C4529te(String str, String str2, List list, int i10, kotlin.jvm.internal.x xVar) {
        this(str, (i10 & 2) != 0 ? null : str2, list);
    }
}
