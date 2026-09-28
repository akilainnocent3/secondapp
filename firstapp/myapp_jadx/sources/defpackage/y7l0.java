package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;

/* JADX INFO: loaded from: classes4.dex */
public final class y7l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        byte[] bArrC = null;
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                bArrC = tr60.c(parcel, i);
            } else if (c == 3) {
                strF = tr60.f(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                strF2 = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new RegisterResponseData(strF, strF2, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterResponseData[i];
    }
}
