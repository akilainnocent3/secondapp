package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.internal.identity.zzeg;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class yzk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        long jR = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList arrayListJ = null;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                locationRequest = (LocationRequest) tr60.e(parcel, i, LocationRequest.CREATOR);
            } else if (c == 5) {
                arrayListJ = tr60.j(parcel, i, ClientIdentity.CREATOR);
            } else if (c == '\b') {
                zL = tr60.l(parcel, i);
            } else if (c != '\t') {
                switch (c) {
                    case 11:
                        zL3 = tr60.l(parcel, i);
                        break;
                    case '\f':
                        zL4 = tr60.l(parcel, i);
                        break;
                    case '\r':
                        tr60.f(parcel, i);
                        break;
                    case 14:
                        jR = tr60.r(parcel, i);
                        break;
                    default:
                        tr60.u(parcel, i);
                        break;
                }
            } else {
                zL2 = tr60.l(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzeg(locationRequest, arrayListJ, zL, zL2, zL3, zL4, jR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzeg[i];
    }
}
