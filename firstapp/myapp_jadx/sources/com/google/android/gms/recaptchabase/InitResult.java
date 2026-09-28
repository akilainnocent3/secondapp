package com.google.android.gms.recaptchabase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.k3l0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class InitResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InitResult> CREATOR = new k3l0();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof InitResult);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        uif.n(parcel, uif.m(parcel, 20293));
    }
}
