package com.sportybet.android.instantwin.newtork.model.response.doubleornothing;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.dy5;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.zug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0006\u0010\"\u001a\u00020\u0003J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0083\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0006HÖ\u0081\u0004J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR'\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R%\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R%\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016Ê\u0001\u0002\b/Ê\u0001\f\b0\u0012\b\b1\u0012\u0004\b\u0003\u0010\u0000¨\u0006."}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingDetailRound;", "Landroid/os/Parcelable;", "roundNumber", "", AnalyticsParam.EVENT_PARAM_RESULT, "ticketNumber", "", "baseAmount", "", "cashout", "stake", "roundBalance", "<init>", "(IILjava/lang/String;JJJJ)V", "getRoundNumber", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getResult", "getTicketNumber", "()Ljava/lang/String;", "getBaseAmount", "()J", "getCashout", "getStake", "getRoundBalance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkDoubleOrNothingDetailRound implements Parcelable {

    @SerializedName("baseAmount")
    private final long baseAmount;

    @SerializedName("cashout")
    private final long cashout;

    @SerializedName(AnalyticsParam.EVENT_PARAM_RESULT)
    private final int result;

    @SerializedName("roundBalance")
    private final long roundBalance;

    @SerializedName("roundNumber")
    private final int roundNumber;

    @SerializedName("stake")
    private final long stake;

    @SerializedName("ticketNumber")
    private final String ticketNumber;
    public static final Parcelable.Creator<NetworkDoubleOrNothingDetailRound> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NetworkDoubleOrNothingDetailRound> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkDoubleOrNothingDetailRound createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new NetworkDoubleOrNothingDetailRound(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkDoubleOrNothingDetailRound[] newArray(int i) {
            return new NetworkDoubleOrNothingDetailRound[i];
        }
    }

    public NetworkDoubleOrNothingDetailRound(int i, int i2, String str, long j, long j2, long j3, long j4) {
        this.roundNumber = i;
        this.result = i2;
        this.ticketNumber = str;
        this.baseAmount = j;
        this.cashout = j2;
        this.stake = j3;
        this.roundBalance = j4;
    }

    public static /* synthetic */ NetworkDoubleOrNothingDetailRound copy$default(NetworkDoubleOrNothingDetailRound networkDoubleOrNothingDetailRound, int i, int i2, String str, long j, long j2, long j3, long j4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = networkDoubleOrNothingDetailRound.roundNumber;
        }
        if ((i3 & 2) != 0) {
            i2 = networkDoubleOrNothingDetailRound.result;
        }
        if ((i3 & 4) != 0) {
            str = networkDoubleOrNothingDetailRound.ticketNumber;
        }
        if ((i3 & 8) != 0) {
            j = networkDoubleOrNothingDetailRound.baseAmount;
        }
        if ((i3 & 16) != 0) {
            j2 = networkDoubleOrNothingDetailRound.cashout;
        }
        if ((i3 & 32) != 0) {
            j3 = networkDoubleOrNothingDetailRound.stake;
        }
        if ((i3 & 64) != 0) {
            j4 = networkDoubleOrNothingDetailRound.roundBalance;
        }
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        String str2 = str;
        return networkDoubleOrNothingDetailRound.copy(i, i2, str2, j, j7, j6, j5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRoundNumber() {
        return this.roundNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTicketNumber() {
        return this.ticketNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCashout() {
        return this.cashout;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getStake() {
        return this.stake;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getRoundBalance() {
        return this.roundBalance;
    }

    public final NetworkDoubleOrNothingDetailRound copy(int roundNumber, int result, String ticketNumber, long baseAmount, long cashout, long stake, long roundBalance) {
        return new NetworkDoubleOrNothingDetailRound(roundNumber, result, ticketNumber, baseAmount, cashout, stake, roundBalance);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkDoubleOrNothingDetailRound)) {
            return false;
        }
        NetworkDoubleOrNothingDetailRound networkDoubleOrNothingDetailRound = (NetworkDoubleOrNothingDetailRound) other;
        return this.roundNumber == networkDoubleOrNothingDetailRound.roundNumber && this.result == networkDoubleOrNothingDetailRound.result && Intrinsics.g(this.ticketNumber, networkDoubleOrNothingDetailRound.ticketNumber) && this.baseAmount == networkDoubleOrNothingDetailRound.baseAmount && this.cashout == networkDoubleOrNothingDetailRound.cashout && this.stake == networkDoubleOrNothingDetailRound.stake && this.roundBalance == networkDoubleOrNothingDetailRound.roundBalance;
    }

    public final long getBaseAmount() {
        return this.baseAmount;
    }

    public final long getCashout() {
        return this.cashout;
    }

    public final int getResult() {
        return this.result;
    }

    public final long getRoundBalance() {
        return this.roundBalance;
    }

    public final int getRoundNumber() {
        return this.roundNumber;
    }

    public final long getStake() {
        return this.stake;
    }

    public final String getTicketNumber() {
        return this.ticketNumber;
    }

    public int hashCode() {
        int iA = gpp.a(this.result, Integer.hashCode(this.roundNumber) * 31, 31);
        String str = this.ticketNumber;
        return Long.hashCode(this.roundBalance) + f87.a(f87.a(f87.a((iA + (str == null ? 0 : str.hashCode())) * 31, this.baseAmount, 31), this.cashout, 31), this.stake, 31);
    }

    public String toString() {
        int i = this.roundNumber;
        int i2 = this.result;
        String str = this.ticketNumber;
        long j = this.baseAmount;
        long j2 = this.cashout;
        long j3 = this.stake;
        long j4 = this.roundBalance;
        StringBuilder sbA = dy5.a("NetworkDoubleOrNothingDetailRound(roundNumber=", i, i2, ", result=", ", ticketNumber=");
        l.a(j, str, ", baseAmount=", sbA);
        g41.a(j2, ", cashout=", ", stake=", sbA);
        sbA.append(j3);
        return zug.a(j4, ", roundBalance=", ")", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.roundNumber);
        dest.writeInt(this.result);
        dest.writeString(this.ticketNumber);
        dest.writeLong(this.baseAmount);
        dest.writeLong(this.cashout);
        dest.writeLong(this.stake);
        dest.writeLong(this.roundBalance);
    }
}
