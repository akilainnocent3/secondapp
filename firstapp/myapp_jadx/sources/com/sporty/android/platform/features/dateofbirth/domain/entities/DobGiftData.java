package com.sporty.android.platform.features.dateofbirth.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.t160;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/dateofbirth/domain/entities/DobGiftData;", "Landroid/os/Parcelable;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DobGiftData implements Parcelable {
    public static final Parcelable.Creator<DobGiftData> CREATOR = new a();
    public final boolean a;
    public final String b;
    public final long c;
    public final List<Integer> d;

    public static final class a implements Parcelable.Creator<DobGiftData> {
        @Override // android.os.Parcelable.Creator
        public final DobGiftData createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new DobGiftData(z, string, j, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DobGiftData[] newArray(int i) {
            return new DobGiftData[i];
        }
    }

    public DobGiftData() {
        this(true, "NGN", 888L, b.k(0, 1, 114));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DobGiftData)) {
            return false;
        }
        DobGiftData dobGiftData = (DobGiftData) obj;
        return this.a == dobGiftData.a && Intrinsics.g(this.b, dobGiftData.b) && this.c == dobGiftData.c && Intrinsics.g(this.d, dobGiftData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f87.a(gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("DobGiftData(isDobVerifiedGift=", ", currencyCode=", this.b, ", amount=", this.a);
        sbA.append(this.c);
        sbA.append(", bizTypeScope=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        List<Integer> list = this.d;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }

    public DobGiftData(boolean z, String str, long j, List<Integer> list) {
        str.getClass();
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = j;
        this.d = list;
    }
}
