package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tr60;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        ArrayList<String> arrayListH = null;
        ArrayList arrayListJ = null;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zL = tr60.l(parcel, i);
                    break;
                case 2:
                    strF = tr60.f(parcel, i);
                    break;
                case 3:
                    strF2 = tr60.f(parcel, i);
                    break;
                case 4:
                    zL2 = tr60.l(parcel, i);
                    break;
                case 5:
                    strF3 = tr60.f(parcel, i);
                    break;
                case 6:
                    arrayListH = tr60.h(parcel, i);
                    break;
                case 7:
                    zL3 = tr60.l(parcel, i);
                    break;
                case '\b':
                    arrayListJ = tr60.j(parcel, i, Claim.CREATOR);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zL, strF, strF2, zL2, strF3, arrayListH, zL3, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }
}
