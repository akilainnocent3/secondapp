package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tr60;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        boolean zL = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                tr60.u(parcel, i);
            } else {
                zL = tr60.l(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new BeginSignInRequest.PasswordRequestOptions(zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.PasswordRequestOptions[i];
    }
}
