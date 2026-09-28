package com.sportybet.feature.luckynumber.featurematch.domain.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b7f;
import defpackage.em5;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hib0;
import defpackage.hxa;
import defpackage.nrg0;
import defpackage.qn4;
import defpackage.u4;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/luckynumber/featurematch/domain/data/LNLastMinuteCard;", "Landroid/os/Parcelable;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNLastMinuteCard implements Parcelable {
    public static final Parcelable.Creator<LNLastMinuteCard> CREATOR = new a();
    public final double A;
    public final double B;
    public final int C;
    public final int D;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final long i;
    public final String v;
    public final String w;
    public final String y;
    public final String z;

    public static final class a implements Parcelable.Creator<LNLastMinuteCard> {
        @Override // android.os.Parcelable.Creator
        public final LNLastMinuteCard createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LNLastMinuteCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LNLastMinuteCard[] newArray(int i) {
            return new LNLastMinuteCard[i];
        }
    }

    public LNLastMinuteCard(String str, String str2, String str3, String str4, long j, long j2, long j3, String str5, String str6, String str7, String str8, double d, double d2, int i, int i2) {
        qn4.b(str, str2, str3, str4, str5);
        str7.getClass();
        str8.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.i = j3;
        this.v = str5;
        this.w = str6;
        this.y = str7;
        this.z = str8;
        this.A = d;
        this.B = d2;
        this.C = i;
        this.D = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LNLastMinuteCard)) {
            return false;
        }
        LNLastMinuteCard lNLastMinuteCard = (LNLastMinuteCard) obj;
        return Intrinsics.g(this.a, lNLastMinuteCard.a) && Intrinsics.g(this.b, lNLastMinuteCard.b) && Intrinsics.g(this.c, lNLastMinuteCard.c) && Intrinsics.g(this.d, lNLastMinuteCard.d) && this.e == lNLastMinuteCard.e && this.f == lNLastMinuteCard.f && this.i == lNLastMinuteCard.i && Intrinsics.g(this.v, lNLastMinuteCard.v) && Intrinsics.g(this.w, lNLastMinuteCard.w) && Intrinsics.g(this.y, lNLastMinuteCard.y) && Intrinsics.g(this.z, lNLastMinuteCard.z) && Double.compare(this.A, lNLastMinuteCard.A) == 0 && Double.compare(this.B, lNLastMinuteCard.B) == 0 && this.C == lNLastMinuteCard.C && this.D == lNLastMinuteCard.D;
    }

    public final int hashCode() {
        int iA = gmf0.a(f87.a(f87.a(f87.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), this.f, 31), this.i, 31), 31, this.v);
        String str = this.w;
        return Integer.hashCode(this.D) + gpp.a(this.C, nrg0.a(nrg0.a(gmf0.a(gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNLastMinuteCard(lotteryId=", this.a, ", name=", this.b, ", gameType=");
        hxa.c(sbA, this.c, ", drawId=", this.d, ", drawTime=");
        sbA.append(this.e);
        g41.a(this.f, ", drawTimeForElapsedRealtime=", ", refreshAtElapsedRealtime=", sbA);
        em5.a(this.i, ", marketId=", this.v, sbA);
        hxa.c(sbA, ", marketTitle=", this.w, ", specifier=", this.y);
        u4.a(sbA, ", outcomeId=", this.z, ", odds=");
        sbA.append(this.A);
        hib0.b(this.B, ", probability=", ", maxMainBallAmount=", sbA);
        return b7f.a(sbA, this.C, ", ballCount=", this.D, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.i);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeDouble(this.A);
        parcel.writeDouble(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
    }

    public LNLastMinuteCard() {
        this(0);
    }

    public /* synthetic */ LNLastMinuteCard(int i) {
        this("", "", "", "", 0L, 0L, 0L, "", null, "", "", 0.0d, 0.0d, 0, 0);
    }
}
