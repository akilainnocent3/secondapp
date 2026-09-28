package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;

/* JADX INFO: loaded from: classes4.dex */
public final class iok0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        String strF2 = null;
        zzpl zzplVar = null;
        String strF3 = null;
        zzbg zzbgVar = null;
        zzbg zzbgVar2 = null;
        zzbg zzbgVar3 = null;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        boolean zL = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strF = tr60.f(parcel, i);
                    break;
                case 3:
                    strF2 = tr60.f(parcel, i);
                    break;
                case 4:
                    zzplVar = (zzpl) tr60.e(parcel, i, zzpl.CREATOR);
                    break;
                case 5:
                    jR = tr60.r(parcel, i);
                    break;
                case 6:
                    zL = tr60.l(parcel, i);
                    break;
                case 7:
                    strF3 = tr60.f(parcel, i);
                    break;
                case '\b':
                    zzbgVar = (zzbg) tr60.e(parcel, i, zzbg.CREATOR);
                    break;
                case '\t':
                    jR2 = tr60.r(parcel, i);
                    break;
                case '\n':
                    zzbgVar2 = (zzbg) tr60.e(parcel, i, zzbg.CREATOR);
                    break;
                case 11:
                    jR3 = tr60.r(parcel, i);
                    break;
                case '\f':
                    zzbgVar3 = (zzbg) tr60.e(parcel, i, zzbg.CREATOR);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new zzah(strF, strF2, zzplVar, jR, zL, strF3, zzbgVar, jR2, zzbgVar2, jR3, zzbgVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzah[i];
    }
}
