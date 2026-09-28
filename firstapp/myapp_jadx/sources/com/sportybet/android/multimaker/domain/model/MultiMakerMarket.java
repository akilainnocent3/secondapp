package com.sportybet.android.multimaker.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.m;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ux5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/multimaker/domain/model/MultiMakerMarket;", "Landroid/os/Parcelable;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerMarket implements Parcelable {
    public static final Parcelable.Creator<MultiMakerMarket> CREATOR = new a();
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;

    public static final class a implements Parcelable.Creator<MultiMakerMarket> {
        @Override // android.os.Parcelable.Creator
        public final MultiMakerMarket createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            return new MultiMakerMarket(string, parcel.readInt(), parcel.readInt(), string2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiMakerMarket[] newArray(int i) {
            return new MultiMakerMarket[i];
        }
    }

    public MultiMakerMarket(String str, int i, int i2, String str2, String str3) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
    }

    public static MultiMakerMarket a(MultiMakerMarket multiMakerMarket, int i, int i2, int i3) {
        String str = multiMakerMarket.a;
        String str2 = multiMakerMarket.b;
        if ((i3 & 4) != 0) {
            i = multiMakerMarket.c;
        }
        String str3 = multiMakerMarket.d;
        multiMakerMarket.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new MultiMakerMarket(str, i, i2, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiMakerMarket)) {
            return false;
        }
        MultiMakerMarket multiMakerMarket = (MultiMakerMarket) obj;
        return Intrinsics.g(this.a, multiMakerMarket.a) && Intrinsics.g(this.b, multiMakerMarket.b) && this.c == multiMakerMarket.c && Intrinsics.g(this.d, multiMakerMarket.d) && this.e == multiMakerMarket.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + gmf0.a(gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("MultiMakerMarket(id=", this.a, ", specifier=", this.b, ", product=");
        f78.b(this.c, ", desc=", this.d, ", status=", sbA);
        return zk1.a(this.e, ")", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }

    public MultiMakerMarket() {
        this(0);
    }

    public /* synthetic */ MultiMakerMarket(int i) {
        this("", 0, 0, "", "");
    }
}
