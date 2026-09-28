package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Tournaments implements Parcelable {
    public static final Parcelable.Creator<Tournaments> CREATOR = new Parcelable.Creator<Tournaments>() { // from class: com.sportybet.plugin.realsports.data.Tournaments.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Tournaments createFromParcel(Parcel parcel) {
            Tournaments tournaments = new Tournaments();
            tournaments.id = parcel.readString();
            tournaments.name = parcel.readString();
            tournaments.eventSize = parcel.readInt();
            tournaments.categoryName = parcel.readString();
            tournaments.categoryId = parcel.readString();
            return tournaments;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Tournaments[] newArray(int i) {
            return new Tournaments[i];
        }
    };
    public String categoryId;
    public String categoryName;
    public int eventSize;
    public List<Event> events;
    public String id;
    public String name;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.id;
            String str2 = ((Tournaments) obj).id;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.eventSize);
        parcel.writeString(this.categoryName);
        parcel.writeString(this.categoryId);
    }
}
