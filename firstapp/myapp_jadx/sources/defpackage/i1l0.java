package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.identity.ClientIdentity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class i1l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        ArrayList arrayListJ = null;
        ClientIdentity clientIdentity = null;
        int iP = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 3) {
                strF = tr60.f(parcel, i);
            } else if (c == 4) {
                strF2 = tr60.f(parcel, i);
            } else if (c == 6) {
                strF3 = tr60.f(parcel, i);
            } else if (c == 7) {
                clientIdentity = (ClientIdentity) tr60.e(parcel, i, ClientIdentity.CREATOR);
            } else if (c != '\b') {
                tr60.u(parcel, i);
            } else {
                arrayListJ = tr60.j(parcel, i, Feature.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new ClientIdentity(iP, strF, strF2, strF3, arrayListJ, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
