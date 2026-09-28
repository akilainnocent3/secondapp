package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zax;

/* JADX INFO: loaded from: classes4.dex */
public final class ojk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        Scope[] scopeArr = null;
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                iP2 = tr60.p(parcel, i);
            } else if (c == 3) {
                iP3 = tr60.p(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                scopeArr = (Scope[]) tr60.i(parcel, i, Scope.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new zax(iP, iP2, iP3, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zax[i];
    }
}
