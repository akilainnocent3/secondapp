package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class vrk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundleB = null;
        byte[] bArrC = null;
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP2 = tr60.p(parcel, i);
            } else if (c == 2) {
                pendingIntent = (PendingIntent) tr60.e(parcel, i, PendingIntent.CREATOR);
            } else if (c == 3) {
                iP3 = tr60.p(parcel, i);
            } else if (c == 4) {
                bundleB = tr60.b(parcel, i);
            } else if (c == 5) {
                bArrC = tr60.c(parcel, i);
            } else if (c != 1000) {
                tr60.u(parcel, i);
            } else {
                iP = tr60.p(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new ProxyResponse(iP, iP2, pendingIntent, iP3, bundleB, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }
}
