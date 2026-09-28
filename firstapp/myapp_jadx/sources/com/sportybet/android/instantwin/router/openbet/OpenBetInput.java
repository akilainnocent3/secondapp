package com.sportybet.android.instantwin.router.openbet;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import defpackage.mtg0;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/router/openbet/OpenBetInput;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OpenBetInput implements Parcelable {
    public static final Parcelable.Creator<OpenBetInput> CREATOR = new a();
    public final String a;
    public final boolean b;
    public final InstantWinBetSource c;

    public static final class a implements Parcelable.Creator<OpenBetInput> {
        @Override // android.os.Parcelable.Creator
        public final OpenBetInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OpenBetInput(parcel.readString(), parcel.readInt() != 0, InstantWinBetSource.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OpenBetInput[] newArray(int i) {
            return new OpenBetInput[i];
        }
    }

    public OpenBetInput(String str, boolean z, InstantWinBetSource instantWinBetSource) {
        str.getClass();
        instantWinBetSource.getClass();
        this.a = str;
        this.b = z;
        this.c = instantWinBetSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenBetInput)) {
            return false;
        }
        OpenBetInput openBetInput = (OpenBetInput) obj;
        return Intrinsics.g(this.a, openBetInput.a) && this.b == openBetInput.b && this.c == openBetInput.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("OpenBetInput(roundId=", this.a, ", showTicketCreateToast=", ", betSource=", this.b);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        this.c.writeToParcel(parcel, i);
    }
}
