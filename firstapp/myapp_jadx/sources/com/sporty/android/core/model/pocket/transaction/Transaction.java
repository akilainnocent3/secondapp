package com.sporty.android.core.model.pocket.transaction;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.pay.pix.data.dto.PixQrInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class Transaction implements Parcelable {
    public static final Parcelable.Creator<Transaction> CREATOR = new Parcelable.Creator<Transaction>() { // from class: com.sporty.android.core.model.pocket.transaction.Transaction.1
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
    public TransactionAdditionalInfo additionalInfo;
    public long afterBal;
    public long amount;
    public int amountSign;
    public String amount_refine;
    public String auditStatus;
    public BetStatus betStatus;
    public int bizType;
    public String bizTypeName;
    public String comment;
    public String counterAuthority;
    public String counterFull;
    public String counterIconUrl;
    public String counterpart;
    public long createTime;
    public String createTime_refine;
    public String currency;
    public String eventNumber;
    public long feeAmount;
    public int feeType;
    public String fixStatusMsg;
    public String goodsName;
    public long initAmount;
    public Long initBal;
    public String linkText;
    public String maxOdds;
    public String odds;
    public String orderId;
    public int payAction;
    public int payChId;
    public String payChTxId;
    public long payFinishTime;
    public String payorName;
    public String pick;
    public PixQrInfo pix;
    public String potentialWinnings;
    public String realOrderId;
    public String reason;
    public String recipientPhone;
    public String recipientPhoneCountryCode;
    public Long resultDateTime;
    public RollbackDetail rollbackDetail;
    public String sessionId;
    public boolean showFixStatus;
    public String stake;
    public int status;
    public String status_refine;
    public int subBizType;
    public String subBizTypeName;
    public String supporterPhone;
    public String supporterPhoneCountryCode;
    public long taxAmount;
    public String taxPercentage;
    public String taxType;
    public long taxedAmount;
    public String tradeCode;
    public String tradeId;
    public String trade_offline;
    public boolean trade_partner;
    public String trade_refine;
    public boolean trade_rollback;

    @SerializedName("progressDetailList")
    public ArrayList<TransactionProgressDetail> transactionProgressDetailList;
    public String winnings;

    /* JADX INFO: loaded from: classes4.dex */
    public enum BetStatus {
        RUNNING(0),
        WIN(1),
        LOST(2),
        CANCEL(3);

        private final int value;

        BetStatus(int i) {
            this.value = i;
        }

        public static BetStatus fromInt(int i) {
            for (BetStatus betStatus : values()) {
                if (betStatus.getValue() == i) {
                    return betStatus;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }
    }

    public Transaction(Parcel parcel) {
        this.initBal = null;
        this.createTime = parcel.readLong();
        this.resultDateTime = Long.valueOf(parcel.readLong());
        this.bizType = parcel.readInt();
        this.bizTypeName = parcel.readString();
        this.subBizTypeName = parcel.readString();
        this.subBizType = parcel.readInt();
        this.tradeCode = parcel.readString();
        this.payChTxId = parcel.readString();
        this.orderId = parcel.readString();
        this.realOrderId = parcel.readString();
        this.amount = parcel.readLong();
        this.amountSign = parcel.readInt();
        this.payAction = parcel.readInt();
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
        this.counterFull = parcel.readString();
        this.status_refine = parcel.readString();
        this.payorName = parcel.readString();
        this.amount_refine = parcel.readString();
        this.createTime_refine = parcel.readString();
        this.trade_refine = parcel.readString();
        this.trade_offline = parcel.readString();
        this.trade_partner = parcel.readByte() != 0;
        this.trade_rollback = parcel.readByte() != 0;
        this.recipientPhoneCountryCode = parcel.readString();
        this.recipientPhone = parcel.readString();
        this.supporterPhoneCountryCode = parcel.readString();
        this.supporterPhone = parcel.readString();
        this.sessionId = parcel.readString();
        this.linkText = parcel.readString();
        this.showFixStatus = parcel.readByte() != 0;
        this.fixStatusMsg = parcel.readString();
        this.odds = parcel.readString();
        this.maxOdds = parcel.readString();
        this.eventNumber = parcel.readString();
        this.pick = parcel.readString();
        this.stake = parcel.readString();
        this.betStatus = BetStatus.fromInt(parcel.readInt());
        this.potentialWinnings = parcel.readString();
        this.winnings = parcel.readString();
        this.additionalInfo = (TransactionAdditionalInfo) parcel.readParcelable(TransactionAdditionalInfo.class.getClassLoader());
        this.pix = (PixQrInfo) parcel.readParcelable(PixQrInfo.class.getClassLoader());
        this.initBal = Long.valueOf(parcel.readLong());
        this.taxType = parcel.readString();
        this.taxPercentage = parcel.readString();
        this.taxedAmount = parcel.readLong();
        this.taxAmount = parcel.readLong();
        int i = Build.VERSION.SDK_INT;
        ArrayList<TransactionProgressDetail> arrayList = this.transactionProgressDetailList;
        if (i >= 29) {
            parcel.readParcelableList(arrayList, TransactionProgressDetail.class.getClassLoader());
        } else {
            parcel.readList(arrayList, TransactionProgressDetail.class.getClassLoader());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.createTime);
        parcel.writeLong(this.resultDateTime.longValue());
        parcel.writeInt(this.bizType);
        parcel.writeString(this.bizTypeName);
        parcel.writeString(this.subBizTypeName);
        parcel.writeInt(this.subBizType);
        parcel.writeString(this.tradeCode);
        parcel.writeString(this.payChTxId);
        parcel.writeString(this.orderId);
        parcel.writeString(this.realOrderId);
        parcel.writeLong(this.amount);
        parcel.writeInt(this.amountSign);
        parcel.writeInt(this.payAction);
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
        parcel.writeString(this.counterFull);
        parcel.writeString(this.status_refine);
        parcel.writeString(this.payorName);
        parcel.writeString(this.amount_refine);
        parcel.writeString(this.createTime_refine);
        parcel.writeString(this.trade_refine);
        parcel.writeString(this.trade_offline);
        parcel.writeByte(this.trade_partner ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.trade_rollback ? (byte) 1 : (byte) 0);
        parcel.writeString(this.recipientPhoneCountryCode);
        parcel.writeString(this.recipientPhone);
        parcel.writeString(this.supporterPhoneCountryCode);
        parcel.writeString(this.supporterPhone);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.linkText);
        parcel.writeByte(this.showFixStatus ? (byte) 1 : (byte) 0);
        parcel.writeString(this.fixStatusMsg);
        parcel.writeString(this.odds);
        parcel.writeString(this.maxOdds);
        parcel.writeString(this.eventNumber);
        parcel.writeString(this.pick);
        parcel.writeString(this.stake);
        parcel.writeInt(this.betStatus.value);
        parcel.writeString(this.potentialWinnings);
        parcel.writeString(this.winnings);
        parcel.writeParcelable(this.additionalInfo, i);
        parcel.writeParcelable(this.pix, i);
        parcel.writeLong(this.initBal.longValue());
        parcel.writeString(this.taxType);
        parcel.writeString(this.taxPercentage);
        parcel.writeLong(this.taxedAmount);
        parcel.writeLong(this.taxAmount);
        int i2 = Build.VERSION.SDK_INT;
        ArrayList<TransactionProgressDetail> arrayList = this.transactionProgressDetailList;
        if (i2 >= 29) {
            parcel.writeParcelableList(arrayList, i);
        } else {
            parcel.writeList(arrayList);
        }
    }

    public Transaction() {
        this.initBal = null;
    }
}
