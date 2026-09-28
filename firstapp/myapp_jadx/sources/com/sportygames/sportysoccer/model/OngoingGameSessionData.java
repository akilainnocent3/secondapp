package com.sportygames.sportysoccer.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.uf80;

/* JADX INFO: loaded from: classes8.dex */
public class OngoingGameSessionData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.sportygames.sportysoccer.model.OngoingGameSessionData.1
        @Override // android.os.Parcelable.Creator
        public OngoingGameSessionData createFromParcel(Parcel parcel) {
            return new OngoingGameSessionData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public OngoingGameSessionData[] newArray(int i) {
            return new OngoingGameSessionData[i];
        }
    };
    private final boolean gameForfeited;
    private final String id;
    private final String userId;

    public OngoingGameSessionData(Parcel parcel) {
        this.id = parcel.readString();
        this.userId = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.gameForfeited = zArr[0];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.id;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isGameForfeited() {
        return this.gameForfeited;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OngoingGameSessionData{gameForfeited=");
        sb.append(this.gameForfeited);
        sb.append(", id='");
        sb.append(this.id);
        sb.append("', userId='");
        return uf80.a(sb, this.userId, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.userId);
        parcel.writeBooleanArray(new boolean[]{this.gameForfeited});
    }

    public OngoingGameSessionData(boolean z, String str, String str2) {
        this.gameForfeited = z;
        this.id = str;
        this.userId = str2;
    }
}
