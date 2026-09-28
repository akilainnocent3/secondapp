package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzo;

/* JADX INFO: loaded from: classes4.dex */
public final class nnl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        String strF = null;
        IBinder iBinderO = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strF = tr60.f(parcel, i);
                    break;
                case 2:
                    zL = tr60.l(parcel, i);
                    break;
                case 3:
                    zL2 = tr60.l(parcel, i);
                    break;
                case 4:
                    iBinderO = tr60.o(parcel, i);
                    break;
                case 5:
                    zL3 = tr60.l(parcel, i);
                    break;
                case 6:
                    zL4 = tr60.l(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new zzo(strF, zL, zL2, iBinderO, zL3, zL4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
