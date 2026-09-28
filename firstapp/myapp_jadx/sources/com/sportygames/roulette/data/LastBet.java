package com.sportygames.roulette.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class LastBet implements Parcelable {
    public static final Parcelable.Creator<LastBet> CREATOR = new Parcelable.Creator<LastBet>() { // from class: com.sportygames.roulette.data.LastBet.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LastBet createFromParcel(Parcel parcel) {
            return new LastBet(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LastBet[] newArray(int i) {
            return new LastBet[i];
        }
    };
    public Map<String, Long> betInfoDetail;
    public String result;
    public String stake;
    public int status;

    public LastBet(Parcel parcel) {
        this.stake = parcel.readString();
        this.result = parcel.readString();
        this.status = parcel.readInt();
        int i = parcel.readInt();
        this.betInfoDetail = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.betInfoDetail.put(parcel.readString(), (Long) parcel.readValue(Long.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.stake);
        parcel.writeString(this.result);
        parcel.writeInt(this.status);
        parcel.writeInt(this.betInfoDetail.size());
        for (Map.Entry<String, Long> entry : this.betInfoDetail.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }

    public LastBet() {
    }
}
