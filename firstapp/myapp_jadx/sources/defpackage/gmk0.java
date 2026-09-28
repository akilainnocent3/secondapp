package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class gmk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        byte[] bArrC = null;
        Bundle bundleB = null;
        long jR = 0;
        int iP = 0;
        int iP2 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strF = tr60.f(parcel, i);
            } else if (c == 2) {
                iP2 = tr60.p(parcel, i);
            } else if (c == 3) {
                jR = tr60.r(parcel, i);
            } else if (c == 4) {
                bArrC = tr60.c(parcel, i);
            } else if (c == 5) {
                bundleB = tr60.b(parcel, i);
            } else if (c != 1000) {
                tr60.u(parcel, i);
            } else {
                iP = tr60.p(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new ProxyRequest(iP, strF, iP2, jR, bArrC, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }
}
