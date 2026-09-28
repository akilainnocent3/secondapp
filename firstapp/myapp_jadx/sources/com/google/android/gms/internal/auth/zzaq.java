package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.tpk0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new tpk0();
    public final int a = 1;
    public final String b;

    public zzaq(String str) {
        hm20.h(str);
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.i(parcel, 2, this.b, false);
        uif.n(parcel, iM);
    }
}
