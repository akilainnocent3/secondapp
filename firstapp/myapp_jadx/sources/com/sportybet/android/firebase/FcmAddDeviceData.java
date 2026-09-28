package com.sportybet.android.firebase;

import defpackage.gmf0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.qn4;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fÊ\u0001\u0002\b Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/firebase/FcmAddDeviceData;", "", "userId", "", "newToken", "oldToken", "deviceId", "countryCode", "platform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getNewToken", "getOldToken", "getDeviceId", "getCountryCode", "getPlatform", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FcmAddDeviceData {
    public static final int $stable = 0;
    private final String countryCode;
    private final String deviceId;
    private final String newToken;
    private final String oldToken;
    private final String platform;
    private final String userId;

    public FcmAddDeviceData(String str, String str2, String str3, String str4, String str5, String str6) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        this.userId = str;
        this.newToken = str2;
        this.oldToken = str3;
        this.deviceId = str4;
        this.countryCode = str5;
        this.platform = str6;
    }

    public static /* synthetic */ FcmAddDeviceData copy$default(FcmAddDeviceData fcmAddDeviceData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fcmAddDeviceData.userId;
        }
        if ((i & 2) != 0) {
            str2 = fcmAddDeviceData.newToken;
        }
        if ((i & 4) != 0) {
            str3 = fcmAddDeviceData.oldToken;
        }
        if ((i & 8) != 0) {
            str4 = fcmAddDeviceData.deviceId;
        }
        if ((i & 16) != 0) {
            str5 = fcmAddDeviceData.countryCode;
        }
        if ((i & 32) != 0) {
            str6 = fcmAddDeviceData.platform;
        }
        String str7 = str5;
        String str8 = str6;
        return fcmAddDeviceData.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNewToken() {
        return this.newToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOldToken() {
        return this.oldToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public final FcmAddDeviceData copy(String userId, String newToken, String oldToken, String deviceId, String countryCode, String platform) {
        qn4.b(userId, newToken, oldToken, deviceId, countryCode);
        platform.getClass();
        return new FcmAddDeviceData(userId, newToken, oldToken, deviceId, countryCode, platform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FcmAddDeviceData)) {
            return false;
        }
        FcmAddDeviceData fcmAddDeviceData = (FcmAddDeviceData) other;
        return Intrinsics.g(this.userId, fcmAddDeviceData.userId) && Intrinsics.g(this.newToken, fcmAddDeviceData.newToken) && Intrinsics.g(this.oldToken, fcmAddDeviceData.oldToken) && Intrinsics.g(this.deviceId, fcmAddDeviceData.deviceId) && Intrinsics.g(this.countryCode, fcmAddDeviceData.countryCode) && Intrinsics.g(this.platform, fcmAddDeviceData.platform);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getNewToken() {
        return this.newToken;
    }

    public final String getOldToken() {
        return this.oldToken;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.platform.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.userId.hashCode() * 31, 31, this.newToken), 31, this.oldToken), 31, this.deviceId), 31, this.countryCode);
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.newToken;
        String str3 = this.oldToken;
        String str4 = this.deviceId;
        String str5 = this.countryCode;
        String str6 = this.platform;
        StringBuilder sbA = ux5.a("FcmAddDeviceData(userId=", str, ", newToken=", str2, ", oldToken=");
        hxa.c(sbA, str3, ", deviceId=", str4, ", countryCode=");
        return kwi.a(sbA, str5, ", platform=", str6, ")");
    }
}
