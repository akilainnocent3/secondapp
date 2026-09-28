package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.identity.zzee;

/* JADX INFO: loaded from: classes4.dex */
public final class vzk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        IBinder iBinderO = null;
        IBinder iBinderO2 = null;
        PendingIntent pendingIntent = null;
        String strF = null;
        int iP = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                iBinderO = tr60.o(parcel, i);
            } else if (c == 3) {
                iBinderO2 = tr60.o(parcel, i);
            } else if (c == 4) {
                pendingIntent = (PendingIntent) tr60.e(parcel, i, PendingIntent.CREATOR);
            } else if (c != 6) {
                tr60.u(parcel, i);
            } else {
                strF = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzee(iP, iBinderO, iBinderO2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzee[i];
    }
}
