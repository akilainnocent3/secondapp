package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class t5l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        ArrayList arrayListJ = null;
        String strF = null;
        ArrayList arrayListJ2 = null;
        String strF2 = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListJ = tr60.j(parcel, i, ActivityTransition.CREATOR);
            } else if (c == 2) {
                strF = tr60.f(parcel, i);
            } else if (c == 3) {
                arrayListJ2 = tr60.j(parcel, i, ClientIdentity.CREATOR);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                strF2 = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new ActivityTransitionRequest(arrayListJ, strF, arrayListJ2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}
