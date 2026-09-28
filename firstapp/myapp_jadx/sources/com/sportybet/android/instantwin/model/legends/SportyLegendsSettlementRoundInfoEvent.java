package com.sportybet.android.instantwin.model.legends;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/model/legends/SportyLegendsSettlementRoundInfoEvent;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyLegendsSettlementRoundInfoEvent implements Parcelable {
    public static final Parcelable.Creator<SportyLegendsSettlementRoundInfoEvent> CREATOR = new a();
    public static final SportyLegendsSettlementRoundInfoEvent f = new SportyLegendsSettlementRoundInfoEvent("", "", "", "", "");
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator<SportyLegendsSettlementRoundInfoEvent> {
        @Override // android.os.Parcelable.Creator
        public final SportyLegendsSettlementRoundInfoEvent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SportyLegendsSettlementRoundInfoEvent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SportyLegendsSettlementRoundInfoEvent[] newArray(int i) {
            return new SportyLegendsSettlementRoundInfoEvent[i];
        }
    }

    public SportyLegendsSettlementRoundInfoEvent(String str, String str2, String str3, String str4, String str5) {
        qn4.b(str, str2, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportyLegendsSettlementRoundInfoEvent)) {
            return false;
        }
        SportyLegendsSettlementRoundInfoEvent sportyLegendsSettlementRoundInfoEvent = (SportyLegendsSettlementRoundInfoEvent) obj;
        return Intrinsics.g(this.a, sportyLegendsSettlementRoundInfoEvent.a) && Intrinsics.g(this.b, sportyLegendsSettlementRoundInfoEvent.b) && Intrinsics.g(this.c, sportyLegendsSettlementRoundInfoEvent.c) && Intrinsics.g(this.d, sportyLegendsSettlementRoundInfoEvent.d) && Intrinsics.g(this.e, sportyLegendsSettlementRoundInfoEvent.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyLegendsSettlementRoundInfoEvent(homeTeamName=", this.a, ", homeTeamLogoUrl=", this.b, ", awayTeamName=");
        hxa.c(sbA, this.c, ", awayTeamLogoUrl=", this.d, ", resultSequence=");
        return uf80.a(sbA, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
