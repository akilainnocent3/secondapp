package com.sportybet.android.instantwin.newtork.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.utils.TP.sgwpmp;
import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import defpackage.em5;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.p200;
import defpackage.pr0;
import defpackage.ux5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u009b\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0006\u0010+\u001a\u00020\rJ\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0083\u0004J\n\u00100\u001a\u00020\rHÖ\u0081\u0004J\n\u00101\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\rR&\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0002¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0004¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0005¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0006¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\b¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\t¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\n¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u001aR%\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR,\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000f¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0016\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0013¢\u0006\u0002\n\u0000Ê\u0001\u0002\b8Ê\u0001\f\b9\u0012\b\b:\u0012\u0004\b\u0003\u0010\u0002¨\u00067"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/TicketInRound;", "Landroid/os/Parcelable;", "ticketId", "", "ticketNumber", "type", "totalStake", "", "totalReturn", "wht", "giftId", "giftAmount", "giftKind", "", "createTime", "bets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/Bet;", "flexibleFitSize", "totalOdds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JIJLjava/util/List;ILjava/lang/String;)V", "Lkotlin/jvm/JvmField;", "Lcom/google/gson/annotations/SerializedName;", "value", "getGiftKind$annotations", "()V", "getCreateTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TicketInRound implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TicketInRound> CREATOR = new Creator();

    @SerializedName("bets")
    public final List<Bet> bets;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("flexibleFitSize")
    public final int flexibleFitSize;

    @SerializedName("giftAmount")
    public final long giftAmount;

    @SerializedName("giftId")
    public final String giftId;

    @SerializedName("giftKind")
    public final int giftKind;

    @SerializedName("ticketId")
    public final String ticketId;

    @SerializedName("ticketNumber")
    public final String ticketNumber;

    @SerializedName("totalOdds")
    public final String totalOdds;

    @SerializedName("totalReturn")
    public final long totalReturn;

    @SerializedName("totalStake")
    public final long totalStake;

    @SerializedName("type")
    public final String type;

    @SerializedName("wht")
    public final long wht;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TicketInRound> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketInRound createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            String string4 = parcel.readString();
            long j4 = parcel.readLong();
            int i = parcel.readInt();
            long j5 = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = p200.a(Bet.CREATOR, parcel, arrayList2, iA, 1);
                    i2 = i2;
                    string3 = string3;
                    j = j;
                }
                arrayList = arrayList2;
                string2 = string2;
            }
            return new TicketInRound(string, string2, string3, j, j2, j3, string4, j4, i, j5, arrayList, parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketInRound[] newArray(int i) {
            return new TicketInRound[i];
        }
    }

    public TicketInRound(String str, String str2, String str3, long j, long j2, long j3, String str4, long j4, int i, long j5, List<Bet> list, int i2, String str5) {
        str5.getClass();
        this.ticketId = str;
        this.ticketNumber = str2;
        this.type = str3;
        this.totalStake = j;
        this.totalReturn = j2;
        this.wht = j3;
        this.giftId = str4;
        this.giftAmount = j4;
        this.giftKind = i;
        this.createTime = j5;
        this.bets = list;
        this.flexibleFitSize = i2;
        this.totalOdds = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketInRound copy$default(TicketInRound ticketInRound, String str, String str2, String str3, long j, long j2, long j3, String str4, long j4, int i, long j5, List list, int i2, String str5, int i3, Object obj) {
        String str6 = (i3 & 1) != 0 ? ticketInRound.ticketId : str;
        String str7 = (i3 & 2) != 0 ? ticketInRound.ticketNumber : str2;
        return ticketInRound.copy(str6, str7, (i3 & 4) != 0 ? ticketInRound.type : str3, (i3 & 8) != 0 ? ticketInRound.totalStake : j, (i3 & 16) != 0 ? ticketInRound.totalReturn : j2, (i3 & 32) != 0 ? ticketInRound.wht : j3, (i3 & 64) != 0 ? ticketInRound.giftId : str4, (i3 & 128) != 0 ? ticketInRound.giftAmount : j4, (i3 & 256) != 0 ? ticketInRound.giftKind : i, (i3 & 512) != 0 ? ticketInRound.createTime : j5, (i3 & 1024) != 0 ? ticketInRound.bets : list, (i3 & 2048) != 0 ? ticketInRound.flexibleFitSize : i2, (i3 & 4096) != 0 ? ticketInRound.totalOdds : str5);
    }

    public static /* synthetic */ void getGiftKind$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<Bet> component11() {
        return this.bets;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getFlexibleFitSize() {
        return this.flexibleFitSize;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTotalOdds() {
        return this.totalOdds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTicketNumber() {
        return this.ticketNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalStake() {
        return this.totalStake;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTotalReturn() {
        return this.totalReturn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getWht() {
        return this.wht;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getGiftKind() {
        return this.giftKind;
    }

    public final TicketInRound copy(String ticketId, String ticketNumber, String type, long totalStake, long totalReturn, long wht, String giftId, long giftAmount, int giftKind, long createTime, List<Bet> bets, int flexibleFitSize, String totalOdds) {
        totalOdds.getClass();
        return new TicketInRound(ticketId, ticketNumber, type, totalStake, totalReturn, wht, giftId, giftAmount, giftKind, createTime, bets, flexibleFitSize, totalOdds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketInRound)) {
            return false;
        }
        TicketInRound ticketInRound = (TicketInRound) other;
        return Intrinsics.g(this.ticketId, ticketInRound.ticketId) && Intrinsics.g(this.ticketNumber, ticketInRound.ticketNumber) && Intrinsics.g(this.type, ticketInRound.type) && this.totalStake == ticketInRound.totalStake && this.totalReturn == ticketInRound.totalReturn && this.wht == ticketInRound.wht && Intrinsics.g(this.giftId, ticketInRound.giftId) && this.giftAmount == ticketInRound.giftAmount && this.giftKind == ticketInRound.giftKind && this.createTime == ticketInRound.createTime && Intrinsics.g(this.bets, ticketInRound.bets) && this.flexibleFitSize == ticketInRound.flexibleFitSize && Intrinsics.g(this.totalOdds, ticketInRound.totalOdds);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public int hashCode() {
        String str = this.ticketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ticketNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iA = f87.a(f87.a(f87.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.totalStake, 31), this.totalReturn, 31), this.wht, 31);
        String str4 = this.giftId;
        int iA2 = f87.a(gpp.a(this.giftKind, f87.a((iA + (str4 == null ? 0 : str4.hashCode())) * 31, this.giftAmount, 31), 31), this.createTime, 31);
        List<Bet> list = this.bets;
        return this.totalOdds.hashCode() + gpp.a(this.flexibleFitSize, (iA2 + (list != null ? list.hashCode() : 0)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.ticketId);
        dest.writeString(this.ticketNumber);
        dest.writeString(this.type);
        dest.writeLong(this.totalStake);
        dest.writeLong(this.totalReturn);
        dest.writeLong(this.wht);
        dest.writeString(this.giftId);
        dest.writeLong(this.giftAmount);
        dest.writeInt(this.giftKind);
        dest.writeLong(this.createTime);
        List<Bet> list = this.bets;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Bet> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.flexibleFitSize);
        dest.writeString(this.totalOdds);
    }

    public String toString() {
        String str = this.ticketId;
        String str2 = this.ticketNumber;
        String str3 = this.type;
        long j = this.totalStake;
        long j2 = this.totalReturn;
        long j3 = this.wht;
        String str4 = this.giftId;
        long j4 = this.giftAmount;
        int i = this.giftKind;
        long j5 = this.createTime;
        List<Bet> list = this.bets;
        int i2 = this.flexibleFitSize;
        String str5 = this.totalOdds;
        StringBuilder sbA = ux5.a("TicketInRound(ticketId=", str, ", ticketNumber=", str2, ", type=");
        l.a(j, str3, ", totalStake=", sbA);
        g41.a(j2, ", totalReturn=", ", wht=", sbA);
        em5.a(j3, ", giftId=", str4, sbA);
        g41.a(j4, ", giftAmount=", ", giftKind=", sbA);
        sbA.append(i);
        sbA.append(", createTime=");
        sbA.append(j5);
        sbA.append(", bets=");
        sbA.append(list);
        sbA.append(", flexibleFitSize=");
        sbA.append(i2);
        return pr0.a(sbA, sgwpmp.uUkJDttZWtYbSG, str5, ")");
    }
}
