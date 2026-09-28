package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzs;

/* JADX INFO: loaded from: classes4.dex */
public final class gsl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        boolean zL = false;
        String strF = null;
        IBinder iBinderO = null;
        boolean zL2 = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strF = tr60.f(parcel, i);
            } else if (c == 2) {
                iBinderO = tr60.o(parcel, i);
            } else if (c == 3) {
                zL = tr60.l(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                zL2 = tr60.l(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzs(strF, iBinderO, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
