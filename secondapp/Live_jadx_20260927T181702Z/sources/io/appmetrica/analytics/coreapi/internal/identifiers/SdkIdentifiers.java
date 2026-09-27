package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class SdkIdentifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f95243c;

    public SdkIdentifiers(@m String str, @m String str2, @m String str3) {
        this.f95241a = str;
        this.f95242b = str2;
        this.f95243c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sdkIdentifiers.f95241a;
        }
        if ((i10 & 2) != 0) {
            str2 = sdkIdentifiers.f95242b;
        }
        if ((i10 & 4) != 0) {
            str3 = sdkIdentifiers.f95243c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    @m
    public final String component1() {
        return this.f95241a;
    }

    @m
    public final String component2() {
        return this.f95242b;
    }

    @m
    public final String component3() {
        return this.f95243c;
    }

    @l
    public final SdkIdentifiers copy(@m String str, @m String str2, @m String str3) {
        return new SdkIdentifiers(str, str2, str3);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkIdentifiers)) {
            return false;
        }
        SdkIdentifiers sdkIdentifiers = (SdkIdentifiers) obj;
        return m0.g(this.f95241a, sdkIdentifiers.f95241a) && m0.g(this.f95242b, sdkIdentifiers.f95242b) && m0.g(this.f95243c, sdkIdentifiers.f95243c);
    }

    @m
    public final String getDeviceId() {
        return this.f95242b;
    }

    @m
    public final String getDeviceIdHash() {
        return this.f95243c;
    }

    @m
    public final String getUuid() {
        return this.f95241a;
    }

    public int hashCode() {
        String str = this.f95241a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95242b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95243c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @l
    public String toString() {
        return "SdkIdentifiers(uuid=" + this.f95241a + ", deviceId=" + this.f95242b + ", deviceIdHash=" + this.f95243c + ')';
    }
}
