package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.rr1;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Tournament implements Parcelable {
    public static final Parcelable.Creator<Tournament> CREATOR = new Parcelable.Creator<Tournament>() { // from class: com.sportybet.plugin.realsports.data.Tournament.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Tournament createFromParcel(Parcel parcel) {
            return new Tournament(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Tournament[] newArray(int i) {
            return new Tournament[i];
        }
    };
    public static final String UNKNOWN = "unknown";
    public String categoryId;
    public String categoryName;
    public int eventSize;
    public List<Event> events;
    public String id;
    public String name;
    public long score;
    public boolean showViewAll;

    public Tournament(Parcel parcel) {
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.score = parcel.readLong();
        this.categoryId = parcel.readString();
        this.categoryName = parcel.readString();
        this.events = parcel.createTypedArrayList(Event.CREATOR);
        this.showViewAll = parcel.readByte() != 0;
        this.eventSize = parcel.readInt();
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
        return TextUtils.equals(this.id, ((Tournament) obj).id);
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Tournament{id='");
        sb.append(this.id);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', score=");
        sb.append(this.score);
        sb.append(", categoryId='");
        sb.append(this.categoryId);
        sb.append("', categoryName='");
        sb.append(this.categoryName);
        sb.append("', events=");
        sb.append(this.events);
        sb.append(", showViewAll=");
        sb.append(this.showViewAll);
        sb.append(", eventSize=");
        return rr1.b(sb, this.eventSize, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeLong(this.score);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.categoryName);
        parcel.writeTypedList(this.events);
        parcel.writeByte(this.showViewAll ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.eventSize);
    }

    public Tournament() {
    }
}
