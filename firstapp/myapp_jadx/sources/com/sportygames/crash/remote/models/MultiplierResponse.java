package com.sportygames.crash.remote.models;

import com.appsflyer.internal.b0;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.zug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006&"}, d2 = {"Lcom/sportygames/crash/remote/models/MultiplierResponse;", "", "roundId", "", "currentMultiplier", "", "hasEnded", "", "millisLeft", "", "totalMillis", "messageType", "timeStamp", "<init>", "(JLjava/lang/String;ZIILjava/lang/String;J)V", "getRoundId", "()J", "getCurrentMultiplier", "()Ljava/lang/String;", "getHasEnded", "()Z", "getMillisLeft", "()I", "getTotalMillis", "getMessageType", "getTimeStamp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiplierResponse {
    public static final int $stable = 0;
    private final String currentMultiplier;
    private final boolean hasEnded;
    private final String messageType;
    private final int millisLeft;
    private final long roundId;
    private final long timeStamp;
    private final int totalMillis;

    public MultiplierResponse(long j, String str, boolean z, int i, int i2, String str2, long j2) {
        str2.getClass();
        this.roundId = j;
        this.currentMultiplier = str;
        this.hasEnded = z;
        this.millisLeft = i;
        this.totalMillis = i2;
        this.messageType = str2;
        this.timeStamp = j2;
    }

    public static /* synthetic */ MultiplierResponse copy$default(MultiplierResponse multiplierResponse, long j, String str, boolean z, int i, int i2, String str2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = multiplierResponse.roundId;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            str = multiplierResponse.currentMultiplier;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            z = multiplierResponse.hasEnded;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            i = multiplierResponse.millisLeft;
        }
        return multiplierResponse.copy(j3, str3, z2, i, (i3 & 16) != 0 ? multiplierResponse.totalMillis : i2, (i3 & 32) != 0 ? multiplierResponse.messageType : str2, (i3 & 64) != 0 ? multiplierResponse.timeStamp : j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrentMultiplier() {
        return this.currentMultiplier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasEnded() {
        return this.hasEnded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMillisLeft() {
        return this.millisLeft;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalMillis() {
        return this.totalMillis;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final MultiplierResponse copy(long roundId, String currentMultiplier, boolean hasEnded, int millisLeft, int totalMillis, String messageType, long timeStamp) {
        messageType.getClass();
        return new MultiplierResponse(roundId, currentMultiplier, hasEnded, millisLeft, totalMillis, messageType, timeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiplierResponse)) {
            return false;
        }
        MultiplierResponse multiplierResponse = (MultiplierResponse) other;
        return this.roundId == multiplierResponse.roundId && Intrinsics.g(this.currentMultiplier, multiplierResponse.currentMultiplier) && this.hasEnded == multiplierResponse.hasEnded && this.millisLeft == multiplierResponse.millisLeft && this.totalMillis == multiplierResponse.totalMillis && Intrinsics.g(this.messageType, multiplierResponse.messageType) && this.timeStamp == multiplierResponse.timeStamp;
    }

    public final String getCurrentMultiplier() {
        return this.currentMultiplier;
    }

    public final boolean getHasEnded() {
        return this.hasEnded;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final int getMillisLeft() {
        return this.millisLeft;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final int getTotalMillis() {
        return this.totalMillis;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.roundId) * 31;
        String str = this.currentMultiplier;
        return Long.hashCode(this.timeStamp) + gmf0.a(gpp.a(this.totalMillis, gpp.a(this.millisLeft, mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasEnded), 31), 31), 31, this.messageType);
    }

    public String toString() {
        long j = this.roundId;
        String str = this.currentMultiplier;
        boolean z = this.hasEnded;
        int i = this.millisLeft;
        int i2 = this.totalMillis;
        String str2 = this.messageType;
        long j2 = this.timeStamp;
        StringBuilder sbA = b0.a(j, "MultiplierResponse(roundId=", ", currentMultiplier=", str);
        sbA.append(", hasEnded=");
        sbA.append(z);
        sbA.append(", millisLeft=");
        sbA.append(i);
        sbA.append(", totalMillis=");
        sbA.append(i2);
        sbA.append(", messageType=");
        sbA.append(str2);
        return zug.a(j2, ", timeStamp=", ")", sbA);
    }
}
