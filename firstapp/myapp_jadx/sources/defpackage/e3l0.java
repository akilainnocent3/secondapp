package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzf;

/* JADX INFO: loaded from: classes4.dex */
public final class e3l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                bArrC = tr60.c(parcel, i);
            } else if (c != 2) {
                tr60.u(parcel, i);
            } else {
                bArrC2 = tr60.c(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzf(bArrC, bArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}
