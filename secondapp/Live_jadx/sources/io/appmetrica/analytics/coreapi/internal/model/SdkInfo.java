package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class SdkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f95259c;

    public SdkInfo(@l String str, @l String str2, @l String str3) {
        this.f95257a = str;
        this.f95258b = str2;
        this.f95259c = str3;
    }

    public static /* synthetic */ SdkInfo copy$default(SdkInfo sdkInfo, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sdkInfo.f95257a;
        }
        if ((i10 & 2) != 0) {
            str2 = sdkInfo.f95258b;
        }
        if ((i10 & 4) != 0) {
            str3 = sdkInfo.f95259c;
        }
        return sdkInfo.copy(str, str2, str3);
    }

    @l
    public final String component1() {
        return this.f95257a;
    }

    @l
    public final String component2() {
        return this.f95258b;
    }

    @l
    public final String component3() {
        return this.f95259c;
    }

    @l
    public final SdkInfo copy(@l String str, @l String str2, @l String str3) {
        return new SdkInfo(str, str2, str3);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkInfo)) {
            return false;
        }
        SdkInfo sdkInfo = (SdkInfo) obj;
        return m0.g(this.f95257a, sdkInfo.f95257a) && m0.g(this.f95258b, sdkInfo.f95258b) && m0.g(this.f95259c, sdkInfo.f95259c);
    }

    @l
    public final String getSdkBuildNumber() {
        return this.f95258b;
    }

    @l
    public final String getSdkBuildType() {
        return this.f95259c;
    }

    @l
    public final String getSdkVersionName() {
        return this.f95257a;
    }

    public int hashCode() {
        return this.f95259c.hashCode() + ((this.f95258b.hashCode() + (this.f95257a.hashCode() * 31)) * 31);
    }

    @l
    public String toString() {
        return "SdkInfo(sdkVersionName=" + this.f95257a + ", sdkBuildNumber=" + this.f95258b + ", sdkBuildType=" + this.f95259c + ')';
    }
}
