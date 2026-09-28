package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzaz;

/* JADX INFO: loaded from: classes4.dex */
public final class esk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                tr60.p(parcel, i);
            } else if (c == 2) {
                strF = tr60.f(parcel, i);
            } else if (c != 3) {
                tr60.u(parcel, i);
            } else {
                bArrC = tr60.c(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzaz(strF, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaz[i];
    }
}
