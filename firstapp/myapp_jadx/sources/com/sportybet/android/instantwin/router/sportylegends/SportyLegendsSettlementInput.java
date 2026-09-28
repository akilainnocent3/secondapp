package com.sportybet.android.instantwin.router.sportylegends;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfo;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/router/sportylegends/SportyLegendsSettlementInput;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyLegendsSettlementInput implements Parcelable {
    public static final Parcelable.Creator<SportyLegendsSettlementInput> CREATOR = new a();
    public final SportyLegendsSettlementRoundInfo a;
    public final String b;
    public final String c;

    public static final class a implements Parcelable.Creator<SportyLegendsSettlementInput> {
        @Override // android.os.Parcelable.Creator
        public final SportyLegendsSettlementInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SportyLegendsSettlementInput(SportyLegendsSettlementRoundInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SportyLegendsSettlementInput[] newArray(int i) {
            return new SportyLegendsSettlementInput[i];
        }
    }

    static {
        Parcelable.Creator<SportyLegendsSettlementRoundInfo> creator = SportyLegendsSettlementRoundInfo.CREATOR;
    }

    public SportyLegendsSettlementInput(SportyLegendsSettlementRoundInfo sportyLegendsSettlementRoundInfo, String str, String str2) {
        sportyLegendsSettlementRoundInfo.getClass();
        this.a = sportyLegendsSettlementRoundInfo;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportyLegendsSettlementInput)) {
            return false;
        }
        SportyLegendsSettlementInput sportyLegendsSettlementInput = (SportyLegendsSettlementInput) obj;
        return Intrinsics.g(this.a, sportyLegendsSettlementInput.a) && Intrinsics.g(this.b, sportyLegendsSettlementInput.b) && Intrinsics.g(this.c, sportyLegendsSettlementInput.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyLegendsSettlementInput(roundInfo=");
        sb.append(this.a);
        sb.append(", ticketNumber=");
        sb.append(this.b);
        sb.append(", challengeId=");
        return uf80.a(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
