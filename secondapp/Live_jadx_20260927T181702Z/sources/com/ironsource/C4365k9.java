package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4365k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f62214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f62215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final EnumC4401m9 f62216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    private final JSONObject f62217d;

    public C4365k9(@oy.l String url, @oy.l String storePackage, @oy.l EnumC4401m9 strategy, @oy.m JSONObject jSONObject) {
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(storePackage, "storePackage");
        kotlin.jvm.internal.m0.p(strategy, "strategy");
        this.f62214a = url;
        this.f62215b = storePackage;
        this.f62216c = strategy;
        this.f62217d = jSONObject;
    }

    @oy.l
    public final String a() {
        return this.f62214a;
    }

    @oy.l
    public final String b() {
        return this.f62215b;
    }

    @oy.l
    public final EnumC4401m9 c() {
        return this.f62216c;
    }

    @oy.m
    public final JSONObject d() {
        return this.f62217d;
    }

    @oy.m
    public final JSONObject e() {
        return this.f62217d;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4365k9)) {
            return false;
        }
        C4365k9 c4365k9 = (C4365k9) obj;
        return kotlin.jvm.internal.m0.g(this.f62214a, c4365k9.f62214a) && kotlin.jvm.internal.m0.g(this.f62215b, c4365k9.f62215b) && this.f62216c == c4365k9.f62216c && kotlin.jvm.internal.m0.g(this.f62217d, c4365k9.f62217d);
    }

    @oy.l
    public final String f() {
        return this.f62215b;
    }

    @oy.l
    public final EnumC4401m9 g() {
        return this.f62216c;
    }

    @oy.l
    public final String h() {
        return this.f62214a;
    }

    public int hashCode() {
        int iHashCode = ((((this.f62214a.hashCode() * 31) + this.f62215b.hashCode()) * 31) + this.f62216c.hashCode()) * 31;
        JSONObject jSONObject = this.f62217d;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @oy.l
    public String toString() {
        return "InlineStoreRequest(url=" + this.f62214a + ", storePackage=" + this.f62215b + ", strategy=" + this.f62216c + ", extras=" + this.f62217d + gi.j.f86771d;
    }

    @oy.l
    public final C4365k9 a(@oy.l String url, @oy.l String storePackage, @oy.l EnumC4401m9 strategy, @oy.m JSONObject jSONObject) {
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(storePackage, "storePackage");
        kotlin.jvm.internal.m0.p(strategy, "strategy");
        return new C4365k9(url, storePackage, strategy, jSONObject);
    }

    public static /* synthetic */ C4365k9 a(C4365k9 c4365k9, String str, String str2, EnumC4401m9 enumC4401m9, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4365k9.f62214a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4365k9.f62215b;
        }
        if ((i10 & 4) != 0) {
            enumC4401m9 = c4365k9.f62216c;
        }
        if ((i10 & 8) != 0) {
            jSONObject = c4365k9.f62217d;
        }
        return c4365k9.a(str, str2, enumC4401m9, jSONObject);
    }

    public /* synthetic */ C4365k9(String str, String str2, EnumC4401m9 enumC4401m9, JSONObject jSONObject, int i10, kotlin.jvm.internal.x xVar) {
        this(str, str2, (i10 & 4) != 0 ? EnumC4401m9.APP_ACTIVITY : enumC4401m9, (i10 & 8) != 0 ? null : jSONObject);
    }
}
