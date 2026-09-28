package com.sportybet.android.instantwin.newtork.model.response.doubleornothing;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.x;
import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.nrg0;
import defpackage.p200;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JY\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010'\u001a\u00020\u0007J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0083\u0004J\n\u0010,\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0007R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R%\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR%\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R%\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eÊ\u0001\u0002\b4Ê\u0001\f\b5\u0012\b\b6\u0012\u0004\b\u0003\u0010\u0002¨\u00063"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingDetail;", "Landroid/os/Parcelable;", "sourceBetId", "", "sourceBetWinningAmount", "", "maxRounds", "", "odds", "", "totalReturn", "createTime", "rounds", "", "Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingDetailRound;", "<init>", "(Ljava/lang/String;JIDJJLjava/util/List;)V", "getSourceBetId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getSourceBetWinningAmount", "()J", "getMaxRounds", "()I", "getOdds", "()D", "getTotalReturn", "getCreateTime", "getRounds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkDoubleOrNothingDetail implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<NetworkDoubleOrNothingDetail> CREATOR = new Creator();

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("maxRounds")
    private final int maxRounds;

    @SerializedName("odds")
    private final double odds;

    @SerializedName("rounds")
    private final List<NetworkDoubleOrNothingDetailRound> rounds;

    @SerializedName("sourceBetId")
    private final String sourceBetId;

    @SerializedName("sourceBetWinningAmount")
    private final long sourceBetWinningAmount;

    @SerializedName("totalReturn")
    private final long totalReturn;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NetworkDoubleOrNothingDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkDoubleOrNothingDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            long j = parcel.readLong();
            int i = parcel.readInt();
            double d = parcel.readDouble();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = p200.a(NetworkDoubleOrNothingDetailRound.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new NetworkDoubleOrNothingDetail(string, j, i, d, j2, j3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkDoubleOrNothingDetail[] newArray(int i) {
            return new NetworkDoubleOrNothingDetail[i];
        }
    }

    public NetworkDoubleOrNothingDetail(String str, long j, int i, double d, long j2, long j3, List<NetworkDoubleOrNothingDetailRound> list) {
        this.sourceBetId = str;
        this.sourceBetWinningAmount = j;
        this.maxRounds = i;
        this.odds = d;
        this.totalReturn = j2;
        this.createTime = j3;
        this.rounds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkDoubleOrNothingDetail copy$default(NetworkDoubleOrNothingDetail networkDoubleOrNothingDetail, String str, long j, int i, double d, long j2, long j3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkDoubleOrNothingDetail.sourceBetId;
        }
        if ((i2 & 2) != 0) {
            j = networkDoubleOrNothingDetail.sourceBetWinningAmount;
        }
        if ((i2 & 4) != 0) {
            i = networkDoubleOrNothingDetail.maxRounds;
        }
        if ((i2 & 8) != 0) {
            d = networkDoubleOrNothingDetail.odds;
        }
        if ((i2 & 16) != 0) {
            j2 = networkDoubleOrNothingDetail.totalReturn;
        }
        if ((i2 & 32) != 0) {
            j3 = networkDoubleOrNothingDetail.createTime;
        }
        if ((i2 & 64) != 0) {
            list = networkDoubleOrNothingDetail.rounds;
        }
        List list2 = list;
        long j4 = j3;
        int i3 = i;
        return networkDoubleOrNothingDetail.copy(str, j, i3, d, j2, j4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSourceBetId() {
        return this.sourceBetId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSourceBetWinningAmount() {
        return this.sourceBetWinningAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxRounds() {
        return this.maxRounds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTotalReturn() {
        return this.totalReturn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<NetworkDoubleOrNothingDetailRound> component7() {
        return this.rounds;
    }

    public final NetworkDoubleOrNothingDetail copy(String sourceBetId, long sourceBetWinningAmount, int maxRounds, double odds, long totalReturn, long createTime, List<NetworkDoubleOrNothingDetailRound> rounds) {
        return new NetworkDoubleOrNothingDetail(sourceBetId, sourceBetWinningAmount, maxRounds, odds, totalReturn, createTime, rounds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkDoubleOrNothingDetail)) {
            return false;
        }
        NetworkDoubleOrNothingDetail networkDoubleOrNothingDetail = (NetworkDoubleOrNothingDetail) other;
        return Intrinsics.g(this.sourceBetId, networkDoubleOrNothingDetail.sourceBetId) && this.sourceBetWinningAmount == networkDoubleOrNothingDetail.sourceBetWinningAmount && this.maxRounds == networkDoubleOrNothingDetail.maxRounds && Double.compare(this.odds, networkDoubleOrNothingDetail.odds) == 0 && this.totalReturn == networkDoubleOrNothingDetail.totalReturn && this.createTime == networkDoubleOrNothingDetail.createTime && Intrinsics.g(this.rounds, networkDoubleOrNothingDetail.rounds);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getMaxRounds() {
        return this.maxRounds;
    }

    public final double getOdds() {
        return this.odds;
    }

    public final List<NetworkDoubleOrNothingDetailRound> getRounds() {
        return this.rounds;
    }

    public final String getSourceBetId() {
        return this.sourceBetId;
    }

    public final long getSourceBetWinningAmount() {
        return this.sourceBetWinningAmount;
    }

    public final long getTotalReturn() {
        return this.totalReturn;
    }

    public int hashCode() {
        String str = this.sourceBetId;
        int iA = f87.a(f87.a(nrg0.a(gpp.a(this.maxRounds, f87.a((str == null ? 0 : str.hashCode()) * 31, this.sourceBetWinningAmount, 31), 31), 31, this.odds), this.totalReturn, 31), this.createTime, 31);
        List<NetworkDoubleOrNothingDetailRound> list = this.rounds;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.sourceBetId;
        long j = this.sourceBetWinningAmount;
        int i = this.maxRounds;
        double d = this.odds;
        long j2 = this.totalReturn;
        long j3 = this.createTime;
        List<NetworkDoubleOrNothingDetailRound> list = this.rounds;
        StringBuilder sbA = x.a(j, "NetworkDoubleOrNothingDetail(sourceBetId=", str, ", sourceBetWinningAmount=");
        sbA.append(", maxRounds=");
        sbA.append(i);
        sbA.append(", odds=");
        sbA.append(d);
        g41.a(j2, ", totalReturn=", ", createTime=", sbA);
        sbA.append(j3);
        sbA.append(", rounds=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.sourceBetId);
        dest.writeLong(this.sourceBetWinningAmount);
        dest.writeInt(this.maxRounds);
        dest.writeDouble(this.odds);
        dest.writeLong(this.totalReturn);
        dest.writeLong(this.createTime);
        List<NetworkDoubleOrNothingDetailRound> list = this.rounds;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<NetworkDoubleOrNothingDetailRound> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
