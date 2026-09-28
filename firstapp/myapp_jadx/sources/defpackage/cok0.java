package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzag;

/* JADX INFO: loaded from: classes4.dex */
public final class cok0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                tr60.u(parcel, i);
            } else {
                strF = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzag(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzag[i];
    }
}
