package com.sportygames.pingpong.remote.models;

import com.twilio.voice.EventKeys;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sportygames/pingpong/remote/models/CashOutOverUnderRequest;", "", "betId", "", "roundId", "coefficient", "", EventKeys.TIMESTAMP, "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getBetId", "()I", "getRoundId", "getCoefficient", "()Ljava/lang/String;", "getTimestamp", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashOutOverUnderRequest {
    public static final int $stable = 0;
    private final int betId;
    private final String coefficient;
    private final int roundId;
    private final String timestamp;

    public CashOutOverUnderRequest(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.betId = i;
        this.roundId = i2;
        this.coefficient = str;
        this.timestamp = str2;
    }

    public final int getBetId() {
        return this.betId;
    }

    public final String getCoefficient() {
        return this.coefficient;
    }

    public final int getRoundId() {
        return this.roundId;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }
}
