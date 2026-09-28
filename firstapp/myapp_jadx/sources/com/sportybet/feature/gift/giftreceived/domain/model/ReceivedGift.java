package com.sportybet.feature.gift.giftreceived.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.core.domain.model.ApplicableCategoryIds;
import defpackage.awk;
import defpackage.gmf0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/gift/giftreceived/domain/model/ReceivedGift;", "Landroid/os/Parcelable;", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ReceivedGift implements Parcelable {
    public static final Parcelable.Creator<ReceivedGift> CREATOR = new a();
    public final String a;
    public final String b;
    public final awk c;
    public final List<? extends Integer> d;

    public static final class a implements Parcelable.Creator<ReceivedGift> {
        @Override // android.os.Parcelable.Creator
        public final ReceivedGift createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ReceivedGift(parcel.readString(), parcel.readString(), awk.valueOf(parcel.readString()), ((ApplicableCategoryIds) parcel.readParcelable(ReceivedGift.class.getClassLoader())).a);
        }

        @Override // android.os.Parcelable.Creator
        public final ReceivedGift[] newArray(int i) {
            return new ReceivedGift[i];
        }
    }

    public ReceivedGift(String str, String str2, awk awkVar, List<? extends Integer> list) {
        str.getClass();
        str2.getClass();
        awkVar.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = awkVar;
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
        if (!(obj instanceof ReceivedGift)) {
            return false;
        }
        ReceivedGift receivedGift = (ReceivedGift) obj;
        if (!Intrinsics.g(this.a, receivedGift.a) || !Intrinsics.g(this.b, receivedGift.b) || this.c != receivedGift.c) {
            return false;
        }
        List<? extends Integer> list = receivedGift.d;
        Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
        return Intrinsics.g(this.d, list);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
        return this.d.hashCode() + iHashCode;
    }

    public final String toString() {
        String strE = ApplicableCategoryIds.e(this.d);
        StringBuilder sbA = ux5.a("ReceivedGift(currencyCode=", this.a, ", amount=", this.b, ", giftType=");
        sbA.append(this.c);
        sbA.append(", applicableCategoryIds=");
        sbA.append(strE);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        parcel.writeParcelable(new ApplicableCategoryIds(this.d), i);
    }
}
