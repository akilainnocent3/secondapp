package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.ka1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R-\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0000¨\u0006#"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballEventResult;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "finalScore", "resultSequence", "totalDurationMs", "", "timeline", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballEventResultTimeline;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getFinalScore", "getResultSequence", "getTotalDurationMs", "()J", "getTimeline", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballEventResult {
    public static final int $stable = 8;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("finalScore")
    private final String finalScore;

    @SerializedName("resultSequence")
    private final String resultSequence;

    @SerializedName("timeline")
    private final List<NetworkScheduledFootballEventResultTimeline> timeline;

    @SerializedName("totalDurationMs")
    private final long totalDurationMs;

    public NetworkScheduledFootballEventResult(String str, String str2, String str3, long j, List<NetworkScheduledFootballEventResultTimeline> list) {
        this.eventId = str;
        this.finalScore = str2;
        this.resultSequence = str3;
        this.totalDurationMs = j;
        this.timeline = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballEventResult copy$default(NetworkScheduledFootballEventResult networkScheduledFootballEventResult, String str, String str2, String str3, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkScheduledFootballEventResult.eventId;
        }
        if ((i & 2) != 0) {
            str2 = networkScheduledFootballEventResult.finalScore;
        }
        if ((i & 4) != 0) {
            str3 = networkScheduledFootballEventResult.resultSequence;
        }
        if ((i & 8) != 0) {
            j = networkScheduledFootballEventResult.totalDurationMs;
        }
        if ((i & 16) != 0) {
            list = networkScheduledFootballEventResult.timeline;
        }
        List list2 = list;
        String str4 = str3;
        return networkScheduledFootballEventResult.copy(str, str2, str4, j, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFinalScore() {
        return this.finalScore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getResultSequence() {
        return this.resultSequence;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalDurationMs() {
        return this.totalDurationMs;
    }

    public final List<NetworkScheduledFootballEventResultTimeline> component5() {
        return this.timeline;
    }

    public final NetworkScheduledFootballEventResult copy(String eventId, String finalScore, String resultSequence, long totalDurationMs, List<NetworkScheduledFootballEventResultTimeline> timeline) {
        return new NetworkScheduledFootballEventResult(eventId, finalScore, resultSequence, totalDurationMs, timeline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballEventResult)) {
            return false;
        }
        NetworkScheduledFootballEventResult networkScheduledFootballEventResult = (NetworkScheduledFootballEventResult) other;
        return Intrinsics.g(this.eventId, networkScheduledFootballEventResult.eventId) && Intrinsics.g(this.finalScore, networkScheduledFootballEventResult.finalScore) && Intrinsics.g(this.resultSequence, networkScheduledFootballEventResult.resultSequence) && this.totalDurationMs == networkScheduledFootballEventResult.totalDurationMs && Intrinsics.g(this.timeline, networkScheduledFootballEventResult.timeline);
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getFinalScore() {
        return this.finalScore;
    }

    public final String getResultSequence() {
        return this.resultSequence;
    }

    public final List<NetworkScheduledFootballEventResultTimeline> getTimeline() {
        return this.timeline;
    }

    public final long getTotalDurationMs() {
        return this.totalDurationMs;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.finalScore;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resultSequence;
        int iA = f87.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.totalDurationMs, 31);
        List<NetworkScheduledFootballEventResultTimeline> list = this.timeline;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.finalScore;
        String str3 = this.resultSequence;
        long j = this.totalDurationMs;
        List<NetworkScheduledFootballEventResultTimeline> list = this.timeline;
        StringBuilder sbA = ux5.a("NetworkScheduledFootballEventResult(eventId=", str, ", finalScore=", str2, ", resultSequence=");
        l.a(j, str3, ", totalDurationMs=", sbA);
        return ka1.a(sbA, ", timeline=", list, ")");
    }
}
