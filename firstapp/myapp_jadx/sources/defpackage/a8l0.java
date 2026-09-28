package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.internal.identity.zzh;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a8l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        DeviceOrientationRequest deviceOrientationRequest = zzh.e;
        List listJ = zzh.d;
        String strF = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                deviceOrientationRequest = (DeviceOrientationRequest) tr60.e(parcel, i, DeviceOrientationRequest.CREATOR);
            } else if (c == 2) {
                listJ = tr60.j(parcel, i, ClientIdentity.CREATOR);
            } else if (c != 3) {
                tr60.u(parcel, i);
            } else {
                strF = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzh(deviceOrientationRequest, listJ, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
