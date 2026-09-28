package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class lmk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        int iP4 = 0;
        boolean zL = false;
        String strF = null;
        ArrayList<String> arrayListH = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        float fN = 0.0f;
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
                case 7:
                case '\t':
                default:
                    tr60.u(parcel, i);
                    break;
                case 4:
                    strF = tr60.f(parcel, i);
                    break;
                case 5:
                    iP3 = tr60.p(parcel, i);
                    break;
                case 6:
                    arrayListH = tr60.h(parcel, i);
                    break;
                case '\b':
                    jR2 = tr60.r(parcel, i);
                    break;
                case '\n':
                    strF3 = tr60.f(parcel, i);
                    break;
                case 11:
                    iP2 = tr60.p(parcel, i);
                    break;
                case '\f':
                    strF2 = tr60.f(parcel, i);
                    break;
                case '\r':
                    strF4 = tr60.f(parcel, i);
                    break;
                case 14:
                    iP4 = tr60.p(parcel, i);
                    break;
                case 15:
                    fN = tr60.n(parcel, i);
                    break;
                case 16:
                    jR3 = tr60.r(parcel, i);
                    break;
                case 17:
                    strF5 = tr60.f(parcel, i);
                    break;
                case 18:
                    zL = tr60.l(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new WakeLockEvent(iP, jR, iP2, strF, iP3, arrayListH, strF2, jR2, iP4, strF3, strF4, fN, jR3, strF5, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
