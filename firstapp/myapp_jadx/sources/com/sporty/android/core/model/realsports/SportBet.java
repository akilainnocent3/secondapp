package com.sporty.android.core.model.realsports;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SportBet implements Parcelable {
    public static final Parcelable.Creator<SportBet> CREATOR = new Parcelable.Creator<SportBet>() { // from class: com.sporty.android.core.model.realsports.SportBet.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportBet createFromParcel(Parcel parcel) {
            return new SportBet(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportBet[] newArray(int i) {
            return new SportBet[i];
        }
    };
    public List<GiftDetails> entityList;
    public List<GiftDetails> gifts;
    public boolean hasPending;
    public List<Order> orders;
    public boolean showFixStatus;
    public List<Transaction> statements;
    public int totalNum;
    public int type;

    public SportBet(Parcel parcel) {
        this.entityList = new ArrayList();
        this.totalNum = parcel.readInt();
        this.orders = parcel.createTypedArrayList(Order.CREATOR);
        this.statements = parcel.createTypedArrayList(Transaction.CREATOR);
        this.entityList = new ArrayList();
        this.showFixStatus = parcel.readByte() != 0;
        this.hasPending = parcel.readByte() != 0;
        parcel.readList(this.entityList, GiftDetails.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalNum);
        parcel.writeTypedList(this.orders);
        parcel.writeTypedList(this.statements);
        parcel.writeList(this.entityList);
        parcel.writeByte(this.showFixStatus ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasPending ? (byte) 1 : (byte) 0);
    }

    public SportBet() {
        this.entityList = new ArrayList();
    }
}
