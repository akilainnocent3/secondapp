package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzal;

/* JADX INFO: loaded from: classes4.dex */
public final class bpk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        long jR = -1;
        long jR2 = -1;
        int iP = 1;
        int iP2 = 1;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                iP2 = tr60.p(parcel, i);
            } else if (c == 3) {
                jR = tr60.r(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                jR2 = tr60.r(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzal(iP, iP2, jR, jR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
