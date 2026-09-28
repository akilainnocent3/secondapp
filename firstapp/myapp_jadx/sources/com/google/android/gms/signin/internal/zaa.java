package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bj50;
import defpackage.cgk0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class zaa extends AbstractSafeParcelable implements bj50 {
    public static final Parcelable.Creator<zaa> CREATOR = new cgk0();
    public final int a;
    public final int b;
    public final Intent c;

    public zaa(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.bj50
    public final Status getStatus() {
        return this.b == 0 ? Status.e : Status.w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        uif.h(parcel, 3, this.c, i, false);
        uif.n(parcel, iM);
    }

    public zaa() {
        this(2, 0, null);
    }
}
