package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.zzb;

/* JADX INFO: loaded from: classes4.dex */
public final class ouk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        WorkSource workSource = null;
        String strF = null;
        int[] iArrD = null;
        String strF2 = null;
        String strF3 = null;
        long jR = 0;
        long jR2 = 0;
        boolean zL = false;
        boolean zL2 = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jR = tr60.r(parcel, i);
                    break;
                case 2:
                    zL = tr60.l(parcel, i);
                    break;
                case 3:
                    workSource = (WorkSource) tr60.e(parcel, i, WorkSource.CREATOR);
                    break;
                case 4:
                    strF = tr60.f(parcel, i);
                    break;
                case 5:
                    iArrD = tr60.d(parcel, i);
                    break;
                case 6:
                    zL2 = tr60.l(parcel, i);
                    break;
                case 7:
                    strF2 = tr60.f(parcel, i);
                    break;
                case '\b':
                    jR2 = tr60.r(parcel, i);
                    break;
                case '\t':
                    strF3 = tr60.f(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new zzb(jR, zL, workSource, strF, iArrD, zL2, strF2, jR2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }
}
