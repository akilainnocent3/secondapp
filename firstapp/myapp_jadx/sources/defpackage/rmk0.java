package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.location.LastLocationRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class rmk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        ClientIdentity clientIdentity = null;
        int iP = 0;
        boolean zL = false;
        long jR = Long.MAX_VALUE;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                jR = tr60.r(parcel, i);
            } else if (c == 2) {
                iP = tr60.p(parcel, i);
            } else if (c == 3) {
                zL = tr60.l(parcel, i);
            } else if (c != 5) {
                tr60.u(parcel, i);
            } else {
                clientIdentity = (ClientIdentity) tr60.e(parcel, i, ClientIdentity.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new LastLocationRequest(jR, iP, zL, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LastLocationRequest[i];
    }
}
