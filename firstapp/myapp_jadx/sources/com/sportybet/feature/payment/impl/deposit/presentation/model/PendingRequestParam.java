package com.sportybet.feature.payment.impl.deposit.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ew7;
import defpackage.f78;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/presentation/model/PendingRequestParam;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PendingRequestParam implements Parcelable {
    public static final Parcelable.Creator<PendingRequestParam> CREATOR = new a();
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;

    public static final class a implements Parcelable.Creator<PendingRequestParam> {
        @Override // android.os.Parcelable.Creator
        public final PendingRequestParam createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PendingRequestParam(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PendingRequestParam[] newArray(int i) {
            return new PendingRequestParam[i];
        }
    }

    public PendingRequestParam(String str, Integer num, Integer num2, String str2) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingRequestParam)) {
            return false;
        }
        PendingRequestParam pendingRequestParam = (PendingRequestParam) obj;
        return Intrinsics.g(this.a, pendingRequestParam.a) && Intrinsics.g(this.b, pendingRequestParam.b) && Intrinsics.g(this.c, pendingRequestParam.c) && Intrinsics.g(this.d, pendingRequestParam.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ew7.a(this.b, "PendingRequestParam(tradeId=", this.a, ", payChId=", ", bankId=");
        sbA.append(this.c);
        sbA.append(", mobileOperatorName=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f78.c(parcel, 1, num);
        }
        Integer num2 = this.c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f78.c(parcel, 1, num2);
        }
        parcel.writeString(this.d);
    }
}
