package com.sportygames.vip.data;

import com.appsflyer.internal.m;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.j26;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006#"}, d2 = {"Lcom/sportygames/vip/data/UserTopCoeffResponse;", "", "userId", "", "betId", "cashoutCoefficient", "", "currency", "", "startTime", "endTime", "<init>", "(JJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()J", "getBetId", "getCashoutCoefficient", "()D", "getCurrency", "()Ljava/lang/String;", "getStartTime", "getEndTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserTopCoeffResponse {
    public static final int $stable = 0;
    private final long betId;
    private final double cashoutCoefficient;
    private final String currency;
    private final String endTime;
    private final String startTime;
    private final long userId;

    public UserTopCoeffResponse(long j, long j2, double d, String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.userId = j;
        this.betId = j2;
        this.cashoutCoefficient = d;
        this.currency = str;
        this.startTime = str2;
        this.endTime = str3;
    }

    public static /* synthetic */ UserTopCoeffResponse copy$default(UserTopCoeffResponse userTopCoeffResponse, long j, long j2, double d, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userTopCoeffResponse.userId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = userTopCoeffResponse.betId;
        }
        return userTopCoeffResponse.copy(j3, j2, (i & 4) != 0 ? userTopCoeffResponse.cashoutCoefficient : d, (i & 8) != 0 ? userTopCoeffResponse.currency : str, (i & 16) != 0 ? userTopCoeffResponse.startTime : str2, (i & 32) != 0 ? userTopCoeffResponse.endTime : str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    public final UserTopCoeffResponse copy(long userId, long betId, double cashoutCoefficient, String currency, String startTime, String endTime) {
        currency.getClass();
        startTime.getClass();
        endTime.getClass();
        return new UserTopCoeffResponse(userId, betId, cashoutCoefficient, currency, startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserTopCoeffResponse)) {
            return false;
        }
        UserTopCoeffResponse userTopCoeffResponse = (UserTopCoeffResponse) other;
        return this.userId == userTopCoeffResponse.userId && this.betId == userTopCoeffResponse.betId && Double.compare(this.cashoutCoefficient, userTopCoeffResponse.cashoutCoefficient) == 0 && Intrinsics.g(this.currency, userTopCoeffResponse.currency) && Intrinsics.g(this.startTime, userTopCoeffResponse.startTime) && Intrinsics.g(this.endTime, userTopCoeffResponse.endTime);
    }

    public final long getBetId() {
        return this.betId;
    }

    public final double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.endTime.hashCode() + gmf0.a(gmf0.a(nrg0.a(f87.a(Long.hashCode(this.userId) * 31, this.betId, 31), 31, this.cashoutCoefficient), 31, this.currency), 31, this.startTime);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserTopCoeffResponse(userId=");
        sb.append(this.userId);
        sb.append(", betId=");
        sb.append(this.betId);
        sb.append(", cashoutCoefficient=");
        sb.append(this.cashoutCoefficient);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        return j26.a(sb, this.endTime, ')');
    }
}
