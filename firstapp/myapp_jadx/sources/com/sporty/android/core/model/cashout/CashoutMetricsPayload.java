package com.sporty.android.core.model.cashout;

import com.appsflyer.internal.p;
import com.sporty.android.core.model.service.CountryCodeName;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\u0002\b\u0014¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload;", "", "metrics", "", "Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload$Metric;", "<init>", "(Ljava/util/List;)V", "getMetrics", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Metric", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashoutMetricsPayload {
    private final List<Metric> metrics;

    public CashoutMetricsPayload(List<Metric> list) {
        list.getClass();
        this.metrics = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashoutMetricsPayload copy$default(CashoutMetricsPayload cashoutMetricsPayload, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cashoutMetricsPayload.metrics;
        }
        return cashoutMetricsPayload.copy(list);
    }

    public final List<Metric> component1() {
        return this.metrics;
    }

    public final CashoutMetricsPayload copy(List<Metric> metrics) {
        metrics.getClass();
        return new CashoutMetricsPayload(metrics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CashoutMetricsPayload) && Intrinsics.g(this.metrics, ((CashoutMetricsPayload) other).metrics);
    }

    public final List<Metric> getMetrics() {
        return this.metrics;
    }

    public int hashCode() {
        return this.metrics.hashCode();
    }

    public String toString() {
        return p.a("CashoutMetricsPayload(metrics=", ")", this.metrics);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload$Metric;", "", "metricsCode", "", "serviceName", "keyValueMap", "Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload$Metric$KeyValueMap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload$Metric$KeyValueMap;)V", "getMetricsCode", "()Ljava/lang/String;", "getServiceName", "getKeyValueMap", "()Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload$Metric$KeyValueMap;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "KeyValueMap", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Metric {
        public static final String ANDROID = "android";

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String METRICS2005 = "METRICS2005";
        public static final String REAL_SPORTS_GAME = "REAL_SPORTS_GAME";
        private final KeyValueMap keyValueMap;
        private final String metricsCode;
        private final String serviceName;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload$Metric$Companion;", "", "<init>", "()V", Metric.METRICS2005, "", Metric.REAL_SPORTS_GAME, "ANDROID", "newMetric", "Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload$Metric;", "betId", "metricsType", "metricsInfo", "countryCodeName", "Lcom/sporty/android/core/model/service/CountryCodeName;", "appVersion", "currentTimeMillis", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Metric newMetric(String betId, String metricsType, String metricsInfo, CountryCodeName countryCodeName, String appVersion, long currentTimeMillis) {
                betId.getClass();
                metricsType.getClass();
                metricsInfo.getClass();
                countryCodeName.getClass();
                appVersion.getClass();
                return new Metric(null, null, new KeyValueMap(betId, metricsType, currentTimeMillis, null, countryCodeName, null, appVersion, metricsInfo, 40, null), 3, null);
            }

            private Companion() {
            }
        }

        public Metric(String str, String str2, KeyValueMap keyValueMap) {
            str.getClass();
            str2.getClass();
            keyValueMap.getClass();
            this.metricsCode = str;
            this.serviceName = str2;
            this.keyValueMap = keyValueMap;
        }

        public static /* synthetic */ Metric copy$default(Metric metric, String str, String str2, KeyValueMap keyValueMap, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metric.metricsCode;
            }
            if ((i & 2) != 0) {
                str2 = metric.serviceName;
            }
            if ((i & 4) != 0) {
                keyValueMap = metric.keyValueMap;
            }
            return metric.copy(str, str2, keyValueMap);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMetricsCode() {
            return this.metricsCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getServiceName() {
            return this.serviceName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final KeyValueMap getKeyValueMap() {
            return this.keyValueMap;
        }

        public final Metric copy(String metricsCode, String serviceName, KeyValueMap keyValueMap) {
            metricsCode.getClass();
            serviceName.getClass();
            keyValueMap.getClass();
            return new Metric(metricsCode, serviceName, keyValueMap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metric)) {
                return false;
            }
            Metric metric = (Metric) other;
            return Intrinsics.g(this.metricsCode, metric.metricsCode) && Intrinsics.g(this.serviceName, metric.serviceName) && Intrinsics.g(this.keyValueMap, metric.keyValueMap);
        }

        public final KeyValueMap getKeyValueMap() {
            return this.keyValueMap;
        }

        public final String getMetricsCode() {
            return this.metricsCode;
        }

        public final String getServiceName() {
            return this.serviceName;
        }

        public int hashCode() {
            return this.keyValueMap.hashCode() + gmf0.a(this.metricsCode.hashCode() * 31, 31, this.serviceName);
        }

        public String toString() {
            String str = this.metricsCode;
            String str2 = this.serviceName;
            KeyValueMap keyValueMap = this.keyValueMap;
            StringBuilder sbA = ux5.a("Metric(metricsCode=", str, ", serviceName=", str2, ", keyValueMap=");
            sbA.append(keyValueMap);
            sbA.append(")");
            return sbA.toString();
        }

        public /* synthetic */ Metric(String str, String str2, KeyValueMap keyValueMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? METRICS2005 : str, (i & 2) != 0 ? REAL_SPORTS_GAME : str2, keyValueMap);
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010Ê\u0001\u0002\b.¨\u0006-"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload$Metric$KeyValueMap;", "", "betId", "", "type", "startTime", "", "endTime", "country", "Lcom/sporty/android/core/model/service/CountryCodeName;", "platform", "app_version", "metricsInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Lcom/sporty/android/core/model/service/CountryCodeName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBetId", "()Ljava/lang/String;", "getType", "getStartTime", "()J", "getEndTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCountry", "()Lcom/sporty/android/core/model/service/CountryCodeName;", "getPlatform", "getApp_version", "getMetricsInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Lcom/sporty/android/core/model/service/CountryCodeName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/cashout/CashoutMetricsPayload$Metric$KeyValueMap;", "equals", "", "other", "hashCode", "", "toString", "Type", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class KeyValueMap {
            public static final String FE_FORMULA_UNKNOWN = "98";
            public static final String INACTIVE_OUTCOME = "15";
            public static final String ONE_BET_CUT = "08";
            public static final String PLATFORM_UNKNOWN = "97";
            public static final String SUCCESS = "00";
            public static final String UNKNOWN = "99";
            public static final String UNRECOGNIZABLE_RESPONSE = "97b";
            public static final String WEBVIEW_UNFUNCTIONAL = "97a";
            private final String app_version;
            private final String betId;
            private final CountryCodeName country;
            private final Long endTime;
            private final String metricsInfo;
            private final String platform;
            private final long startTime;
            private final String type;

            public KeyValueMap(String str, String str2, long j, Long l, CountryCodeName countryCodeName, String str3, String str4, String str5) {
                str.getClass();
                str2.getClass();
                countryCodeName.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                this.betId = str;
                this.type = str2;
                this.startTime = j;
                this.endTime = l;
                this.country = countryCodeName;
                this.platform = str3;
                this.app_version = str4;
                this.metricsInfo = str5;
            }

            public static /* synthetic */ KeyValueMap copy$default(KeyValueMap keyValueMap, String str, String str2, long j, Long l, CountryCodeName countryCodeName, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = keyValueMap.betId;
                }
                if ((i & 2) != 0) {
                    str2 = keyValueMap.type;
                }
                if ((i & 4) != 0) {
                    j = keyValueMap.startTime;
                }
                if ((i & 8) != 0) {
                    l = keyValueMap.endTime;
                }
                if ((i & 16) != 0) {
                    countryCodeName = keyValueMap.country;
                }
                if ((i & 32) != 0) {
                    str3 = keyValueMap.platform;
                }
                if ((i & 64) != 0) {
                    str4 = keyValueMap.app_version;
                }
                if ((i & 128) != 0) {
                    str5 = keyValueMap.metricsInfo;
                }
                String str6 = str5;
                String str7 = str3;
                Long l2 = l;
                long j2 = j;
                return keyValueMap.copy(str, str2, j2, l2, countryCodeName, str7, str4, str6);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getBetId() {
                return this.betId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final long getStartTime() {
                return this.startTime;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Long getEndTime() {
                return this.endTime;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final CountryCodeName getCountry() {
                return this.country;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getPlatform() {
                return this.platform;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final String getApp_version() {
                return this.app_version;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getMetricsInfo() {
                return this.metricsInfo;
            }

            public final KeyValueMap copy(String betId, String type, long startTime, Long endTime, CountryCodeName country, String platform, String app_version, String metricsInfo) {
                betId.getClass();
                type.getClass();
                country.getClass();
                platform.getClass();
                app_version.getClass();
                metricsInfo.getClass();
                return new KeyValueMap(betId, type, startTime, endTime, country, platform, app_version, metricsInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof KeyValueMap)) {
                    return false;
                }
                KeyValueMap keyValueMap = (KeyValueMap) other;
                return Intrinsics.g(this.betId, keyValueMap.betId) && Intrinsics.g(this.type, keyValueMap.type) && this.startTime == keyValueMap.startTime && Intrinsics.g(this.endTime, keyValueMap.endTime) && this.country == keyValueMap.country && Intrinsics.g(this.platform, keyValueMap.platform) && Intrinsics.g(this.app_version, keyValueMap.app_version) && Intrinsics.g(this.metricsInfo, keyValueMap.metricsInfo);
            }

            public final String getApp_version() {
                return this.app_version;
            }

            public final String getBetId() {
                return this.betId;
            }

            public final CountryCodeName getCountry() {
                return this.country;
            }

            public final Long getEndTime() {
                return this.endTime;
            }

            public final String getMetricsInfo() {
                return this.metricsInfo;
            }

            public final String getPlatform() {
                return this.platform;
            }

            public final long getStartTime() {
                return this.startTime;
            }

            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                int iA = f87.a(gmf0.a(this.betId.hashCode() * 31, 31, this.type), this.startTime, 31);
                Long l = this.endTime;
                return this.metricsInfo.hashCode() + gmf0.a(gmf0.a((this.country.hashCode() + ((iA + (l == null ? 0 : l.hashCode())) * 31)) * 31, 31, this.platform), 31, this.app_version);
            }

            public String toString() {
                String str = this.betId;
                String str2 = this.type;
                long j = this.startTime;
                Long l = this.endTime;
                CountryCodeName countryCodeName = this.country;
                String str3 = this.platform;
                String str4 = this.app_version;
                String str5 = this.metricsInfo;
                StringBuilder sbA = ux5.a("KeyValueMap(betId=", str, ", type=", str2, ", startTime=");
                sbA.append(j);
                sbA.append(", endTime=");
                sbA.append(l);
                sbA.append(", country=");
                sbA.append(countryCodeName);
                sbA.append(", platform=");
                sbA.append(str3);
                hxa.c(sbA, ", app_version=", str4, ", metricsInfo=", str5);
                sbA.append(")");
                return sbA.toString();
            }

            public /* synthetic */ KeyValueMap(String str, String str2, long j, Long l, CountryCodeName countryCodeName, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, j, (i & 8) != 0 ? null : l, countryCodeName, (i & 32) != 0 ? "android" : str3, str4, str5);
            }
        }
    }
}
