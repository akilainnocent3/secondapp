package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AppVersionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95246b;

    public AppVersionInfo(@l String str, @l String str2) {
        this.f95245a = str;
        this.f95246b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appVersionInfo.f95245a;
        }
        if ((i10 & 2) != 0) {
            str2 = appVersionInfo.f95246b;
        }
        return appVersionInfo.copy(str, str2);
    }

    @l
    public final String component1() {
        return this.f95245a;
    }

    @l
    public final String component2() {
        return this.f95246b;
    }

    @l
    public final AppVersionInfo copy(@l String str, @l String str2) {
        return new AppVersionInfo(str, str2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersionInfo)) {
            return false;
        }
        AppVersionInfo appVersionInfo = (AppVersionInfo) obj;
        return m0.g(this.f95245a, appVersionInfo.f95245a) && m0.g(this.f95246b, appVersionInfo.f95246b);
    }

    @l
    public final String getAppBuildNumber() {
        return this.f95246b;
    }

    @l
    public final String getAppVersionName() {
        return this.f95245a;
    }

    public int hashCode() {
        return this.f95246b.hashCode() + (this.f95245a.hashCode() * 31);
    }

    @l
    public String toString() {
        return "AppVersionInfo(appVersionName=" + this.f95245a + ", appBuildNumber=" + this.f95246b + ')';
    }
}
