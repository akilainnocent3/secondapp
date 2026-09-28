package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: classes4.dex */
public final class hxk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        Bundle bundleB = null;
        String strF = null;
        boolean zL = false;
        long jR = 0;
        long jR2 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                jR = tr60.r(parcel, i);
            } else if (c == 2) {
                jR2 = tr60.r(parcel, i);
            } else if (c == 3) {
                zL = tr60.l(parcel, i);
            } else if (c == 7) {
                bundleB = tr60.b(parcel, i);
            } else if (c != '\b') {
                tr60.u(parcel, i);
            } else {
                strF = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzdd(jR, jR2, zL, bundleB, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdd[i];
    }
}
