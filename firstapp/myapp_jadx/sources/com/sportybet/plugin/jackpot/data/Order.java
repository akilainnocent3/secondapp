package com.sportybet.plugin.jackpot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.patron.ReachedLimit;
import defpackage.a8b;
import defpackage.uf80;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Order implements Comparable, Parcelable {
    public static final Parcelable.Creator<Order> CREATOR = new Parcelable.Creator<Order>() { // from class: com.sportybet.plugin.jackpot.data.Order.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Order createFromParcel(Parcel parcel) {
            return new Order(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Order[] newArray(int i) {
            return new Order[i];
        }
    };
    public String betType;
    public List<Bet> bets;
    public String combinations;
    public int correctEvents;
    public long createTime;
    public String currency = a8b.d();
    public Favor favor;
    public String favorAmount;
    public int favorType;
    public String orderId;
    public String paymentAmount;
    public String periodNumber;
    public String potentialWinnings;
    public List<ReachedLimit> reachedLimits;
    public String refundAmount;
    public String shareCode;
    public String shortId;
    public int status;
    public String totalBonus;
    public String totalStake;
    public String totalWinnings;
    public int winningStatus;

    public Order(Parcel parcel) {
        this.orderId = parcel.readString();
        this.totalStake = parcel.readString();
        this.totalWinnings = parcel.readString();
        this.totalBonus = parcel.readString();
        this.potentialWinnings = parcel.readString();
        this.createTime = parcel.readLong();
        this.shortId = parcel.readString();
        this.status = parcel.readInt();
        this.betType = parcel.readString();
        this.correctEvents = parcel.readInt();
        this.periodNumber = parcel.readString();
        this.combinations = parcel.readString();
        this.paymentAmount = parcel.readString();
        this.winningStatus = parcel.readInt();
        this.favorType = parcel.readInt();
        this.favorAmount = parcel.readString();
        this.favor = (Favor) parcel.readParcelable(Favor.class.getClassLoader());
        this.shareCode = parcel.readString();
        this.refundAmount = parcel.readString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof Order) {
            return Long.compare(((Order) obj).createTime, this.createTime);
        }
        return -2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.orderId.equals(((Order) obj).orderId);
    }

    public int hashCode() {
        return this.orderId.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Order{orderId='");
        sb.append(this.orderId);
        sb.append("', totalStake='");
        sb.append(this.totalStake);
        sb.append("', totalWinnings='");
        sb.append(this.totalWinnings);
        sb.append("', totalBonus='");
        sb.append(this.totalBonus);
        sb.append("', potentialWinnings='");
        sb.append(this.potentialWinnings);
        sb.append("', createTime=");
        sb.append(this.createTime);
        sb.append(", shortId='");
        sb.append(this.shortId);
        sb.append("', status=");
        sb.append(this.status);
        sb.append(", betType='");
        sb.append(this.betType);
        sb.append("', correctEvents=");
        sb.append(this.correctEvents);
        sb.append(", periodNumber='");
        sb.append(this.periodNumber);
        sb.append("', combinations='");
        sb.append(this.combinations);
        sb.append("', paymentAmount='");
        sb.append(this.paymentAmount);
        sb.append("', winningStatus=");
        sb.append(this.winningStatus);
        sb.append(", favorType=");
        sb.append(this.favorType);
        sb.append(", favorAmount='");
        sb.append(this.favorAmount);
        sb.append("', favor=");
        sb.append(this.favor);
        sb.append(", shareCode='");
        sb.append(this.shareCode);
        sb.append("', currency='");
        sb.append(this.currency);
        sb.append("', refundAmount='");
        return uf80.a(sb, this.refundAmount, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.orderId);
        parcel.writeString(this.totalStake);
        parcel.writeString(this.totalWinnings);
        parcel.writeString(this.totalBonus);
        parcel.writeString(this.potentialWinnings);
        parcel.writeLong(this.createTime);
        parcel.writeString(this.shortId);
        parcel.writeInt(this.status);
        parcel.writeString(this.betType);
        parcel.writeInt(this.correctEvents);
        parcel.writeString(this.periodNumber);
        parcel.writeString(this.combinations);
        parcel.writeString(this.paymentAmount);
        parcel.writeInt(this.winningStatus);
        parcel.writeInt(this.favorType);
        parcel.writeString(this.favorAmount);
        parcel.writeParcelable(this.favor, i);
        parcel.writeString(this.shareCode);
        parcel.writeString(this.refundAmount);
    }
}
