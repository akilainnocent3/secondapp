package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientationRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class hjl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        boolean zL = false;
        long jR = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                jR = tr60.r(parcel, i);
            } else if (c != 6) {
                tr60.u(parcel, i);
            } else {
                zL = tr60.l(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new DeviceOrientationRequest(jR, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequest[i];
    }
}
