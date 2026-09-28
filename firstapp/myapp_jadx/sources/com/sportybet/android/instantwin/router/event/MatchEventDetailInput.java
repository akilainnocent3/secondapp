package com.sportybet.android.instantwin.router.event;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/router/event/MatchEventDetailInput;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MatchEventDetailInput implements Parcelable {
    public static final Parcelable.Creator<MatchEventDetailInput> CREATOR = new a();
    public final String a;
    public final boolean b;
    public final String c;

    public static final class a implements Parcelable.Creator<MatchEventDetailInput> {
        @Override // android.os.Parcelable.Creator
        public final MatchEventDetailInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MatchEventDetailInput(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MatchEventDetailInput[] newArray(int i) {
            return new MatchEventDetailInput[i];
        }
    }

    public MatchEventDetailInput(String str, boolean z, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = z;
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
        if (!(obj instanceof MatchEventDetailInput)) {
            return false;
        }
        MatchEventDetailInput matchEventDetailInput = (MatchEventDetailInput) obj;
        return Intrinsics.g(this.a, matchEventDetailInput.a) && this.b == matchEventDetailInput.b && Intrinsics.g(this.c, matchEventDetailInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(z620.a("MatchEventDetailInput(eventId=", this.a, ", isBetBuilderMode=", ", roundId=", this.b), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
    }
}
