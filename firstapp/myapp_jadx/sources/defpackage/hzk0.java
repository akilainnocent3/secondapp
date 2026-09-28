package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class hzk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        byte[] bArrC = null;
        ArrayList arrayListJ = null;
        int iP = 0;
        String strF = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                bArrC = tr60.c(parcel, i);
            } else if (c == 3) {
                strF = tr60.f(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                arrayListJ = tr60.j(parcel, i, Transport.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new KeyHandle(iP, bArrC, strF, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new KeyHandle[i];
    }
}
