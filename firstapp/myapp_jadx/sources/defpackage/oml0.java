package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzom;

/* JADX INFO: loaded from: classes4.dex */
public final class oml0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        byte[] bArrC = null;
        String strF = null;
        Bundle bundleB = null;
        String strF2 = null;
        long jR = 0;
        long jR2 = 0;
        int iP = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jR = tr60.r(parcel, i);
                    break;
                case 2:
                    bArrC = tr60.c(parcel, i);
                    break;
                case 3:
                    strF = tr60.f(parcel, i);
                    break;
                case 4:
                    bundleB = tr60.b(parcel, i);
                    break;
                case 5:
                    iP = tr60.p(parcel, i);
                    break;
                case 6:
                    jR2 = tr60.r(parcel, i);
                    break;
                case 7:
                    strF2 = tr60.f(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new zzom(jR, bArrC, strF, bundleB, iP, jR2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzom[i];
    }
}
