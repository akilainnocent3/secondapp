package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.appsflyer.internal.a0;
import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.hxa;
import defpackage.kwi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010&\u001a\u00020\bHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R'\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R'\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R'\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R'\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016Ê\u0001\f\b(\u0012\b\b)\u0012\u0004\b\u0003\u0010\u0002¨\u0006'"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballEventResultTimeline;", "", "segmentId", "", "startOffsetMs", "", "durationMs", "type", "", "action", "side", "src", "<init>", "(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSegmentId", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getStartOffsetMs", "()J", "getDurationMs", "getType", "()Ljava/lang/String;", "getAction", "getSide", "getSrc", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballEventResultTimeline {
    public static final int $stable = 0;

    @SerializedName("action")
    private final String action;

    @SerializedName("durationMs")
    private final long durationMs;

    @SerializedName("segmentId")
    private final int segmentId;

    @SerializedName("side")
    private final String side;

    @SerializedName("src")
    private final String src;

    @SerializedName("startOffsetMs")
    private final long startOffsetMs;

    @SerializedName("type")
    private final String type;

    public NetworkScheduledFootballEventResultTimeline(int i, long j, long j2, String str, String str2, String str3, String str4) {
        this.segmentId = i;
        this.startOffsetMs = j;
        this.durationMs = j2;
        this.type = str;
        this.action = str2;
        this.side = str3;
        this.src = str4;
    }

    public static /* synthetic */ NetworkScheduledFootballEventResultTimeline copy$default(NetworkScheduledFootballEventResultTimeline networkScheduledFootballEventResultTimeline, int i, long j, long j2, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = networkScheduledFootballEventResultTimeline.segmentId;
        }
        if ((i2 & 2) != 0) {
            j = networkScheduledFootballEventResultTimeline.startOffsetMs;
        }
        if ((i2 & 4) != 0) {
            j2 = networkScheduledFootballEventResultTimeline.durationMs;
        }
        if ((i2 & 8) != 0) {
            str = networkScheduledFootballEventResultTimeline.type;
        }
        if ((i2 & 16) != 0) {
            str2 = networkScheduledFootballEventResultTimeline.action;
        }
        if ((i2 & 32) != 0) {
            str3 = networkScheduledFootballEventResultTimeline.side;
        }
        if ((i2 & 64) != 0) {
            str4 = networkScheduledFootballEventResultTimeline.src;
        }
        long j3 = j2;
        return networkScheduledFootballEventResultTimeline.copy(i, j, j3, str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSegmentId() {
        return this.segmentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartOffsetMs() {
        return this.startOffsetMs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    public final NetworkScheduledFootballEventResultTimeline copy(int segmentId, long startOffsetMs, long durationMs, String type, String action, String side, String src) {
        return new NetworkScheduledFootballEventResultTimeline(segmentId, startOffsetMs, durationMs, type, action, side, src);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballEventResultTimeline)) {
            return false;
        }
        NetworkScheduledFootballEventResultTimeline networkScheduledFootballEventResultTimeline = (NetworkScheduledFootballEventResultTimeline) other;
        return this.segmentId == networkScheduledFootballEventResultTimeline.segmentId && this.startOffsetMs == networkScheduledFootballEventResultTimeline.startOffsetMs && this.durationMs == networkScheduledFootballEventResultTimeline.durationMs && Intrinsics.g(this.type, networkScheduledFootballEventResultTimeline.type) && Intrinsics.g(this.action, networkScheduledFootballEventResultTimeline.action) && Intrinsics.g(this.side, networkScheduledFootballEventResultTimeline.side) && Intrinsics.g(this.src, networkScheduledFootballEventResultTimeline.src);
    }

    public final String getAction() {
        return this.action;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final int getSegmentId() {
        return this.segmentId;
    }

    public final String getSide() {
        return this.side;
    }

    public final String getSrc() {
        return this.src;
    }

    public final long getStartOffsetMs() {
        return this.startOffsetMs;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = f87.a(f87.a(Integer.hashCode(this.segmentId) * 31, this.startOffsetMs, 31), this.durationMs, 31);
        String str = this.type;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.side;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.src;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = this.segmentId;
        long j = this.startOffsetMs;
        long j2 = this.durationMs;
        String str = this.type;
        String str2 = this.action;
        String str3 = this.side;
        String str4 = this.src;
        StringBuilder sbA = a0.a("NetworkScheduledFootballEventResultTimeline(segmentId=", ", startOffsetMs=", i, j);
        g41.a(j2, ", durationMs=", ", type=", sbA);
        hxa.c(sbA, str, ", action=", str2, ", side=");
        return kwi.a(sbA, str3, ", src=", str4, ")");
    }
}
