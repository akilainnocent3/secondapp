package com.sportygames.compose.chat.data.model;

import defpackage.j26;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/sportygames/compose/chat/data/model/NextRainResponse;", "", "startTime", "", "freeBetCount", "", "totalFreeBetValue", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getStartTime", "()Ljava/lang/String;", "getFreeBetCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalFreeBetValue", "getCurrency", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sportygames/compose/chat/data/model/NextRainResponse;", "equals", "", "other", "hashCode", "toString", "compose-chat_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NextRainResponse {
    public static final int $stable = 0;
    private final String currency;
    private final Integer freeBetCount;
    private final String startTime;
    private final Integer totalFreeBetValue;

    public NextRainResponse(String str, Integer num, Integer num2, String str2) {
        this.startTime = str;
        this.freeBetCount = num;
        this.totalFreeBetValue = num2;
        this.currency = str2;
    }

    public static /* synthetic */ NextRainResponse copy$default(NextRainResponse nextRainResponse, String str, Integer num, Integer num2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nextRainResponse.startTime;
        }
        if ((i & 2) != 0) {
            num = nextRainResponse.freeBetCount;
        }
        if ((i & 4) != 0) {
            num2 = nextRainResponse.totalFreeBetValue;
        }
        if ((i & 8) != 0) {
            str2 = nextRainResponse.currency;
        }
        return nextRainResponse.copy(str, num, num2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getFreeBetCount() {
        return this.freeBetCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTotalFreeBetValue() {
        return this.totalFreeBetValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final NextRainResponse copy(String startTime, Integer freeBetCount, Integer totalFreeBetValue, String currency) {
        return new NextRainResponse(startTime, freeBetCount, totalFreeBetValue, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NextRainResponse)) {
            return false;
        }
        NextRainResponse nextRainResponse = (NextRainResponse) other;
        return Intrinsics.g(this.startTime, nextRainResponse.startTime) && Intrinsics.g(this.freeBetCount, nextRainResponse.freeBetCount) && Intrinsics.g(this.totalFreeBetValue, nextRainResponse.totalFreeBetValue) && Intrinsics.g(this.currency, nextRainResponse.currency);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Integer getFreeBetCount() {
        return this.freeBetCount;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final Integer getTotalFreeBetValue() {
        return this.totalFreeBetValue;
    }

    public int hashCode() {
        String str = this.startTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.freeBetCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalFreeBetValue;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.currency;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NextRainResponse(startTime=");
        sb.append(this.startTime);
        sb.append(", freeBetCount=");
        sb.append(this.freeBetCount);
        sb.append(", totalFreeBetValue=");
        sb.append(this.totalFreeBetValue);
        sb.append(", currency=");
        return j26.a(sb, this.currency, ')');
    }
}
