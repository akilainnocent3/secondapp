package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: loaded from: classes4.dex */
public final class ixk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        int iP = 0;
        Intent intent = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                strF = tr60.f(parcel, i);
            } else if (c != 3) {
                tr60.u(parcel, i);
            } else {
                intent = (Intent) tr60.e(parcel, i, Intent.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new zzdf(iP, strF, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdf[i];
    }
}
