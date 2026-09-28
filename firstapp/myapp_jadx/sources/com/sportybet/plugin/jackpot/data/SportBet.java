package com.sportybet.plugin.jackpot.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SportBet implements Parcelable {
    public static final Parcelable.Creator<SportBet> CREATOR = new Parcelable.Creator<SportBet>() { // from class: com.sportybet.plugin.jackpot.data.SportBet.1
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
    public List<Gift> entityList;
    public List<Gift> gifts;
    public List<Order> orders;
    public List<Transaction> statements;
    public int totalNum;
    public int type;

    public SportBet(Parcel parcel) {
        this.totalNum = parcel.readInt();
        this.orders = parcel.createTypedArrayList(Order.CREATOR);
        this.statements = parcel.createTypedArrayList(Transaction.CREATOR);
        ArrayList arrayList = new ArrayList();
        this.entityList = arrayList;
        parcel.readList(arrayList, Gift.class.getClassLoader());
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
    }

    public SportBet() {
    }
}
