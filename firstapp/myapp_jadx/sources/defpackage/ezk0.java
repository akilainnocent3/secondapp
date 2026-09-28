package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class ezk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        ConnectionResult connectionResult = null;
        int iP = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                strF = tr60.f(parcel, i);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) tr60.e(parcel, i, PendingIntent.CREATOR);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                connectionResult = (ConnectionResult) tr60.e(parcel, i, ConnectionResult.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new Status(iP, strF, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
