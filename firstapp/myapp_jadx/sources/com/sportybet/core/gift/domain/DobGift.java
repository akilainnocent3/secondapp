package com.sportybet.core.gift.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.core.domain.model.ApplicableCategoryIds;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.nrg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/core/gift/domain/DobGift;", "Landroid/os/Parcelable;", "domain-gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DobGift implements Parcelable {
    public static final Parcelable.Creator<DobGift> CREATOR = new a();
    public final boolean a;
    public final double b;
    public final String c;
    public final List<? extends Integer> d;

    public static final class a implements Parcelable.Creator<DobGift> {
        @Override // android.os.Parcelable.Creator
        public final DobGift createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new DobGift(parcel.readString(), parcel.readInt() != 0, parcel.readDouble(), ((ApplicableCategoryIds) parcel.readParcelable(DobGift.class.getClassLoader())).a);
        }

        @Override // android.os.Parcelable.Creator
        public final DobGift[] newArray(int i) {
            return new DobGift[i];
        }
    }

    public DobGift(String str, boolean z, double d, List list) {
        str.getClass();
        list.getClass();
        this.a = z;
        this.b = d;
        this.c = str;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DobGift)) {
            return false;
        }
        DobGift dobGift = (DobGift) obj;
        if (this.a != dobGift.a || Double.compare(this.b, dobGift.b) != 0 || !Intrinsics.g(this.c, dobGift.c)) {
            return false;
        }
        List<? extends Integer> list = dobGift.d;
        Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
        return Intrinsics.g(this.d, list);
    }

    public final int hashCode() {
        int iA = gmf0.a(nrg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
        return this.d.hashCode() + iA;
    }

    public final String toString() {
        String strE = ApplicableCategoryIds.e(this.d);
        StringBuilder sb = new StringBuilder("DobGift(isDobVerifiedGift=");
        sb.append(this.a);
        sb.append(", amount=");
        sb.append(this.b);
        hxa.c(sb, ", currency=", this.c, ", applicableCategoryIds=", strE);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeDouble(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(new ApplicableCategoryIds(this.d), i);
    }
}
