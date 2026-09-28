package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;

/* JADX INFO: loaded from: classes4.dex */
public final class sel0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        byte[] bArrC = null;
        String strF = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                bArrC = tr60.c(parcel, i);
            } else if (c == 3) {
                strF = tr60.f(parcel, i);
            } else if (c == 4) {
                bArrC2 = tr60.c(parcel, i);
            } else if (c != 5) {
                tr60.u(parcel, i);
            } else {
                bArrC3 = tr60.c(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new SignResponseData(bArrC, strF, bArrC2, bArrC3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignResponseData[i];
    }
}
