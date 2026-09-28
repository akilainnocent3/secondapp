package com.sportybet.feature.payment.impl.tradeadditional.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ew7;
import defpackage.f78;
import defpackage.hxa;
import defpackage.w03;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/payment/impl/tradeadditional/domain/model/TradeAdditionalResult;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TradeAdditionalResult implements Parcelable {
    public static final Parcelable.Creator<TradeAdditionalResult> CREATOR = new a();
    public final String A;
    public final String B;
    public final Integer C;
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final String i;
    public final String v;
    public final String w;
    public final String y;
    public final String z;

    public static final class a implements Parcelable.Creator<TradeAdditionalResult> {
        @Override // android.os.Parcelable.Creator
        public final TradeAdditionalResult createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            Integer num = numValueOf2;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            Integer numValueOf3 = null;
            String string11 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new TradeAdditionalResult(string, numValueOf, num, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final TradeAdditionalResult[] newArray(int i) {
            return new TradeAdditionalResult[i];
        }
    }

    public TradeAdditionalResult(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num3) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.i = str5;
        this.v = str6;
        this.w = str7;
        this.y = str8;
        this.z = str9;
        this.A = str10;
        this.B = str11;
        this.C = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeAdditionalResult)) {
            return false;
        }
        TradeAdditionalResult tradeAdditionalResult = (TradeAdditionalResult) obj;
        return Intrinsics.g(this.a, tradeAdditionalResult.a) && Intrinsics.g(this.b, tradeAdditionalResult.b) && Intrinsics.g(this.c, tradeAdditionalResult.c) && Intrinsics.g(this.d, tradeAdditionalResult.d) && Intrinsics.g(this.e, tradeAdditionalResult.e) && Intrinsics.g(this.f, tradeAdditionalResult.f) && Intrinsics.g(this.i, tradeAdditionalResult.i) && Intrinsics.g(this.v, tradeAdditionalResult.v) && Intrinsics.g(this.w, tradeAdditionalResult.w) && Intrinsics.g(this.y, tradeAdditionalResult.y) && Intrinsics.g(this.z, tradeAdditionalResult.z) && Intrinsics.g(this.A, tradeAdditionalResult.A) && Intrinsics.g(this.B, tradeAdditionalResult.B) && Intrinsics.g(this.C, tradeAdditionalResult.C);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.v;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.w;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.y;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.z;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.A;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.B;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num3 = this.C;
        return iHashCode13 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ew7.a(this.b, "TradeAdditionalResult(message=", this.a, ", bizCode=", ", bankTradeStatus=");
        w03.a(this.c, ", tradeId=", this.d, ", bankAccName=", sbA);
        hxa.c(sbA, this.e, ", name=", this.f, ", displayMsg=");
        hxa.c(sbA, this.i, ", jumpUrl=", this.v, ", embeddedFrame=");
        hxa.c(sbA, this.w, ", counterIconUrl=", this.y, ", counterAuthority=");
        hxa.c(sbA, this.z, ", counterPart=", this.A, ", htmlContent=");
        sbA.append(this.B);
        sbA.append(", htmlContentReloadCount=");
        sbA.append(this.C);
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
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.i);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        Integer num3 = this.C;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            f78.c(parcel, 1, num3);
        }
    }

    public TradeAdditionalResult() {
        this(null, 16383);
    }

    public /* synthetic */ TradeAdditionalResult(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
