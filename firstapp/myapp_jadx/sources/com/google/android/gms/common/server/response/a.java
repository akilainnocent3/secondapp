package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import defpackage.tr60;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        String strF2 = null;
        zaa zaaVar = null;
        int iP = 0;
        int iP2 = 0;
        boolean zL = false;
        int iP3 = 0;
        boolean zL2 = false;
        int iP4 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iP = tr60.p(parcel, i);
                    break;
                case 2:
                    iP2 = tr60.p(parcel, i);
                    break;
                case 3:
                    zL = tr60.l(parcel, i);
                    break;
                case 4:
                    iP3 = tr60.p(parcel, i);
                    break;
                case 5:
                    zL2 = tr60.l(parcel, i);
                    break;
                case 6:
                    strF = tr60.f(parcel, i);
                    break;
                case 7:
                    iP4 = tr60.p(parcel, i);
                    break;
                case '\b':
                    strF2 = tr60.f(parcel, i);
                    break;
                case '\t':
                    zaaVar = (zaa) tr60.e(parcel, i, zaa.CREATOR);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new FastJsonResponse.Field(iP, iP2, zL, iP3, zL2, strF, iP4, strF2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
