package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zan;

/* JADX INFO: loaded from: classes4.dex */
public final class hjk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        int iP = 0;
        Parcel parcel2 = null;
        zan zanVar = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                int iT = tr60.t(parcel, i);
                int iDataPosition = parcel.dataPosition();
                if (iT == 0) {
                    parcel2 = null;
                } else {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.appendFrom(parcel, iDataPosition, iT);
                    parcel.setDataPosition(iDataPosition + iT);
                    parcel2 = parcelObtain;
                }
            } else if (c != 3) {
                tr60.u(parcel, i);
            } else {
                zanVar = (zan) tr60.e(parcel, i, zan.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new SafeParcelResponse(iP, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
