package com.sportybet.feature.luckynumber.lobby.data.dto;

import defpackage.f87;
import defpackage.gmf0;
import defpackage.ux5;
import defpackage.zug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eÊ\u0001\u0002\b\u001cÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNStreamScheduleItemDTO;", "", "streamId", "", "title", "startTime", "", "endTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getStreamId", "()Ljava/lang/String;", "getTitle", "getStartTime", "()J", "getEndTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNStreamScheduleItemDTO {
    public static final int $stable = 0;
    private final long endTime;
    private final long startTime;
    private final String streamId;
    private final String title;

    public LNStreamScheduleItemDTO(String str, String str2, long j, long j2) {
        str.getClass();
        str2.getClass();
        this.streamId = str;
        this.title = str2;
        this.startTime = j;
        this.endTime = j2;
    }

    public static /* synthetic */ LNStreamScheduleItemDTO copy$default(LNStreamScheduleItemDTO lNStreamScheduleItemDTO, String str, String str2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNStreamScheduleItemDTO.streamId;
        }
        if ((i & 2) != 0) {
            str2 = lNStreamScheduleItemDTO.title;
        }
        if ((i & 4) != 0) {
            j = lNStreamScheduleItemDTO.startTime;
        }
        if ((i & 8) != 0) {
            j2 = lNStreamScheduleItemDTO.endTime;
        }
        long j3 = j2;
        return lNStreamScheduleItemDTO.copy(str, str2, j, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStreamId() {
        return this.streamId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    public final LNStreamScheduleItemDTO copy(String streamId, String title, long startTime, long endTime) {
        streamId.getClass();
        title.getClass();
        return new LNStreamScheduleItemDTO(streamId, title, startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNStreamScheduleItemDTO)) {
            return false;
        }
        LNStreamScheduleItemDTO lNStreamScheduleItemDTO = (LNStreamScheduleItemDTO) other;
        return Intrinsics.g(this.streamId, lNStreamScheduleItemDTO.streamId) && Intrinsics.g(this.title, lNStreamScheduleItemDTO.title) && this.startTime == lNStreamScheduleItemDTO.startTime && this.endTime == lNStreamScheduleItemDTO.endTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getStreamId() {
        return this.streamId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Long.hashCode(this.endTime) + f87.a(gmf0.a(this.streamId.hashCode() * 31, 31, this.title), this.startTime, 31);
    }

    public String toString() {
        String str = this.streamId;
        String str2 = this.title;
        long j = this.startTime;
        long j2 = this.endTime;
        StringBuilder sbA = ux5.a("LNStreamScheduleItemDTO(streamId=", str, ", title=", str2, ", startTime=");
        sbA.append(j);
        return zug.a(j2, ", endTime=", ")", sbA);
    }
}
