package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class f3l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        String strF2 = null;
        int iP = 0;
        byte[] bArrC = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                strF = tr60.f(parcel, i);
            } else if (c == 3) {
                bArrC = tr60.c(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                strF2 = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new RegisterRequest(iP, strF, strF2, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterRequest[i];
    }
}
