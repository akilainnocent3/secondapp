package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.o8i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Sport implements Parcelable {
    public static final Parcelable.Creator<Sport> CREATOR = new Parcelable.Creator<Sport>() { // from class: com.sportybet.plugin.realsports.data.Sport.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Sport createFromParcel(Parcel parcel) {
            return new Sport(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Sport[] newArray(int i) {
            return new Sport[i];
        }
    };
    public static final String UNKNOWN = "unknown";
    public List<Categories> categories;
    public Category category;
    public int eventSize;
    public String id;
    public String name;

    public Sport(Parcel parcel) {
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.category = (Category) parcel.readParcelable(Category.class.getClassLoader());
        this.eventSize = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.categories = arrayList;
        parcel.readList(arrayList, Categories.class.getClassLoader());
    }

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
            String str2 = ((Sport) obj).id;
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

    public boolean isValid() {
        return !TextUtils.isEmpty(this.id);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Sport{id='");
        sb.append(this.id);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', category=");
        sb.append(this.category);
        sb.append(", eventSize=");
        sb.append(this.eventSize);
        sb.append(", categories=");
        return o8i.a(sb, this.categories, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.category, i);
        parcel.writeInt(this.eventSize);
        parcel.writeList(this.categories);
    }

    public Sport() {
    }
}
