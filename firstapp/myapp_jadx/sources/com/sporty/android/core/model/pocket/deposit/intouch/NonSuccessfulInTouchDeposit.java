package com.sporty.android.core.model.pocket.deposit.intouch;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.nrg0;
import defpackage.om2;
import defpackage.tag;
import defpackage.u4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/intouch/NonSuccessfulInTouchDeposit;", "", "channelId", "", "amount", "", "phoneNumber", "timestampMs", "", AnalyticsParam.EVENT_STATUS, "Lcom/sporty/android/core/model/pocket/deposit/intouch/NonSuccessfulInTouchDeposit$Status;", "<init>", "(Ljava/lang/String;DLjava/lang/String;JLcom/sporty/android/core/model/pocket/deposit/intouch/NonSuccessfulInTouchDeposit$Status;)V", "getChannelId", "()Ljava/lang/String;", "getAmount", "()D", "getPhoneNumber", "getTimestampMs", "()J", "getStatus", "()Lcom/sporty/android/core/model/pocket/deposit/intouch/NonSuccessfulInTouchDeposit$Status;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NonSuccessfulInTouchDeposit {
    private final double amount;
    private final String channelId;
    private final String phoneNumber;
    private final Status status;
    private final long timestampMs;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/intouch/NonSuccessfulInTouchDeposit$Status;", "", "<init>", "(Ljava/lang/String;I)V", PBBetHistoryItemDTO.STATUS_PENDING, "FAILED", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum Status {
        PENDING,
        FAILED;

        private static final /* synthetic */ tag $ENTRIES = om2.a(values());

        public static tag<Status> getEntries() {
            return $ENTRIES;
        }
    }

    public NonSuccessfulInTouchDeposit(String str, double d, String str2, long j, Status status) {
        str.getClass();
        str2.getClass();
        status.getClass();
        this.channelId = str;
        this.amount = d;
        this.phoneNumber = str2;
        this.timestampMs = j;
        this.status = status;
    }

    public static /* synthetic */ NonSuccessfulInTouchDeposit copy$default(NonSuccessfulInTouchDeposit nonSuccessfulInTouchDeposit, String str, double d, String str2, long j, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nonSuccessfulInTouchDeposit.channelId;
        }
        if ((i & 2) != 0) {
            d = nonSuccessfulInTouchDeposit.amount;
        }
        if ((i & 4) != 0) {
            str2 = nonSuccessfulInTouchDeposit.phoneNumber;
        }
        if ((i & 8) != 0) {
            j = nonSuccessfulInTouchDeposit.timestampMs;
        }
        if ((i & 16) != 0) {
            status = nonSuccessfulInTouchDeposit.status;
        }
        String str3 = str2;
        return nonSuccessfulInTouchDeposit.copy(str, d, str3, j, status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestampMs() {
        return this.timestampMs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final NonSuccessfulInTouchDeposit copy(String channelId, double amount, String phoneNumber, long timestampMs, Status status) {
        channelId.getClass();
        phoneNumber.getClass();
        status.getClass();
        return new NonSuccessfulInTouchDeposit(channelId, amount, phoneNumber, timestampMs, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonSuccessfulInTouchDeposit)) {
            return false;
        }
        NonSuccessfulInTouchDeposit nonSuccessfulInTouchDeposit = (NonSuccessfulInTouchDeposit) other;
        return Intrinsics.g(this.channelId, nonSuccessfulInTouchDeposit.channelId) && Double.compare(this.amount, nonSuccessfulInTouchDeposit.amount) == 0 && Intrinsics.g(this.phoneNumber, nonSuccessfulInTouchDeposit.phoneNumber) && this.timestampMs == nonSuccessfulInTouchDeposit.timestampMs && this.status == nonSuccessfulInTouchDeposit.status;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public int hashCode() {
        return this.status.hashCode() + f87.a(gmf0.a(nrg0.a(this.channelId.hashCode() * 31, 31, this.amount), 31, this.phoneNumber), this.timestampMs, 31);
    }

    public String toString() {
        String str = this.channelId;
        double d = this.amount;
        String str2 = this.phoneNumber;
        long j = this.timestampMs;
        Status status = this.status;
        StringBuilder sb = new StringBuilder("NonSuccessfulInTouchDeposit(channelId=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(d);
        u4.a(sb, ", phoneNumber=", str2, ", timestampMs=");
        sb.append(j);
        sb.append(", status=");
        sb.append(status);
        sb.append(")");
        return sb.toString();
    }
}
