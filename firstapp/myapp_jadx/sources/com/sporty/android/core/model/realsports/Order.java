package com.sporty.android.core.model.realsports;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.patron.ReachedLimit;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckDto;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Order implements Comparable, Parcelable, LiabilityCheckResultDto {
    public static final Parcelable.Creator<Order> CREATOR = new Parcelable.Creator<Order>() { // from class: com.sporty.android.core.model.realsports.Order.1
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
    public Boolean allSelectionsAreFootball;
    public Boolean allowMultiMaker;
    public Long balance;
    public String betType;
    public String bookingCode;
    public String combinations;
    public int correctEvents;
    public long createTime;
    public String cutbetWinningAmount = "";
    public String exciseTax;
    public Favor favor;
    public String favorAmount;
    public int favorType;
    public long longPotWinning;
    public String maxPTWin;
    public String maxWHTax;
    public String orderId;
    public String paymentAmount;
    public String periodNumber;
    public String potentialWinnings;
    public List<ReachedLimit> reachedLimits;
    public List<LiabilityCheckDto> rejectedSelections;
    public String shareCode;
    public String shortId;
    public int status;
    public String totalBonus;
    public String totalStake;
    public String totalWinnings;
    public Integer type;
    public int winningStatus;

    public Order(Parcel parcel) {
        this.orderId = parcel.readString();
        this.totalStake = parcel.readString();
        this.totalWinnings = parcel.readString();
        this.totalBonus = parcel.readString();
        this.potentialWinnings = parcel.readString();
        this.longPotWinning = parcel.readLong();
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
        this.exciseTax = parcel.readString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof Order)) {
            return -2;
        }
        long j = this.createTime;
        long j2 = ((Order) obj).createTime;
        if (j < j2) {
            return 1;
        }
        return j == j2 ? 0 : -1;
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

    @Override // com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto
    public Boolean getAllSelectionsAreFootball() {
        return this.allSelectionsAreFootball;
    }

    @Override // com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto
    public Boolean getAllowMultiMaker() {
        return this.allowMultiMaker;
    }

    @Override // com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto
    public String getBookingCode() {
        return this.bookingCode;
    }

    @Override // com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto
    public List<LiabilityCheckDto> getRejectedSelections() {
        return this.rejectedSelections;
    }

    @Override // com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto
    public Integer getTypeId() {
        return this.type;
    }

    public int hashCode() {
        return this.orderId.hashCode();
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
        parcel.writeString(this.exciseTax);
    }

    public Order() {
    }
}
