package com.sportybet.android.instantwin.router.penalty;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/router/penalty/SportyPenaltyInput;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyPenaltyInput implements Parcelable {
    public static final Parcelable.Creator<SportyPenaltyInput> CREATOR = new a();
    public final String a;

    public static final class a implements Parcelable.Creator<SportyPenaltyInput> {
        @Override // android.os.Parcelable.Creator
        public final SportyPenaltyInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SportyPenaltyInput(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SportyPenaltyInput[] newArray(int i) {
            return new SportyPenaltyInput[i];
        }
    }

    public SportyPenaltyInput(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SportyPenaltyInput) && Intrinsics.g(this.a, ((SportyPenaltyInput) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SportyPenaltyInput(sportId=", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
