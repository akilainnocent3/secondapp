package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.identity.zzh;
import com.google.android.gms.internal.identity.zzj;

/* JADX INFO: loaded from: classes4.dex */
public final class mcl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        zzh zzhVar = null;
        IBinder iBinderO = null;
        IBinder iBinderO2 = null;
        int iP = 1;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                zzhVar = (zzh) tr60.e(parcel, i, zzh.CREATOR);
            } else if (c == 3) {
                iBinderO = tr60.o(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                iBinderO2 = tr60.o(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzj(iP, zzhVar, iBinderO, iBinderO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
