package com.sporty.android.sportytv.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.em5;
import defpackage.f87;
import defpackage.gpp;
import defpackage.to10;
import defpackage.u4;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001d\u001a\u00020\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Jk\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0014\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cÊ\u0001\f\b-\u0012\b\b.\u0012\u0004\b\u0003\u0010\u0002¨\u0006,"}, d2 = {"Lcom/sporty/android/sportytv/data/Program;", "", AnalyticsParam.EVENT_PARAM_ID, "", "description", AnalyticsParam.KEY_BI_DURATION, "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "sportsType", "startTime", "streamType", "", "title", "isFavorite", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JILjava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getDescription", "getDuration", "()J", "getEventId", "getSportsType", "getStartTime", "getStreamType", "()I", "getTitle", "()Z", "isLive", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sportyMedia", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Program {
    public static final int $stable = 0;
    private final String description;
    private final long duration;
    private final String eventId;
    private final String id;
    private final boolean isFavorite;
    private final String sportsType;
    private final long startTime;
    private final int streamType;
    private final String title;

    public Program(String str, String str2, long j, String str3, String str4, long j2, int i, String str5, boolean z) {
        str.getClass();
        this.id = str;
        this.description = str2;
        this.duration = j;
        this.eventId = str3;
        this.sportsType = str4;
        this.startTime = j2;
        this.streamType = i;
        this.title = str5;
        this.isFavorite = z;
    }

    public static /* synthetic */ Program copy$default(Program program, String str, String str2, long j, String str3, String str4, long j2, int i, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = program.id;
        }
        if ((i2 & 2) != 0) {
            str2 = program.description;
        }
        if ((i2 & 4) != 0) {
            j = program.duration;
        }
        if ((i2 & 8) != 0) {
            str3 = program.eventId;
        }
        if ((i2 & 16) != 0) {
            str4 = program.sportsType;
        }
        if ((i2 & 32) != 0) {
            j2 = program.startTime;
        }
        if ((i2 & 64) != 0) {
            i = program.streamType;
        }
        if ((i2 & 128) != 0) {
            str5 = program.title;
        }
        if ((i2 & 256) != 0) {
            z = program.isFavorite;
        }
        boolean z2 = z;
        int i3 = i;
        long j3 = j2;
        String str6 = str3;
        long j4 = j;
        return program.copy(str, str2, j4, str6, str4, j3, i3, str5, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSportsType() {
        return this.sportsType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStreamType() {
        return this.streamType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final Program copy(String id, String description, long duration, String eventId, String sportsType, long startTime, int streamType, String title, boolean isFavorite) {
        id.getClass();
        return new Program(id, description, duration, eventId, sportsType, startTime, streamType, title, isFavorite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Program)) {
            return false;
        }
        Program program = (Program) other;
        return Intrinsics.g(this.id, program.id) && Intrinsics.g(this.description, program.description) && this.duration == program.duration && Intrinsics.g(this.eventId, program.eventId) && Intrinsics.g(this.sportsType, program.sportsType) && this.startTime == program.startTime && this.streamType == program.streamType && Intrinsics.g(this.title, program.title) && this.isFavorite == program.isFavorite;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSportsType() {
        return this.sportsType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStreamType() {
        return this.streamType;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.description;
        int iA = f87.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.duration, 31);
        String str2 = this.eventId;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sportsType;
        int iA2 = gpp.a(this.streamType, f87.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.startTime, 31), 31);
        String str4 = this.title;
        return Boolean.hashCode(this.isFavorite) + ((iA2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final boolean isLive() {
        return this.streamType == StreamType.LIVE.getValue();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.description;
        long j = this.duration;
        String str3 = this.eventId;
        String str4 = this.sportsType;
        long j2 = this.startTime;
        int i = this.streamType;
        String str5 = this.title;
        boolean z = this.isFavorite;
        StringBuilder sbA = ux5.a("Program(id=", str, ", description=", str2, ", duration=");
        em5.a(j, ", eventId=", str3, sbA);
        u4.a(sbA, ", sportsType=", str4, ", startTime=");
        to10.a(sbA, j2, ", streamType=", i);
        sbA.append(", title=");
        sbA.append(str5);
        sbA.append(", isFavorite=");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }
}
