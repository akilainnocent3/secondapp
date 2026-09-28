package com.sporty.android.common_analytics.opentelemetry;

import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bÊ\u0001\u0002\b ¨\u0006\u001f"}, d2 = {"Lcom/sporty/android/common_analytics/opentelemetry/AppMeta;", "", "name", "", "version", "countryCode", "platform", "environment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVersion", "getCountryCode", "Lcom/google/gson/annotations/SerializedName;", "value", "country", "getPlatform", "getEnvironment", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common-analytics", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AppMeta {

    @SerializedName("country")
    private final String countryCode;
    private final String environment;
    private final String name;
    private final String platform;
    private final String version;

    public AppMeta(String str, String str2, String str3, String str4, String str5) {
        qn4.b(str, str2, str3, str4, str5);
        this.name = str;
        this.version = str2;
        this.countryCode = str3;
        this.platform = str4;
        this.environment = str5;
    }

    public static /* synthetic */ AppMeta copy$default(AppMeta appMeta, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appMeta.name;
        }
        if ((i & 2) != 0) {
            str2 = appMeta.version;
        }
        if ((i & 4) != 0) {
            str3 = appMeta.countryCode;
        }
        if ((i & 8) != 0) {
            str4 = appMeta.platform;
        }
        if ((i & 16) != 0) {
            str5 = appMeta.environment;
        }
        String str6 = str5;
        String str7 = str3;
        return appMeta.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    public final AppMeta copy(String name, String version, String countryCode, String platform, String environment) {
        name.getClass();
        version.getClass();
        countryCode.getClass();
        platform.getClass();
        environment.getClass();
        return new AppMeta(name, version, countryCode, platform, environment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppMeta)) {
            return false;
        }
        AppMeta appMeta = (AppMeta) other;
        return Intrinsics.g(this.name, appMeta.name) && Intrinsics.g(this.version, appMeta.version) && Intrinsics.g(this.countryCode, appMeta.countryCode) && Intrinsics.g(this.platform, appMeta.platform) && Intrinsics.g(this.environment, appMeta.environment);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.environment.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.name.hashCode() * 31, 31, this.version), 31, this.countryCode), 31, this.platform);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.version;
        String str3 = this.countryCode;
        String str4 = this.platform;
        String str5 = this.environment;
        StringBuilder sbA = ux5.a("AppMeta(name=", str, ", version=", str2, ", countryCode=");
        hxa.c(sbA, str3, ", platform=", str4, ", environment=");
        return uf80.a(sbA, str5, ")");
    }
}
