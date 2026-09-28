package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;

/* JADX INFO: loaded from: classes4.dex */
public final class chl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        Boolean boolValueOf = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strF = tr60.f(parcel, i);
            } else if (c == 3) {
                int iT = tr60.t(parcel, i);
                if (iT == 0) {
                    boolValueOf = null;
                } else {
                    tr60.w(parcel, iT, 4);
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
            } else if (c == 4) {
                strF2 = tr60.f(parcel, i);
            } else if (c != 5) {
                tr60.u(parcel, i);
            } else {
                strF3 = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new AuthenticatorSelectionCriteria(boolValueOf, strF, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorSelectionCriteria[i];
    }
}
