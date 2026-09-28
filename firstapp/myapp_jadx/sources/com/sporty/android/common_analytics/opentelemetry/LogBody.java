package com.sporty.android.common_analytics.opentelemetry;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.twilio.voice.EventKeys;
import defpackage.gmf0;
import defpackage.ux5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0019\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jc\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0014\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u000201HÖ\u0081\u0004J\n\u00102\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR'\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR5\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(!¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R'\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b($¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#Ê\u0001\u0002\b4¨\u00063"}, d2 = {"Lcom/sporty/android/common_analytics/opentelemetry/LogBody;", "", "kind", "", EventKeys.TIMESTAMP, "appMeta", "Lcom/sporty/android/common_analytics/opentelemetry/AppMeta;", "deviceMeta", "Lcom/sporty/android/common_analytics/opentelemetry/DeviceMeta;", "userMeta", "Lcom/sporty/android/common_analytics/opentelemetry/UserMeta;", "properties", "", "pageMeta", "Lcom/sportybet/core/injection/opentelemetry/PageMeta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/common_analytics/opentelemetry/AppMeta;Lcom/sporty/android/common_analytics/opentelemetry/DeviceMeta;Lcom/sporty/android/common_analytics/opentelemetry/UserMeta;Ljava/util/Map;Lcom/sportybet/core/injection/opentelemetry/PageMeta;)V", "getKind", "()Ljava/lang/String;", "getTimestamp", "getAppMeta", "()Lcom/sporty/android/common_analytics/opentelemetry/AppMeta;", "Lcom/google/gson/annotations/SerializedName;", "value", "app", "getDeviceMeta", "()Lcom/sporty/android/common_analytics/opentelemetry/DeviceMeta;", LastLoginDeviceInfo.KEY_DEVICE, "getUserMeta", "()Lcom/sporty/android/common_analytics/opentelemetry/UserMeta;", "user", "getProperties", "()Ljava/util/Map;", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "getPageMeta", "()Lcom/sportybet/core/injection/opentelemetry/PageMeta;", AnalyticsParam.MINI_GAMES_PAGE, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "common-analytics", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LogBody {

    @SerializedName("app")
    private final AppMeta appMeta;

    @SerializedName(LastLoginDeviceInfo.KEY_DEVICE)
    private final DeviceMeta deviceMeta;
    private final String kind;

    @SerializedName(AnalyticsParam.MINI_GAMES_PAGE)
    private final PageMeta pageMeta;

    @SerializedName(AnalyticsEvent.BI_TRACKING_KIND_EVENT)
    private final Map<String, Object> properties;
    private final String timestamp;

    @SerializedName("user")
    private final UserMeta userMeta;

    public LogBody(String str, String str2, AppMeta appMeta, DeviceMeta deviceMeta, UserMeta userMeta, Map<String, ? extends Object> map, PageMeta pageMeta) {
        str.getClass();
        str2.getClass();
        appMeta.getClass();
        deviceMeta.getClass();
        this.kind = str;
        this.timestamp = str2;
        this.appMeta = appMeta;
        this.deviceMeta = deviceMeta;
        this.userMeta = userMeta;
        this.properties = map;
        this.pageMeta = pageMeta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogBody copy$default(LogBody logBody, String str, String str2, AppMeta appMeta, DeviceMeta deviceMeta, UserMeta userMeta, Map map, PageMeta pageMeta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logBody.kind;
        }
        if ((i & 2) != 0) {
            str2 = logBody.timestamp;
        }
        if ((i & 4) != 0) {
            appMeta = logBody.appMeta;
        }
        if ((i & 8) != 0) {
            deviceMeta = logBody.deviceMeta;
        }
        if ((i & 16) != 0) {
            userMeta = logBody.userMeta;
        }
        if ((i & 32) != 0) {
            map = logBody.properties;
        }
        if ((i & 64) != 0) {
            pageMeta = logBody.pageMeta;
        }
        Map map2 = map;
        PageMeta pageMeta2 = pageMeta;
        UserMeta userMeta2 = userMeta;
        AppMeta appMeta2 = appMeta;
        return logBody.copy(str, str2, appMeta2, deviceMeta, userMeta2, map2, pageMeta2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AppMeta getAppMeta() {
        return this.appMeta;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DeviceMeta getDeviceMeta() {
        return this.deviceMeta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UserMeta getUserMeta() {
        return this.userMeta;
    }

    public final Map<String, Object> component6() {
        return this.properties;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PageMeta getPageMeta() {
        return this.pageMeta;
    }

    public final LogBody copy(String kind, String timestamp, AppMeta appMeta, DeviceMeta deviceMeta, UserMeta userMeta, Map<String, ? extends Object> properties, PageMeta pageMeta) {
        kind.getClass();
        timestamp.getClass();
        appMeta.getClass();
        deviceMeta.getClass();
        return new LogBody(kind, timestamp, appMeta, deviceMeta, userMeta, properties, pageMeta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogBody)) {
            return false;
        }
        LogBody logBody = (LogBody) other;
        return Intrinsics.g(this.kind, logBody.kind) && Intrinsics.g(this.timestamp, logBody.timestamp) && Intrinsics.g(this.appMeta, logBody.appMeta) && Intrinsics.g(this.deviceMeta, logBody.deviceMeta) && Intrinsics.g(this.userMeta, logBody.userMeta) && Intrinsics.g(this.properties, logBody.properties) && Intrinsics.g(this.pageMeta, logBody.pageMeta);
    }

    public final AppMeta getAppMeta() {
        return this.appMeta;
    }

    public final DeviceMeta getDeviceMeta() {
        return this.deviceMeta;
    }

    public final String getKind() {
        return this.kind;
    }

    public final PageMeta getPageMeta() {
        return this.pageMeta;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final UserMeta getUserMeta() {
        return this.userMeta;
    }

    public int hashCode() {
        int iHashCode = (this.deviceMeta.hashCode() + ((this.appMeta.hashCode() + gmf0.a(this.kind.hashCode() * 31, 31, this.timestamp)) * 31)) * 31;
        UserMeta userMeta = this.userMeta;
        int iHashCode2 = (iHashCode + (userMeta == null ? 0 : userMeta.hashCode())) * 31;
        Map<String, Object> map = this.properties;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        PageMeta pageMeta = this.pageMeta;
        return iHashCode3 + (pageMeta != null ? pageMeta.hashCode() : 0);
    }

    public String toString() {
        String str = this.kind;
        String str2 = this.timestamp;
        AppMeta appMeta = this.appMeta;
        DeviceMeta deviceMeta = this.deviceMeta;
        UserMeta userMeta = this.userMeta;
        Map<String, Object> map = this.properties;
        PageMeta pageMeta = this.pageMeta;
        StringBuilder sbA = ux5.a("LogBody(kind=", str, ", timestamp=", str2, ", appMeta=");
        sbA.append(appMeta);
        sbA.append(", deviceMeta=");
        sbA.append(deviceMeta);
        sbA.append(", userMeta=");
        sbA.append(userMeta);
        sbA.append(", properties=");
        sbA.append(map);
        sbA.append(", pageMeta=");
        sbA.append(pageMeta);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ LogBody(String str, String str2, AppMeta appMeta, DeviceMeta deviceMeta, UserMeta userMeta, Map map, PageMeta pageMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, appMeta, deviceMeta, (i & 16) != 0 ? null : userMeta, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : pageMeta);
    }
}
