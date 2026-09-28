package com.sportybet.android.instantwin.newtork.model.tracking;

import com.appsflyer.internal.b0;
import com.appsflyer.internal.m;
import com.appsflyer.internal.w;
import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.core.model.tracking.TrackingKind;
import com.sporty.android.core.model.tracking.TrackingType;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.pdd0;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0019\u0017J/\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTrackingEvent;", "Lpdd0;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "createCustomMetrics", "()Ljava/util/HashMap;", "", "getDurationMs", "()J", "durationMs", "getApiPath", "()Ljava/lang/String;", "apiPath", "getSource", "source", "getBizType", "bizType", "", "getSuccess", "()Z", AnalyticsParam.EVENT_PARAM_SUCCESS, "Companion", "CommonApiResponseTimeEvent", "OkrApiResponseTimeEvent", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTrackingEvent$CommonApiResponseTimeEvent;", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTrackingEvent$OkrApiResponseTimeEvent;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface InstantWinApiTrackingEvent extends pdd0 {
    public static final String COMMON_API_RESPONSE_TIME_EVENT_NAME = "iv__api_req_res__timestamp_diff";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J3\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019Ê\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0002¨\u0006%"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTrackingEvent$CommonApiResponseTimeEvent;", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTrackingEvent;", "durationMs", "", "apiPath", "", "bizType", AnalyticsParam.EVENT_PARAM_SUCCESS, "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Z)V", "getDurationMs", "()J", "getApiPath", "()Ljava/lang/String;", "getBizType", "getSuccess", "()Z", "name", "getName", "source", "getSource", "trackingKind", "Lcom/sporty/android/core/model/tracking/TrackingKind;", "getTrackingKind", "()Lcom/sporty/android/core/model/tracking/TrackingKind;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CommonApiResponseTimeEvent implements InstantWinApiTrackingEvent {
        public static final int $stable = 0;
        private final String apiPath;
        private final String bizType;
        private final long durationMs;
        private final String name;
        private final String source;
        private final boolean success;
        private final TrackingKind trackingKind;

        public CommonApiResponseTimeEvent(long j, String str, String str2, boolean z) {
            str.getClass();
            this.durationMs = j;
            this.apiPath = str;
            this.bizType = str2;
            this.success = z;
            this.name = "iv__api_req_res__timestamp_diff";
            this.trackingKind = TrackingKind.Measurement;
        }

        public static /* synthetic */ CommonApiResponseTimeEvent copy$default(CommonApiResponseTimeEvent commonApiResponseTimeEvent, long j, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = commonApiResponseTimeEvent.durationMs;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = commonApiResponseTimeEvent.apiPath;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = commonApiResponseTimeEvent.bizType;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                z = commonApiResponseTimeEvent.success;
            }
            return commonApiResponseTimeEvent.copy(j2, str3, str4, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getApiPath() {
            return this.apiPath;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBizType() {
            return this.bizType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public final CommonApiResponseTimeEvent copy(long durationMs, String apiPath, String bizType, boolean success) {
            apiPath.getClass();
            return new CommonApiResponseTimeEvent(durationMs, apiPath, bizType, success);
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public /* bridge */ HashMap<String, Object> createCustomMetrics() {
            return super.createCustomMetrics();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonApiResponseTimeEvent)) {
                return false;
            }
            CommonApiResponseTimeEvent commonApiResponseTimeEvent = (CommonApiResponseTimeEvent) other;
            return this.durationMs == commonApiResponseTimeEvent.durationMs && Intrinsics.g(this.apiPath, commonApiResponseTimeEvent.apiPath) && Intrinsics.g(this.bizType, commonApiResponseTimeEvent.bizType) && this.success == commonApiResponseTimeEvent.success;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public String getApiPath() {
            return this.apiPath;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public String getBizType() {
            return this.bizType;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public long getDurationMs() {
            return this.durationMs;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public /* bridge */ HashMap<String, Object> getGetCustomMetrics() {
            return super.getGetCustomMetrics();
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public /* bridge */ boolean getHasCustomMetrics() {
            return super.getHasCustomMetrics();
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public String getName() {
            return this.name;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public /* bridge */ PageMeta getPageMeta() {
            return super.getPageMeta();
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public /* bridge */ Map<String, Object> getProperty() {
            return super.getProperty();
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public String getSource() {
            return this.source;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public boolean getSuccess() {
            return this.success;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public TrackingKind getTrackingKind() {
            return this.trackingKind;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public /* bridge */ TrackingType getTrackingType() {
            return super.getTrackingType();
        }

        public int hashCode() {
            int iA = gmf0.a(Long.hashCode(this.durationMs) * 31, 31, this.apiPath);
            String str = this.bizType;
            return Boolean.hashCode(this.success) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            long j = this.durationMs;
            String str = this.apiPath;
            String str2 = this.bizType;
            boolean z = this.success;
            StringBuilder sbA = b0.a(j, "CommonApiResponseTimeEvent(durationMs=", ", apiPath=", str);
            sbA.append(", bizType=");
            sbA.append(str2);
            sbA.append(", success=");
            sbA.append(z);
            sbA.append(")");
            return sbA.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTrackingEvent$Companion;", "", "<init>", "()V", "COMMON_API_RESPONSE_TIME_EVENT_NAME", "", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String COMMON_API_RESPONSE_TIME_EVENT_NAME = "iv__api_req_res__timestamp_diff";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static HashMap<String, Object> createCustomMetrics(InstantWinApiTrackingEvent instantWinApiTrackingEvent) {
            return InstantWinApiTrackingEvent.super.createCustomMetrics();
        }

        @Deprecated
        public static HashMap<String, Object> getGetCustomMetrics(InstantWinApiTrackingEvent instantWinApiTrackingEvent) {
            return InstantWinApiTrackingEvent.super.getGetCustomMetrics();
        }

        @Deprecated
        public static boolean getHasCustomMetrics(InstantWinApiTrackingEvent instantWinApiTrackingEvent) {
            return InstantWinApiTrackingEvent.super.getHasCustomMetrics();
        }

        @Deprecated
        public static PageMeta getPageMeta(InstantWinApiTrackingEvent instantWinApiTrackingEvent) {
            return InstantWinApiTrackingEvent.super.getPageMeta();
        }

        @Deprecated
        public static Map<String, Object> getProperty(InstantWinApiTrackingEvent instantWinApiTrackingEvent) {
            return InstantWinApiTrackingEvent.super.getProperty();
        }

        @Deprecated
        public static TrackingKind getTrackingKind(InstantWinApiTrackingEvent instantWinApiTrackingEvent) {
            return InstantWinApiTrackingEvent.super.getTrackingKind();
        }

        @Deprecated
        public static TrackingType getTrackingType(InstantWinApiTrackingEvent instantWinApiTrackingEvent) {
            return InstantWinApiTrackingEvent.super.getTrackingType();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rÊ\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0002¨\u0006\""}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTrackingEvent$OkrApiResponseTimeEvent;", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTrackingEvent;", "name", "", "durationMs", "", "source", "bizType", AnalyticsParam.EVENT_PARAM_SUCCESS, "", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getDurationMs", "()J", "getSource", "getBizType", "getSuccess", "()Z", "apiPath", "getApiPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class OkrApiResponseTimeEvent implements InstantWinApiTrackingEvent {
        public static final int $stable = 0;
        private final String apiPath;
        private final String bizType;
        private final long durationMs;
        private final String name;
        private final String source;
        private final boolean success;

        public OkrApiResponseTimeEvent(String str, long j, String str2, String str3, boolean z) {
            m.a(str, str2, str3);
            this.name = str;
            this.durationMs = j;
            this.source = str2;
            this.bizType = str3;
            this.success = z;
        }

        public static /* synthetic */ OkrApiResponseTimeEvent copy$default(OkrApiResponseTimeEvent okrApiResponseTimeEvent, String str, long j, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = okrApiResponseTimeEvent.name;
            }
            if ((i & 2) != 0) {
                j = okrApiResponseTimeEvent.durationMs;
            }
            if ((i & 4) != 0) {
                str2 = okrApiResponseTimeEvent.source;
            }
            if ((i & 8) != 0) {
                str3 = okrApiResponseTimeEvent.bizType;
            }
            if ((i & 16) != 0) {
                z = okrApiResponseTimeEvent.success;
            }
            boolean z2 = z;
            String str4 = str2;
            return okrApiResponseTimeEvent.copy(str, j, str4, str3, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBizType() {
            return this.bizType;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public final OkrApiResponseTimeEvent copy(String name, long durationMs, String source, String bizType, boolean success) {
            name.getClass();
            source.getClass();
            bizType.getClass();
            return new OkrApiResponseTimeEvent(name, durationMs, source, bizType, success);
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public /* bridge */ HashMap<String, Object> createCustomMetrics() {
            return super.createCustomMetrics();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OkrApiResponseTimeEvent)) {
                return false;
            }
            OkrApiResponseTimeEvent okrApiResponseTimeEvent = (OkrApiResponseTimeEvent) other;
            return Intrinsics.g(this.name, okrApiResponseTimeEvent.name) && this.durationMs == okrApiResponseTimeEvent.durationMs && Intrinsics.g(this.source, okrApiResponseTimeEvent.source) && Intrinsics.g(this.bizType, okrApiResponseTimeEvent.bizType) && this.success == okrApiResponseTimeEvent.success;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public String getApiPath() {
            return this.apiPath;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public String getBizType() {
            return this.bizType;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public long getDurationMs() {
            return this.durationMs;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public /* bridge */ HashMap<String, Object> getGetCustomMetrics() {
            return super.getGetCustomMetrics();
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public /* bridge */ boolean getHasCustomMetrics() {
            return super.getHasCustomMetrics();
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public String getName() {
            return this.name;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public /* bridge */ PageMeta getPageMeta() {
            return super.getPageMeta();
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public /* bridge */ Map<String, Object> getProperty() {
            return super.getProperty();
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public String getSource() {
            return this.source;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent
        public boolean getSuccess() {
            return this.success;
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public /* bridge */ TrackingKind getTrackingKind() {
            return super.getTrackingKind();
        }

        @Override // com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTrackingEvent, defpackage.pdd0
        public /* bridge */ TrackingType getTrackingType() {
            return super.getTrackingType();
        }

        public int hashCode() {
            return Boolean.hashCode(this.success) + gmf0.a(gmf0.a(f87.a(this.name.hashCode() * 31, this.durationMs, 31), 31, this.source), 31, this.bizType);
        }

        public String toString() {
            String str = this.name;
            long j = this.durationMs;
            String str2 = this.source;
            String str3 = this.bizType;
            boolean z = this.success;
            StringBuilder sbA = x.a(j, "OkrApiResponseTimeEvent(name=", str, ", durationMs=");
            hxa.c(sbA, ", source=", str2, ", bizType=", str3);
            return w.a(sbA, ", success=", z, ")");
        }
    }

    @Override // defpackage.pdd0
    default HashMap<String, Object> createCustomMetrics() {
        return InstantWinApiTrackingEventKt.customMetricsOf(new Pair(AnalyticsParam.STORY_DURATION, Long.valueOf(getDurationMs())), new Pair("api_path", getApiPath()), new Pair("source", getSource()), new Pair("biz_type", getBizType()), new Pair(AnalyticsParam.EVENT_PARAM_SUCCESS, Boolean.valueOf(getSuccess())));
    }

    String getApiPath();

    String getBizType();

    long getDurationMs();

    @Override // defpackage.pdd0
    /* bridge */ /* synthetic */ default HashMap getGetCustomMetrics() {
        return super.getGetCustomMetrics();
    }

    default boolean getHasCustomMetrics() {
        return getGetCustomMetrics() != null;
    }

    @Override // defpackage.pdd0
    /* synthetic */ String getName();

    @Override // defpackage.pdd0
    /* bridge */ /* synthetic */ default PageMeta getPageMeta() {
        return null;
    }

    @Override // defpackage.pdd0
    /* bridge */ /* synthetic */ default Map getProperty() {
        return super.getProperty();
    }

    String getSource();

    boolean getSuccess();

    @Override // defpackage.pdd0
    default TrackingKind getTrackingKind() {
        return TrackingKind.Event;
    }

    @Override // defpackage.pdd0
    default TrackingType getTrackingType() {
        return TrackingType.BiAnalytics;
    }
}
