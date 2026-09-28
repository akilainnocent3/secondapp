package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class ylk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        String strF2 = null;
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        long jR = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iP = tr60.p(parcel, i);
                    break;
                case 2:
                    jR = tr60.r(parcel, i);
                    break;
                case 3:
                    strF = tr60.f(parcel, i);
                    break;
                case 4:
                    iP2 = tr60.p(parcel, i);
                    break;
                case 5:
                    iP3 = tr60.p(parcel, i);
                    break;
                case 6:
                    strF2 = tr60.f(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new AccountChangeEvent(iP, jR, strF, iP2, iP3, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }
}
