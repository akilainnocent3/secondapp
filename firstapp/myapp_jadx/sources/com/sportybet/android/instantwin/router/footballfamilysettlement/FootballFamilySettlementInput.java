package com.sportybet.android.instantwin.router.footballfamilysettlement;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gmf0;
import defpackage.mq0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/router/footballfamilysettlement/FootballFamilySettlementInput;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FootballFamilySettlementInput implements Parcelable {
    public static final Parcelable.Creator<FootballFamilySettlementInput> CREATOR = new a();
    public final String a;
    public final String b;
    public final boolean c;

    public static final class a implements Parcelable.Creator<FootballFamilySettlementInput> {
        @Override // android.os.Parcelable.Creator
        public final FootballFamilySettlementInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new FootballFamilySettlementInput(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FootballFamilySettlementInput[] newArray(int i) {
            return new FootballFamilySettlementInput[i];
        }
    }

    public FootballFamilySettlementInput(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FootballFamilySettlementInput)) {
            return false;
        }
        FootballFamilySettlementInput footballFamilySettlementInput = (FootballFamilySettlementInput) obj;
        return Intrinsics.g(this.a, footballFamilySettlementInput.a) && Intrinsics.g(this.b, footballFamilySettlementInput.b) && this.c == footballFamilySettlementInput.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(ux5.a("FootballFamilySettlementInput(sportId=", this.a, ", roundId=", this.b, ", speedControllerEnabled="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
