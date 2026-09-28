package com.sportybet.android.instantwin.router.instantwin;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import defpackage.ux5;
import defpackage.x9d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/router/instantwin/InstantWinInput;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class InstantWinInput implements Parcelable {
    public static final Parcelable.Creator<InstantWinInput> CREATOR = new a();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<InstantWinInput> {
        @Override // android.os.Parcelable.Creator
        public final InstantWinInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new InstantWinInput(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final InstantWinInput[] newArray(int i) {
            return new InstantWinInput[i];
        }
    }

    public InstantWinInput(String str, String str2, String str3, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantWinInput)) {
            return false;
        }
        InstantWinInput instantWinInput = (InstantWinInput) obj;
        return Intrinsics.g(this.a, instantWinInput.a) && Intrinsics.g(this.b, instantWinInput.b) && Intrinsics.g(this.c, instantWinInput.c) && this.d == instantWinInput.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public final String toString() {
        return x9d.a(this.c, ", isBetBuilderMode=", ")", ux5.a("InstantWinInput(sportId=", this.a, YAzniTbXHYQ.ZnfHLViMIjQS, this.b, ", marketType="), this.d);
    }
}
