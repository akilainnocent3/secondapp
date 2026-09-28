package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class yuk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        long jR = -1;
        int iP = 0;
        String strF = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strF = tr60.f(parcel, i);
            } else if (c == 2) {
                iP = tr60.p(parcel, i);
            } else if (c != 3) {
                tr60.u(parcel, i);
            } else {
                jR = tr60.r(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new Feature(strF, iP, jR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
