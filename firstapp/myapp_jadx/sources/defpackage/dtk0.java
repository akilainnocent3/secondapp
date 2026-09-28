package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;

/* JADX INFO: loaded from: classes4.dex */
public final class dtk0 implements Parcelable.Creator {
    public static void a(zzbg zzbgVar, Parcel parcel, int i) {
        String str = zzbgVar.a;
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 2, str, false);
        uif.h(parcel, 3, zzbgVar.b, i, false);
        uif.i(parcel, 4, zzbgVar.c, false);
        long j = zzbgVar.d;
        uif.o(parcel, 5, 8);
        parcel.writeLong(j);
        uif.n(parcel, iM);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        long jR = 0;
        String strF = null;
        zzbe zzbeVar = null;
        String strF2 = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strF = tr60.f(parcel, i);
            } else if (c == 3) {
                zzbeVar = (zzbe) tr60.e(parcel, i, zzbe.CREATOR);
            } else if (c == 4) {
                strF2 = tr60.f(parcel, i);
            } else if (c != 5) {
                tr60.u(parcel, i);
            } else {
                jR = tr60.r(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzbg(strF, zzbeVar, strF2, jR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbg[i];
    }
}
