package io.appmetrica.analytics.coreapi.internal.model;

import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class SdkEnvironment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppVersionInfo f95251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScreenInfo f95253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SdkInfo f95254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f95255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f95256f;

    public SdkEnvironment(@l AppVersionInfo appVersionInfo, @l String str, @l ScreenInfo screenInfo, @l SdkInfo sdkInfo, @l String str2, @l List<String> list) {
        this.f95251a = appVersionInfo;
        this.f95252b = str;
        this.f95253c = screenInfo;
        this.f95254d = sdkInfo;
        this.f95255e = str2;
        this.f95256f = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            appVersionInfo = sdkEnvironment.f95251a;
        }
        if ((i10 & 2) != 0) {
            str = sdkEnvironment.f95252b;
        }
        if ((i10 & 4) != 0) {
            screenInfo = sdkEnvironment.f95253c;
        }
        if ((i10 & 8) != 0) {
            sdkInfo = sdkEnvironment.f95254d;
        }
        if ((i10 & 16) != 0) {
            str2 = sdkEnvironment.f95255e;
        }
        if ((i10 & 32) != 0) {
            list = sdkEnvironment.f95256f;
        }
        String str3 = str2;
        List list2 = list;
        return sdkEnvironment.copy(appVersionInfo, str, screenInfo, sdkInfo, str3, list2);
    }

    @l
    public final AppVersionInfo component1() {
        return this.f95251a;
    }

    @l
    public final String component2() {
        return this.f95252b;
    }

    @l
    public final ScreenInfo component3() {
        return this.f95253c;
    }

    @l
    public final SdkInfo component4() {
        return this.f95254d;
    }

    @l
    public final String component5() {
        return this.f95255e;
    }

    @l
    public final List<String> component6() {
        return this.f95256f;
    }

    @l
    public final SdkEnvironment copy(@l AppVersionInfo appVersionInfo, @l String str, @l ScreenInfo screenInfo, @l SdkInfo sdkInfo, @l String str2, @l List<String> list) {
        return new SdkEnvironment(appVersionInfo, str, screenInfo, sdkInfo, str2, list);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEnvironment)) {
            return false;
        }
        SdkEnvironment sdkEnvironment = (SdkEnvironment) obj;
        return m0.g(this.f95251a, sdkEnvironment.f95251a) && m0.g(this.f95252b, sdkEnvironment.f95252b) && m0.g(this.f95253c, sdkEnvironment.f95253c) && m0.g(this.f95254d, sdkEnvironment.f95254d) && m0.g(this.f95255e, sdkEnvironment.f95255e) && m0.g(this.f95256f, sdkEnvironment.f95256f);
    }

    @l
    public final String getAppFramework() {
        return this.f95252b;
    }

    @l
    public final AppVersionInfo getAppVersionInfo() {
        return this.f95251a;
    }

    @l
    public final String getDeviceType() {
        return this.f95255e;
    }

    @l
    public final List<String> getLocales() {
        return this.f95256f;
    }

    @l
    public final ScreenInfo getScreenInfo() {
        return this.f95253c;
    }

    @l
    public final SdkInfo getSdkInfo() {
        return this.f95254d;
    }

    public int hashCode() {
        return this.f95256f.hashCode() + ((this.f95255e.hashCode() + ((this.f95254d.hashCode() + ((this.f95253c.hashCode() + ((this.f95252b.hashCode() + (this.f95251a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @l
    public String toString() {
        return "SdkEnvironment(appVersionInfo=" + this.f95251a + ", appFramework=" + this.f95252b + ", screenInfo=" + this.f95253c + ", sdkInfo=" + this.f95254d + ", deviceType=" + this.f95255e + ", locales=" + this.f95256f + ')';
    }
}
