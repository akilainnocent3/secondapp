package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class Category implements Parcelable {
    public static final Parcelable.Creator<Category> CREATOR = new Parcelable.Creator<Category>() { // from class: com.sportybet.plugin.realsports.data.Category.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Category createFromParcel(Parcel parcel) {
            return new Category(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Category[] newArray(int i) {
            return new Category[i];
        }
    };
    public String id;
    public String name;
    public Tournament tournament;

    public Category(Parcel parcel) {
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.tournament = (Tournament) parcel.readParcelable(Tournament.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.tournament, i);
    }

    public Category() {
    }
}
