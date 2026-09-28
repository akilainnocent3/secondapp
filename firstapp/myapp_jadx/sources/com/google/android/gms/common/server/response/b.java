package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tr60;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        int iP = 0;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                strF = tr60.f(parcel, i);
            } else if (c != 3) {
                tr60.u(parcel, i);
            } else {
                field = (FastJsonResponse.Field) tr60.e(parcel, i, FastJsonResponse.Field.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new zam(iP, strF, field);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
