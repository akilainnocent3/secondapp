package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzav;

/* JADX INFO: loaded from: classes4.dex */
public final class nqk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        int iP = 0;
        String strF = null;
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
                iP = tr60.p(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzav(strF, iP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzav[i];
    }
}
