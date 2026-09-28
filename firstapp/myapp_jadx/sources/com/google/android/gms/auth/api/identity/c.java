package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tr60;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        boolean zL = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zL = tr60.l(parcel, i);
            } else if (c != 2) {
                tr60.u(parcel, i);
            } else {
                strF = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new BeginSignInRequest.PasskeyJsonRequestOptions(zL, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.PasskeyJsonRequestOptions[i];
    }
}
