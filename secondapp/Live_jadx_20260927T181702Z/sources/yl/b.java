package yl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f159545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f159546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final String f159547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final String f159548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final w f159549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final a f159550f;

    public b(@oy.l String appId, @oy.l String deviceModel, @oy.l String sessionSdkVersion, @oy.l String osVersion, @oy.l w logEnvironment, @oy.l a androidAppInfo) {
        kotlin.jvm.internal.m0.p(appId, "appId");
        kotlin.jvm.internal.m0.p(deviceModel, "deviceModel");
        kotlin.jvm.internal.m0.p(sessionSdkVersion, "sessionSdkVersion");
        kotlin.jvm.internal.m0.p(osVersion, "osVersion");
        kotlin.jvm.internal.m0.p(logEnvironment, "logEnvironment");
        kotlin.jvm.internal.m0.p(androidAppInfo, "androidAppInfo");
        this.f159545a = appId;
        this.f159546b = deviceModel;
        this.f159547c = sessionSdkVersion;
        this.f159548d = osVersion;
        this.f159549e = logEnvironment;
        this.f159550f = androidAppInfo;
    }

    public static /* synthetic */ b h(b bVar, String str, String str2, String str3, String str4, w wVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f159545a;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.f159546b;
        }
        if ((i10 & 4) != 0) {
            str3 = bVar.f159547c;
        }
        if ((i10 & 8) != 0) {
            str4 = bVar.f159548d;
        }
        if ((i10 & 16) != 0) {
            wVar = bVar.f159549e;
        }
        if ((i10 & 32) != 0) {
            aVar = bVar.f159550f;
        }
        w wVar2 = wVar;
        a aVar2 = aVar;
        return bVar.g(str, str2, str3, str4, wVar2, aVar2);
    }

    @oy.l
    public final String a() {
        return this.f159545a;
    }

    @oy.l
    public final String b() {
        return this.f159546b;
    }

    @oy.l
    public final String c() {
        return this.f159547c;
    }

    @oy.l
    public final String d() {
        return this.f159548d;
    }

    @oy.l
    public final w e() {
        return this.f159549e;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m0.g(this.f159545a, bVar.f159545a) && kotlin.jvm.internal.m0.g(this.f159546b, bVar.f159546b) && kotlin.jvm.internal.m0.g(this.f159547c, bVar.f159547c) && kotlin.jvm.internal.m0.g(this.f159548d, bVar.f159548d) && this.f159549e == bVar.f159549e && kotlin.jvm.internal.m0.g(this.f159550f, bVar.f159550f);
    }

    @oy.l
    public final a f() {
        return this.f159550f;
    }

    @oy.l
    public final b g(@oy.l String appId, @oy.l String deviceModel, @oy.l String sessionSdkVersion, @oy.l String osVersion, @oy.l w logEnvironment, @oy.l a androidAppInfo) {
        kotlin.jvm.internal.m0.p(appId, "appId");
        kotlin.jvm.internal.m0.p(deviceModel, "deviceModel");
        kotlin.jvm.internal.m0.p(sessionSdkVersion, "sessionSdkVersion");
        kotlin.jvm.internal.m0.p(osVersion, "osVersion");
        kotlin.jvm.internal.m0.p(logEnvironment, "logEnvironment");
        kotlin.jvm.internal.m0.p(androidAppInfo, "androidAppInfo");
        return new b(appId, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }

    public int hashCode() {
        return (((((((((this.f159545a.hashCode() * 31) + this.f159546b.hashCode()) * 31) + this.f159547c.hashCode()) * 31) + this.f159548d.hashCode()) * 31) + this.f159549e.hashCode()) * 31) + this.f159550f.hashCode();
    }

    @oy.l
    public final a i() {
        return this.f159550f;
    }

    @oy.l
    public final String j() {
        return this.f159545a;
    }

    @oy.l
    public final String k() {
        return this.f159546b;
    }

    @oy.l
    public final w l() {
        return this.f159549e;
    }

    @oy.l
    public final String m() {
        return this.f159548d;
    }

    @oy.l
    public final String n() {
        return this.f159547c;
    }

    @oy.l
    public String toString() {
        return "ApplicationInfo(appId=" + this.f159545a + ", deviceModel=" + this.f159546b + ", sessionSdkVersion=" + this.f159547c + ", osVersion=" + this.f159548d + ", logEnvironment=" + this.f159549e + ", androidAppInfo=" + this.f159550f + ')';
    }
}
