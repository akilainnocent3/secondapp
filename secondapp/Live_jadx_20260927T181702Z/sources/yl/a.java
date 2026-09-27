package yl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f159538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f159539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final String f159540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final String f159541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final e0 f159542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final List<e0> f159543f;

    public a(@oy.l String packageName, @oy.l String versionName, @oy.l String appBuildVersion, @oy.l String deviceManufacturer, @oy.l e0 currentProcessDetails, @oy.l List<e0> appProcessDetails) {
        kotlin.jvm.internal.m0.p(packageName, "packageName");
        kotlin.jvm.internal.m0.p(versionName, "versionName");
        kotlin.jvm.internal.m0.p(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.m0.p(deviceManufacturer, "deviceManufacturer");
        kotlin.jvm.internal.m0.p(currentProcessDetails, "currentProcessDetails");
        kotlin.jvm.internal.m0.p(appProcessDetails, "appProcessDetails");
        this.f159538a = packageName;
        this.f159539b = versionName;
        this.f159540c = appBuildVersion;
        this.f159541d = deviceManufacturer;
        this.f159542e = currentProcessDetails;
        this.f159543f = appProcessDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a h(a aVar, String str, String str2, String str3, String str4, e0 e0Var, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f159538a;
        }
        if ((i10 & 2) != 0) {
            str2 = aVar.f159539b;
        }
        if ((i10 & 4) != 0) {
            str3 = aVar.f159540c;
        }
        if ((i10 & 8) != 0) {
            str4 = aVar.f159541d;
        }
        if ((i10 & 16) != 0) {
            e0Var = aVar.f159542e;
        }
        if ((i10 & 32) != 0) {
            list = aVar.f159543f;
        }
        e0 e0Var2 = e0Var;
        List list2 = list;
        return aVar.g(str, str2, str3, str4, e0Var2, list2);
    }

    @oy.l
    public final String a() {
        return this.f159538a;
    }

    @oy.l
    public final String b() {
        return this.f159539b;
    }

    @oy.l
    public final String c() {
        return this.f159540c;
    }

    @oy.l
    public final String d() {
        return this.f159541d;
    }

    @oy.l
    public final e0 e() {
        return this.f159542e;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m0.g(this.f159538a, aVar.f159538a) && kotlin.jvm.internal.m0.g(this.f159539b, aVar.f159539b) && kotlin.jvm.internal.m0.g(this.f159540c, aVar.f159540c) && kotlin.jvm.internal.m0.g(this.f159541d, aVar.f159541d) && kotlin.jvm.internal.m0.g(this.f159542e, aVar.f159542e) && kotlin.jvm.internal.m0.g(this.f159543f, aVar.f159543f);
    }

    @oy.l
    public final List<e0> f() {
        return this.f159543f;
    }

    @oy.l
    public final a g(@oy.l String packageName, @oy.l String versionName, @oy.l String appBuildVersion, @oy.l String deviceManufacturer, @oy.l e0 currentProcessDetails, @oy.l List<e0> appProcessDetails) {
        kotlin.jvm.internal.m0.p(packageName, "packageName");
        kotlin.jvm.internal.m0.p(versionName, "versionName");
        kotlin.jvm.internal.m0.p(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.m0.p(deviceManufacturer, "deviceManufacturer");
        kotlin.jvm.internal.m0.p(currentProcessDetails, "currentProcessDetails");
        kotlin.jvm.internal.m0.p(appProcessDetails, "appProcessDetails");
        return new a(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public int hashCode() {
        return (((((((((this.f159538a.hashCode() * 31) + this.f159539b.hashCode()) * 31) + this.f159540c.hashCode()) * 31) + this.f159541d.hashCode()) * 31) + this.f159542e.hashCode()) * 31) + this.f159543f.hashCode();
    }

    @oy.l
    public final String i() {
        return this.f159540c;
    }

    @oy.l
    public final List<e0> j() {
        return this.f159543f;
    }

    @oy.l
    public final e0 k() {
        return this.f159542e;
    }

    @oy.l
    public final String l() {
        return this.f159541d;
    }

    @oy.l
    public final String m() {
        return this.f159538a;
    }

    @oy.l
    public final String n() {
        return this.f159539b;
    }

    @oy.l
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f159538a + ", versionName=" + this.f159539b + ", appBuildVersion=" + this.f159540c + ", deviceManufacturer=" + this.f159541d + ", currentProcessDetails=" + this.f159542e + ", appProcessDetails=" + this.f159543f + ')';
    }
}
