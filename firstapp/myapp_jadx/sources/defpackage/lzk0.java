package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityTransition;

/* JADX INFO: loaded from: classes4.dex */
public final class lzk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        int iP = 0;
        int iP2 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c != 2) {
                tr60.u(parcel, i);
            } else {
                iP2 = tr60.p(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new ActivityTransition(iP, iP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransition[i];
    }
}
