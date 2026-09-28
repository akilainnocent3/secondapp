package com.sportygames.sportyherov2.remote.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ry4;
import defpackage.s27;
import defpackage.ux5;
import defpackage.vnk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012Jn\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001d¨\u00065"}, d2 = {"Lcom/sportygames/sportyherov2/remote/models/TopWinResponseV2;", "Landroid/os/Parcelable;", "nickName", "", "avatar", "stakeAmount", "", "payoutAmount", "cashoutCoefficient", "payoutOrCoefficient", "timeRange", "houseCoefficient", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getNickName", "()Ljava/lang/String;", "getAvatar", "getStakeAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPayoutAmount", "getCashoutCoefficient", "getPayoutOrCoefficient", "setPayoutOrCoefficient", "(Ljava/lang/String;)V", "getTimeRange", "setTimeRange", "getHouseCoefficient", "setHouseCoefficient", "(Ljava/lang/Double;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/sportygames/sportyherov2/remote/models/TopWinResponseV2;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopWinResponseV2 implements Parcelable {
    private final String avatar;
    private final Double cashoutCoefficient;
    private Double houseCoefficient;
    private final String nickName;
    private final Double payoutAmount;
    private String payoutOrCoefficient;
    private final Double stakeAmount;
    private String timeRange;
    public static final Parcelable.Creator<TopWinResponseV2> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TopWinResponseV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopWinResponseV2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new TopWinResponseV2(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopWinResponseV2[] newArray(int i) {
            return new TopWinResponseV2[i];
        }
    }

    public TopWinResponseV2(String str, String str2, Double d, Double d2, Double d3, String str3, String str4, Double d4) {
        this.nickName = str;
        this.avatar = str2;
        this.stakeAmount = d;
        this.payoutAmount = d2;
        this.cashoutCoefficient = d3;
        this.payoutOrCoefficient = str3;
        this.timeRange = str4;
        this.houseCoefficient = d4;
    }

    public static /* synthetic */ TopWinResponseV2 copy$default(TopWinResponseV2 topWinResponseV2, String str, String str2, Double d, Double d2, Double d3, String str3, String str4, Double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topWinResponseV2.nickName;
        }
        if ((i & 2) != 0) {
            str2 = topWinResponseV2.avatar;
        }
        if ((i & 4) != 0) {
            d = topWinResponseV2.stakeAmount;
        }
        if ((i & 8) != 0) {
            d2 = topWinResponseV2.payoutAmount;
        }
        if ((i & 16) != 0) {
            d3 = topWinResponseV2.cashoutCoefficient;
        }
        if ((i & 32) != 0) {
            str3 = topWinResponseV2.payoutOrCoefficient;
        }
        if ((i & 64) != 0) {
            str4 = topWinResponseV2.timeRange;
        }
        if ((i & 128) != 0) {
            d4 = topWinResponseV2.houseCoefficient;
        }
        String str5 = str4;
        Double d5 = d4;
        Double d6 = d3;
        String str6 = str3;
        return topWinResponseV2.copy(str, str2, d, d2, d6, str6, str5, d5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPayoutOrCoefficient() {
        return this.payoutOrCoefficient;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTimeRange() {
        return this.timeRange;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    public final TopWinResponseV2 copy(String nickName, String avatar, Double stakeAmount, Double payoutAmount, Double cashoutCoefficient, String payoutOrCoefficient, String timeRange, Double houseCoefficient) {
        return new TopWinResponseV2(nickName, avatar, stakeAmount, payoutAmount, cashoutCoefficient, payoutOrCoefficient, timeRange, houseCoefficient);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopWinResponseV2)) {
            return false;
        }
        TopWinResponseV2 topWinResponseV2 = (TopWinResponseV2) other;
        return Intrinsics.g(this.nickName, topWinResponseV2.nickName) && Intrinsics.g(this.avatar, topWinResponseV2.avatar) && Intrinsics.g(this.stakeAmount, topWinResponseV2.stakeAmount) && Intrinsics.g(this.payoutAmount, topWinResponseV2.payoutAmount) && Intrinsics.g(this.cashoutCoefficient, topWinResponseV2.cashoutCoefficient) && Intrinsics.g(this.payoutOrCoefficient, topWinResponseV2.payoutOrCoefficient) && Intrinsics.g(this.timeRange, topWinResponseV2.timeRange) && Intrinsics.g(this.houseCoefficient, topWinResponseV2.houseCoefficient);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final Double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final Double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final String getPayoutOrCoefficient() {
        return this.payoutOrCoefficient;
    }

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getTimeRange() {
        return this.timeRange;
    }

    public int hashCode() {
        String str = this.nickName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.stakeAmount;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.payoutAmount;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.cashoutCoefficient;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str3 = this.payoutOrCoefficient;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.timeRange;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d4 = this.houseCoefficient;
        return iHashCode7 + (d4 != null ? d4.hashCode() : 0);
    }

    public final void setHouseCoefficient(Double d) {
        this.houseCoefficient = d;
    }

    public final void setPayoutOrCoefficient(String str) {
        this.payoutOrCoefficient = str;
    }

    public final void setTimeRange(String str) {
        this.timeRange = str;
    }

    public String toString() {
        String str = this.nickName;
        String str2 = this.avatar;
        Double d = this.stakeAmount;
        Double d2 = this.payoutAmount;
        Double d3 = this.cashoutCoefficient;
        String str3 = this.payoutOrCoefficient;
        String str4 = this.timeRange;
        Double d4 = this.houseCoefficient;
        StringBuilder sbA = ux5.a("TopWinResponseV2(nickName=", str, ", avatar=", str2, ", stakeAmount=");
        s27.a(d, d2, ", payoutAmount=", ", cashoutCoefficient=", sbA);
        ry4.a(d3, ", payoutOrCoefficient=", str3, ", timeRange=", sbA);
        sbA.append(str4);
        sbA.append(", houseCoefficient=");
        sbA.append(d4);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.nickName);
        dest.writeString(this.avatar);
        Double d = this.stakeAmount;
        if (d == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d);
        }
        Double d2 = this.payoutAmount;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d2);
        }
        Double d3 = this.cashoutCoefficient;
        if (d3 == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d3);
        }
        dest.writeString(this.payoutOrCoefficient);
        dest.writeString(this.timeRange);
        Double d4 = this.houseCoefficient;
        if (d4 == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d4);
        }
    }
}
