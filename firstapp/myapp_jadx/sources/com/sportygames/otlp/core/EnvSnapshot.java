package com.sportygames.otlp.core;

import defpackage.gmf0;
import defpackage.j26;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/sportygames/otlp/core/EnvSnapshot;", "", "userId", "", "deviceId", "countryCode", "appVersion", "environment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getDeviceId", "getCountryCode", "getAppVersion", "getEnvironment", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "logger-otlp_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EnvSnapshot {
    private final String appVersion;
    private final String countryCode;
    private final String deviceId;
    private final String environment;
    private final String userId;

    public EnvSnapshot(String str, String str2, String str3, String str4, String str5) {
        wd7.a(str2, str3, str4, str5);
        this.userId = str;
        this.deviceId = str2;
        this.countryCode = str3;
        this.appVersion = str4;
        this.environment = str5;
    }

    public static /* synthetic */ EnvSnapshot copy$default(EnvSnapshot envSnapshot, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = envSnapshot.userId;
        }
        if ((i & 2) != 0) {
            str2 = envSnapshot.deviceId;
        }
        if ((i & 4) != 0) {
            str3 = envSnapshot.countryCode;
        }
        if ((i & 8) != 0) {
            str4 = envSnapshot.appVersion;
        }
        if ((i & 16) != 0) {
            str5 = envSnapshot.environment;
        }
        String str6 = str5;
        String str7 = str3;
        return envSnapshot.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    public final EnvSnapshot copy(String userId, String deviceId, String countryCode, String appVersion, String environment) {
        deviceId.getClass();
        countryCode.getClass();
        appVersion.getClass();
        environment.getClass();
        return new EnvSnapshot(userId, deviceId, countryCode, appVersion, environment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnvSnapshot)) {
            return false;
        }
        EnvSnapshot envSnapshot = (EnvSnapshot) other;
        return Intrinsics.g(this.userId, envSnapshot.userId) && Intrinsics.g(this.deviceId, envSnapshot.deviceId) && Intrinsics.g(this.countryCode, envSnapshot.countryCode) && Intrinsics.g(this.appVersion, envSnapshot.appVersion) && Intrinsics.g(this.environment, envSnapshot.environment);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        return this.environment.hashCode() + gmf0.a(gmf0.a(gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.deviceId), 31, this.countryCode), 31, this.appVersion);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EnvSnapshot(userId=");
        sb.append(this.userId);
        sb.append(", deviceId=");
        sb.append(this.deviceId);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", appVersion=");
        sb.append(this.appVersion);
        sb.append(", environment=");
        return j26.a(sb, this.environment, ')');
    }
}
