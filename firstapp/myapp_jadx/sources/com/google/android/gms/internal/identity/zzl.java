package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bj50;
import defpackage.dhl0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class zzl extends AbstractSafeParcelable implements bj50 {
    public static final Parcelable.Creator<zzl> CREATOR;
    public final Status a;

    static {
        new zzl(Status.e);
        CREATOR = new dhl0();
    }

    public zzl(Status status) {
        this.a = status;
    }

    @Override // defpackage.bj50
    public final Status getStatus() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.h(parcel, 1, this.a, i, false);
        uif.n(parcel, iM);
    }
}
