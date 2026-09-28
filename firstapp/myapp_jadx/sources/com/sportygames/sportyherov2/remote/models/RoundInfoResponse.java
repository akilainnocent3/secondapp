package com.sportygames.sportyherov2.remote.models;

import com.appsflyer.internal.b0;
import defpackage.gmf0;
import defpackage.zug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/sportygames/sportyherov2/remote/models/RoundInfoResponse;", "", "roundId", "", "messageType", "", "timeStamp", "<init>", "(JLjava/lang/String;J)V", "getRoundId", "()J", "getMessageType", "()Ljava/lang/String;", "getTimeStamp", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RoundInfoResponse {
    public static final int $stable = 0;
    private final String messageType;
    private final long roundId;
    private final long timeStamp;

    public RoundInfoResponse(long j, String str, long j2) {
        str.getClass();
        this.roundId = j;
        this.messageType = str;
        this.timeStamp = j2;
    }

    public static /* synthetic */ RoundInfoResponse copy$default(RoundInfoResponse roundInfoResponse, long j, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = roundInfoResponse.roundId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = roundInfoResponse.messageType;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = roundInfoResponse.timeStamp;
        }
        return roundInfoResponse.copy(j3, str2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final RoundInfoResponse copy(long roundId, String messageType, long timeStamp) {
        messageType.getClass();
        return new RoundInfoResponse(roundId, messageType, timeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundInfoResponse)) {
            return false;
        }
        RoundInfoResponse roundInfoResponse = (RoundInfoResponse) other;
        return this.roundId == roundInfoResponse.roundId && Intrinsics.g(this.messageType, roundInfoResponse.messageType) && this.timeStamp == roundInfoResponse.timeStamp;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timeStamp) + gmf0.a(Long.hashCode(this.roundId) * 31, 31, this.messageType);
    }

    public String toString() {
        return zug.a(this.timeStamp, ", timeStamp=", ")", b0.a(this.roundId, "RoundInfoResponse(roundId=", ", messageType=", this.messageType));
    }
}
