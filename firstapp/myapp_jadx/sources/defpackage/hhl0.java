package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class hhl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        Long lS = null;
        ArrayList<String> arrayListH = null;
        String strF2 = null;
        int iP = 0;
        boolean zL = false;
        boolean zL2 = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iP = tr60.p(parcel, i);
                    break;
                case 2:
                    strF = tr60.f(parcel, i);
                    break;
                case 3:
                    lS = tr60.s(parcel, i);
                    break;
                case 4:
                    zL = tr60.l(parcel, i);
                    break;
                case 5:
                    zL2 = tr60.l(parcel, i);
                    break;
                case 6:
                    arrayListH = tr60.h(parcel, i);
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
        return new TokenData(iP, strF, lS, zL, zL2, arrayListH, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
