package com.sportybet.android.multimaker.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ijg0;
import defpackage.ux5;
import defpackage.wd7;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/multimaker/domain/model/MultiMakerOutcome;", "Landroid/os/Parcelable;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerOutcome implements Parcelable {
    public static final Parcelable.Creator<MultiMakerOutcome> CREATOR = new a();
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;

    public static final class a implements Parcelable.Creator<MultiMakerOutcome> {
        @Override // android.os.Parcelable.Creator
        public final MultiMakerOutcome createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            return new MultiMakerOutcome(parcel.readInt(), parcel.readInt(), string, string2, string3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiMakerOutcome[] newArray(int i) {
            return new MultiMakerOutcome[i];
        }
    }

    public /* synthetic */ MultiMakerOutcome(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        this((i2 & 8) != 0 ? 0 : i, 0, (i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiMakerOutcome)) {
            return false;
        }
        MultiMakerOutcome multiMakerOutcome = (MultiMakerOutcome) obj;
        return Intrinsics.g(this.a, multiMakerOutcome.a) && Intrinsics.g(this.b, multiMakerOutcome.b) && Intrinsics.g(this.c, multiMakerOutcome.c) && this.d == multiMakerOutcome.d && Intrinsics.g(this.e, multiMakerOutcome.e) && this.f == multiMakerOutcome.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + gmf0.a(gpp.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("MultiMakerOutcome(id=", this.a, ", odds=", this.b, ", probability=");
        wxa.b(this.d, this.c, ", isActive=", ", desc=", sbA);
        return ijg0.a(this.f, this.e, ", oddsChangesFlag=", ")", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    public MultiMakerOutcome(int i, int i2, String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = i2;
    }

    public MultiMakerOutcome() {
        this(null, null, null, null, 0, 63, 0);
    }
}
