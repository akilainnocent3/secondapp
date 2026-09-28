package com.sportybet.plugin.jackpot.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class Transaction implements Parcelable {
    public static final Parcelable.Creator<Transaction> CREATOR = new Parcelable.Creator<Transaction>() { // from class: com.sportybet.plugin.jackpot.data.Transaction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Transaction createFromParcel(Parcel parcel) {
            return new Transaction(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Transaction[] newArray(int i) {
            return new Transaction[i];
        }
    };
    public long afterBal;
    public long amount;
    public int amountSign;
    public String amount_refine;
    public int bizType;
    public String comment;
    public String counterAuthority;
    public String counterIconUrl;
    public String counterpart;
    public long createTime;
    public String createTime_refine;
    public String currency;
    public long feeAmount;
    public int feeType;
    public long initAmount;
    public String orderId;
    public int payChId;
    public String payChTxId;
    public long payFinishTime;
    public String payorName;
    public String reason;
    public int status;
    public String status_refine;
    public int subBizType;
    public String tradeCode;
    public String tradeId;
    public String trade_offline;
    public boolean trade_partner;
    public String trade_refine;
    public boolean trade_rollback;

    public Transaction(Parcel parcel) {
        this.createTime = parcel.readLong();
        this.bizType = parcel.readInt();
        this.subBizType = parcel.readInt();
        this.tradeCode = parcel.readString();
        this.payChTxId = parcel.readString();
        this.orderId = parcel.readString();
        this.amount = parcel.readLong();
        this.amountSign = parcel.readInt();
        this.feeAmount = parcel.readLong();
        this.initAmount = parcel.readLong();
        this.status = parcel.readInt();
        this.afterBal = parcel.readLong();
        this.currency = parcel.readString();
        this.payChId = parcel.readInt();
        this.feeType = parcel.readInt();
        this.payFinishTime = parcel.readLong();
        this.tradeId = parcel.readString();
        this.reason = parcel.readString();
        this.counterpart = parcel.readString();
        this.counterAuthority = parcel.readString();
        this.status_refine = parcel.readString();
        this.payorName = parcel.readString();
        this.amount_refine = parcel.readString();
        this.createTime_refine = parcel.readString();
        this.trade_refine = parcel.readString();
        this.trade_offline = parcel.readString();
        this.trade_partner = parcel.readByte() != 0;
        this.trade_rollback = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.createTime);
        parcel.writeInt(this.bizType);
        parcel.writeInt(this.subBizType);
        parcel.writeString(this.tradeCode);
        parcel.writeString(this.payChTxId);
        parcel.writeString(this.orderId);
        parcel.writeLong(this.amount);
        parcel.writeInt(this.amountSign);
        parcel.writeLong(this.feeAmount);
        parcel.writeLong(this.initAmount);
        parcel.writeInt(this.status);
        parcel.writeLong(this.afterBal);
        parcel.writeString(this.currency);
        parcel.writeInt(this.payChId);
        parcel.writeInt(this.feeType);
        parcel.writeLong(this.payFinishTime);
        parcel.writeString(this.tradeId);
        parcel.writeString(this.reason);
        parcel.writeString(this.counterpart);
        parcel.writeString(this.counterAuthority);
        parcel.writeString(this.status_refine);
        parcel.writeString(this.payorName);
        parcel.writeString(this.amount_refine);
        parcel.writeString(this.createTime_refine);
        parcel.writeString(this.trade_refine);
        parcel.writeString(this.trade_offline);
        parcel.writeByte(this.trade_partner ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.trade_rollback ? (byte) 1 : (byte) 0);
    }

    public Transaction() {
    }
}
