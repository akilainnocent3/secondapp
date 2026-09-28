package com.sportybet.android.instantwin.router;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/router/VirtualGameInput;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VirtualGameInput implements Parcelable {
    public static final Parcelable.Creator<VirtualGameInput> CREATOR = new a();
    public final String a;
    public final int b;
    public final int c;

    public static final class a implements Parcelable.Creator<VirtualGameInput> {
        @Override // android.os.Parcelable.Creator
        public final VirtualGameInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new VirtualGameInput(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VirtualGameInput[] newArray(int i) {
            return new VirtualGameInput[i];
        }
    }

    public VirtualGameInput(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualGameInput)) {
            return false;
        }
        VirtualGameInput virtualGameInput = (VirtualGameInput) obj;
        return Intrinsics.g(this.a, virtualGameInput.a) && this.b == virtualGameInput.b && this.c == virtualGameInput.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return zk1.a(this.c, ")", ml5.a(this.b, "VirtualGameInput(linkUrl=", this.a, ", bizType=", ", titleResId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
