package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class RTicket implements Parcelable {
    public static final Parcelable.Creator<RTicket> CREATOR = new Parcelable.Creator<RTicket>() { // from class: com.sportybet.plugin.realsports.data.RTicket.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RTicket createFromParcel(Parcel parcel) {
            return new RTicket(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RTicket[] newArray(int i) {
            return new RTicket[i];
        }
    };
    public List<String> betIds;
    public int betSize;
    public String bonusPrize;
    public String cashOutAmount;
    public int combinationSize;
    public long createTime;
    public String currency;
    public int currentMinToWin;
    public int currentSelectionSize;
    public String cutbetRemainingBonusAmount;
    public String cutbetType;
    public String cutbetWinningAmount;
    public String deviceCh;
    public String deviceId;
    public String deviceIp;
    public String favorAmount;
    public int favorType;
    public List<Integer> featureTags;
    public String finalTotalOdds;
    public boolean hasPendingEvent;
    public boolean isAutoBet;
    public boolean isEditable;
    public boolean isHistory;
    public boolean isOneCutWin;
    public boolean isPaymentInProgress;
    public boolean lfbOddsBoosted;
    public int minToWin;
    public boolean oddsBoosted;
    public String orderId;
    public int orderType;
    public int paymentType;
    public int percent;
    public String potentialWinnings;
    public String remainPotentialWinnings;
    public String remainStake;
    public String remainTaxAmount;
    public int selectionSize;
    public List<RSelection> selections;
    public int settleType;
    public String shareCode;
    public String shortId;
    public String taxAmount;
    public String totalBonus;
    public String totalOdds;
    public String totalStake;
    public String totalWinnings;
    public String usedStake;
    public UserNote userNote;
    public String verifyCode;
    public int winningStatus;

    public RTicket(Parcel parcel) {
        this.minToWin = -1;
        this.currentMinToWin = -1;
        this.selectionSize = -1;
        this.currentSelectionSize = -1;
        this.cutbetType = "1";
        this.orderType = parcel.readInt();
        this.shortId = parcel.readString();
        this.orderId = parcel.readString();
        this.totalStake = parcel.readString();
        this.totalWinnings = parcel.readString();
        this.winningStatus = parcel.readInt();
        this.createTime = parcel.readLong();
        this.totalBonus = parcel.readString();
        this.potentialWinnings = parcel.readString();
        this.favorAmount = parcel.readString();
        this.favorType = parcel.readInt();
        this.selections = parcel.createTypedArrayList(RSelection.CREATOR);
        this.cashOutAmount = parcel.readString();
        this.remainStake = parcel.readString();
        this.remainPotentialWinnings = parcel.readString();
        this.betSize = parcel.readInt();
        this.bonusPrize = parcel.readString();
        this.usedStake = parcel.readString();
        this.combinationSize = parcel.readInt();
        this.totalOdds = parcel.readString();
        this.finalTotalOdds = parcel.readString();
        this.shareCode = parcel.readString();
        this.minToWin = parcel.readInt();
        this.currentMinToWin = parcel.readInt();
        this.selectionSize = parcel.readInt();
        this.currentSelectionSize = parcel.readInt();
        this.oddsBoosted = parcel.readByte() != 0;
        this.lfbOddsBoosted = parcel.readByte() != 0;
        this.paymentType = parcel.readInt();
        this.percent = parcel.readInt();
        this.isHistory = parcel.readByte() != 0;
        this.taxAmount = parcel.readString();
        this.remainTaxAmount = parcel.readString();
        this.cutbetRemainingBonusAmount = parcel.readString();
        this.cutbetWinningAmount = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.featureTags = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        this.cutbetType = parcel.readString();
        this.currency = parcel.readString();
        this.verifyCode = parcel.readString();
        this.deviceId = parcel.readString();
        this.deviceCh = parcel.readString();
        this.deviceIp = parcel.readString();
        this.isAutoBet = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean hasBetBuilderSelection() {
        List<RSelection> list = this.selections;
        if (list == null) {
            return false;
        }
        Iterator<RSelection> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isBetBuilder()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasTax() {
        try {
            return (TextUtils.isEmpty(this.taxAmount) || Double.parseDouble(this.taxAmount) == 0.0d) ? false : true;
        } catch (NumberFormatException unused) {
        }
    }

    public boolean isAllSelectionSettled() {
        List<RSelection> list = this.selections;
        if (list == null) {
            return false;
        }
        Iterator<RSelection> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().status == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnyWin() {
        List<Integer> list = this.featureTags;
        return list != null && !list.isEmpty() && this.featureTags.get(0).intValue() == 6 && this.orderType == 2;
    }

    public boolean isFlexBet() {
        return this.orderType == 4;
    }

    public boolean isOneCutBet() {
        List<Integer> list = this.featureTags;
        return (list == null || list.isEmpty() || this.featureTags.get(0).intValue() != 5) ? false : true;
    }

    public boolean isPartialPayout() {
        try {
            return this.orderType == 4 && this.winningStatus == 20 && Double.parseDouble(this.totalWinnings) < Double.parseDouble(this.totalStake);
        } catch (NumberFormatException unused) {
        }
    }

    public void updateUserNote(String str) {
        this.userNote = new UserNote(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.orderType);
        parcel.writeString(this.shortId);
        parcel.writeString(this.orderId);
        parcel.writeString(this.totalStake);
        parcel.writeString(this.totalWinnings);
        parcel.writeInt(this.winningStatus);
        parcel.writeLong(this.createTime);
        parcel.writeString(this.totalBonus);
        parcel.writeString(this.potentialWinnings);
        parcel.writeString(this.favorAmount);
        parcel.writeInt(this.favorType);
        parcel.writeTypedList(this.selections);
        parcel.writeString(this.cashOutAmount);
        parcel.writeString(this.remainStake);
        parcel.writeString(this.remainPotentialWinnings);
        parcel.writeInt(this.betSize);
        parcel.writeString(this.bonusPrize);
        parcel.writeString(this.usedStake);
        parcel.writeInt(this.combinationSize);
        parcel.writeString(this.totalOdds);
        parcel.writeString(this.finalTotalOdds);
        parcel.writeString(this.shareCode);
        parcel.writeInt(this.minToWin);
        parcel.writeInt(this.currentMinToWin);
        parcel.writeInt(this.selectionSize);
        parcel.writeInt(this.currentSelectionSize);
        parcel.writeByte(this.oddsBoosted ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.lfbOddsBoosted ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.paymentType);
        parcel.writeInt(this.percent);
        parcel.writeByte(this.isHistory ? (byte) 1 : (byte) 0);
        parcel.writeString(this.taxAmount);
        parcel.writeString(this.remainTaxAmount);
        parcel.writeString(this.cutbetRemainingBonusAmount);
        parcel.writeString(this.cutbetWinningAmount);
        parcel.writeList(this.featureTags);
        parcel.writeString(this.cutbetType);
        parcel.writeString(this.currency);
        parcel.writeString(this.verifyCode);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.deviceCh);
        parcel.writeString(this.deviceIp);
        parcel.writeByte(this.isAutoBet ? (byte) 1 : (byte) 0);
    }

    public RTicket() {
        this.minToWin = -1;
        this.currentMinToWin = -1;
        this.selectionSize = -1;
        this.currentSelectionSize = -1;
        this.cutbetType = "1";
    }
}
