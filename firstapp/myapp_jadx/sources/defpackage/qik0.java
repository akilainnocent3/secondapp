package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes4.dex */
public final class qik0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        ConnectionResult connectionResult = null;
        int iP = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                connectionResult = (ConnectionResult) tr60.e(parcel, i, ConnectionResult.CREATOR);
            } else if (c != 3) {
                tr60.u(parcel, i);
            } else {
                zavVar = (zav) tr60.e(parcel, i, zav.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new zak(iP, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
