package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzq;

/* JADX INFO: loaded from: classes4.dex */
public final class vql0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        boolean zL = false;
        int iP = 0;
        String strF = null;
        int iP2 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zL = tr60.l(parcel, i);
            } else if (c == 2) {
                strF = tr60.f(parcel, i);
            } else if (c == 3) {
                iP2 = tr60.p(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                iP = tr60.p(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzq(iP2, iP, strF, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
