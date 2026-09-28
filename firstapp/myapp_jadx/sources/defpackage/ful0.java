package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;

/* JADX INFO: loaded from: classes4.dex */
public final class ful0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        int iP = 0;
        boolean zL = false;
        boolean zL2 = false;
        long jR = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                zL = tr60.l(parcel, i);
            } else if (c == 3) {
                jR = tr60.r(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                zL2 = tr60.l(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new DeviceMetaData(iP, zL, jR, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceMetaData[i];
    }
}
