package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;

/* JADX INFO: loaded from: classes4.dex */
public final class frk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        int iP = 0;
        String strF2 = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                iP = tr60.p(parcel, i);
            } else if (c == 3) {
                strF = tr60.f(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                strF2 = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new ChannelIdValue(iP, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChannelIdValue[i];
    }
}
