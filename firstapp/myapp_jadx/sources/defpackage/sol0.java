package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzpl;

/* JADX INFO: loaded from: classes4.dex */
public final class sol0 implements Parcelable.Creator {
    public static void a(zzpl zzplVar, Parcel parcel) {
        int i = zzplVar.a;
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(i);
        uif.i(parcel, 2, zzplVar.b, false);
        long j = zzplVar.c;
        uif.o(parcel, 3, 8);
        parcel.writeLong(j);
        uif.g(parcel, 4, zzplVar.d);
        uif.i(parcel, 6, zzplVar.e, false);
        uif.i(parcel, 7, zzplVar.f, false);
        uif.c(parcel, 8, zzplVar.i);
        uif.n(parcel, iM);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        Long lS = null;
        Float fValueOf = null;
        String strF2 = null;
        String strF3 = null;
        Double dM = null;
        long jR = 0;
        int iP = 0;
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
                    jR = tr60.r(parcel, i);
                    break;
                case 4:
                    lS = tr60.s(parcel, i);
                    break;
                case 5:
                    int iT = tr60.t(parcel, i);
                    if (iT != 0) {
                        tr60.w(parcel, iT, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                    } else {
                        fValueOf = null;
                    }
                    break;
                case 6:
                    strF2 = tr60.f(parcel, i);
                    break;
                case 7:
                    strF3 = tr60.f(parcel, i);
                    break;
                case '\b':
                    dM = tr60.m(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new zzpl(iP, strF, jR, lS, fValueOf, strF2, strF3, dM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpl[i];
    }
}
