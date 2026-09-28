package com.sportybet.android.instantwin.router.kickoff;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsSettlementInput;
import defpackage.mtg0;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/router/kickoff/KickoffInput;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class KickoffInput implements Parcelable {
    public static final Parcelable.Creator<KickoffInput> CREATOR = new a();
    public final String a;
    public final boolean b;
    public final SportyLegendsSettlementInput c;

    public static final class a implements Parcelable.Creator<KickoffInput> {
        @Override // android.os.Parcelable.Creator
        public final KickoffInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new KickoffInput(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SportyLegendsSettlementInput.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final KickoffInput[] newArray(int i) {
            return new KickoffInput[i];
        }
    }

    static {
        Parcelable.Creator<SportyLegendsSettlementInput> creator = SportyLegendsSettlementInput.CREATOR;
    }

    public KickoffInput(String str, boolean z, SportyLegendsSettlementInput sportyLegendsSettlementInput) {
        this.a = str;
        this.b = z;
        this.c = sportyLegendsSettlementInput;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KickoffInput)) {
            return false;
        }
        KickoffInput kickoffInput = (KickoffInput) obj;
        return Intrinsics.g(this.a, kickoffInput.a) && this.b == kickoffInput.b && Intrinsics.g(this.c, kickoffInput.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iA = mtg0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        SportyLegendsSettlementInput sportyLegendsSettlementInput = this.c;
        return iA + (sportyLegendsSettlementInput != null ? sportyLegendsSettlementInput.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("KickoffInput(roundId=", this.a, ", isPlayerFallback=", ", sportyLegendsSettlementInput=", this.b);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        SportyLegendsSettlementInput sportyLegendsSettlementInput = this.c;
        if (sportyLegendsSettlementInput == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sportyLegendsSettlementInput.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ KickoffInput(String str) {
        this(str, false, null);
    }
}
