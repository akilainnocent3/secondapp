package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.avg;
import defpackage.hce0;
import defpackage.kb5;
import defpackage.rr1;
import defpackage.vl8;
import defpackage.xxf0;
import defpackage.yxf0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    public static final Parcelable.Creator<Timestamp> CREATOR = new a();
    public final long a;
    public final int b;

    public static final class a implements Parcelable.Creator<Timestamp> {
        @Override // android.os.Parcelable.Creator
        public final Timestamp createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Timestamp(parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Timestamp[] newArray(int i) {
            return new Timestamp[i];
        }
    }

    public Timestamp(long j, int i) {
        if (i < 0 || i >= 1000000000) {
            kb5.a(hce0.a(i, "Timestamp nanoseconds out of range: "));
            throw null;
        }
        if (-62135596800L > j || j >= 253402300800L) {
            kb5.a(avg.a(j, "Timestamp seconds out of range: "));
            throw null;
        }
        this.a = j;
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Timestamp timestamp) {
        Timestamp timestamp2 = timestamp;
        timestamp2.getClass();
        Function1[] function1Arr = {xxf0.b, yxf0.b};
        for (int i = 0; i < 2; i++) {
            Function1 function1 = function1Arr[i];
            int iB = vl8.b((Comparable) function1.invoke(this), (Comparable) function1.invoke(timestamp2));
            if (iB != 0) {
                return iB;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        int iB;
        if (obj != this) {
            if (obj instanceof Timestamp) {
                Timestamp timestamp = (Timestamp) obj;
                Function1[] function1Arr = {xxf0.b, yxf0.b};
                for (int i = 0; i < 2; i++) {
                    Function1 function1 = function1Arr[i];
                    iB = vl8.b((Comparable) function1.invoke(this), (Comparable) function1.invoke(timestamp));
                    if (iB != 0) {
                        if (iB == 0) {
                        }
                    }
                }
                iB = 0;
                if (iB == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(seconds=");
        sb.append(this.a);
        sb.append(", nanoseconds=");
        return rr1.b(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
    }
}
