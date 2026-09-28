package com.sportybet.android.instantwin.newtork.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingDetail;
import defpackage.f87;
import defpackage.g41;
import defpackage.geo;
import defpackage.mtg0;
import defpackage.p200;
import defpackage.ux5;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jq\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0006\u0010$\u001a\u00020\u0017J\u0014\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0017R&\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0002¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0004¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0005¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\b¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\t¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\n¢\u0006\u0002\n\u0000R,\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\f¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000f¢\u0006\u0002\n\u0000Ê\u0001\u0002\b0Ê\u0001\f\b1\u0012\b\b2\u0012\u0004\b\u0003\u0010\u0000¨\u0006/"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/Bet;", "Landroid/os/Parcelable;", "betId", "", "betGroupId", "stake", "", "potWin", "wht", "bonus", "hit", "", "betDetails", "", "Lcom/sportybet/android/instantwin/newtork/model/response/BetDetail;", "donDetail", "Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJJZLjava/util/List;Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingDetail;)V", "Lkotlin/jvm/JvmField;", "Lcom/google/gson/annotations/SerializedName;", "value", "getFolds", "", "getWhTax", "Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Bet implements Parcelable {

    @SerializedName("betDetails")
    public final List<BetDetail> betDetails;

    @SerializedName("betGroupId")
    public final String betGroupId;

    @SerializedName("betId")
    public final String betId;

    @SerializedName("bonus")
    public final long bonus;

    @SerializedName("donDetail")
    public final NetworkDoubleOrNothingDetail donDetail;

    @SerializedName("hit")
    public final boolean hit;

    @SerializedName("potWin")
    public final long potWin;

    @SerializedName("stake")
    public final long stake;

    @SerializedName("wht")
    public final long wht;
    public static final Parcelable.Creator<Bet> CREATOR = new Creator();
    public static final int $stable = NetworkDoubleOrNothingDetail.$stable;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Bet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Bet createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = p200.a(BetDetail.CREATOR, parcel, arrayList, iA, 1);
                    string = string;
                }
            }
            return new Bet(string, string2, j, j2, j3, j4, z, arrayList, parcel.readInt() == 0 ? null : NetworkDoubleOrNothingDetail.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Bet[] newArray(int i) {
            return new Bet[i];
        }
    }

    public Bet(String str, String str2, long j, long j2, long j3, long j4, boolean z, List<BetDetail> list, NetworkDoubleOrNothingDetail networkDoubleOrNothingDetail) {
        this.betId = str;
        this.betGroupId = str2;
        this.stake = j;
        this.potWin = j2;
        this.wht = j3;
        this.bonus = j4;
        this.hit = z;
        this.betDetails = list;
        this.donDetail = networkDoubleOrNothingDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Bet copy$default(Bet bet, String str, String str2, long j, long j2, long j3, long j4, boolean z, List list, NetworkDoubleOrNothingDetail networkDoubleOrNothingDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bet.betId;
        }
        return bet.copy(str, (i & 2) != 0 ? bet.betGroupId : str2, (i & 4) != 0 ? bet.stake : j, (i & 8) != 0 ? bet.potWin : j2, (i & 16) != 0 ? bet.wht : j3, (i & 32) != 0 ? bet.bonus : j4, (i & 64) != 0 ? bet.hit : z, (i & 128) != 0 ? bet.betDetails : list, (i & 256) != 0 ? bet.donDetail : networkDoubleOrNothingDetail);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBetGroupId() {
        return this.betGroupId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStake() {
        return this.stake;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPotWin() {
        return this.potWin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getWht() {
        return this.wht;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getBonus() {
        return this.bonus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHit() {
        return this.hit;
    }

    public final List<BetDetail> component8() {
        return this.betDetails;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final NetworkDoubleOrNothingDetail getDonDetail() {
        return this.donDetail;
    }

    public final Bet copy(String betId, String betGroupId, long stake, long potWin, long wht, long bonus, boolean hit, List<BetDetail> betDetails, NetworkDoubleOrNothingDetail donDetail) {
        return new Bet(betId, betGroupId, stake, potWin, wht, bonus, hit, betDetails, donDetail);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bet)) {
            return false;
        }
        Bet bet = (Bet) other;
        return Intrinsics.g(this.betId, bet.betId) && Intrinsics.g(this.betGroupId, bet.betGroupId) && this.stake == bet.stake && this.potWin == bet.potWin && this.wht == bet.wht && this.bonus == bet.bonus && this.hit == bet.hit && Intrinsics.g(this.betDetails, bet.betDetails) && Intrinsics.g(this.donDetail, bet.donDetail);
    }

    public final int getFolds() {
        List<BetDetail> list = this.betDetails;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final BigDecimal getWhTax() {
        BigDecimal bigDecimalDivide = new BigDecimal(this.wht).divide(geo.a);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public int hashCode() {
        String str = this.betId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.betGroupId;
        int iA = mtg0.a(f87.a(f87.a(f87.a(f87.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.stake, 31), this.potWin, 31), this.wht, 31), this.bonus, 31), 31, this.hit);
        List<BetDetail> list = this.betDetails;
        int iHashCode2 = (iA + (list == null ? 0 : list.hashCode())) * 31;
        NetworkDoubleOrNothingDetail networkDoubleOrNothingDetail = this.donDetail;
        return iHashCode2 + (networkDoubleOrNothingDetail != null ? networkDoubleOrNothingDetail.hashCode() : 0);
    }

    public String toString() {
        String str = this.betId;
        String str2 = this.betGroupId;
        long j = this.stake;
        long j2 = this.potWin;
        long j3 = this.wht;
        long j4 = this.bonus;
        boolean z = this.hit;
        List<BetDetail> list = this.betDetails;
        NetworkDoubleOrNothingDetail networkDoubleOrNothingDetail = this.donDetail;
        StringBuilder sbA = ux5.a("Bet(betId=", str, ", betGroupId=", str2, ", stake=");
        sbA.append(j);
        g41.a(j2, ", potWin=", ", wht=", sbA);
        sbA.append(j3);
        g41.a(j4, ", bonus=", ", hit=", sbA);
        sbA.append(z);
        sbA.append(", betDetails=");
        sbA.append(list);
        sbA.append(", donDetail=");
        sbA.append(networkDoubleOrNothingDetail);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.betId);
        dest.writeString(this.betGroupId);
        dest.writeLong(this.stake);
        dest.writeLong(this.potWin);
        dest.writeLong(this.wht);
        dest.writeLong(this.bonus);
        dest.writeInt(this.hit ? 1 : 0);
        List<BetDetail> list = this.betDetails;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<BetDetail> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        NetworkDoubleOrNothingDetail networkDoubleOrNothingDetail = this.donDetail;
        if (networkDoubleOrNothingDetail == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            networkDoubleOrNothingDetail.writeToParcel(dest, flags);
        }
    }
}
