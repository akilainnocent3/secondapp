package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class fok0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        boolean zL = false;
        ArrayList arrayListJ = null;
        boolean zL2 = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListJ = tr60.j(parcel, i, LocationRequest.CREATOR);
            } else if (c == 2) {
                zL = tr60.l(parcel, i);
            } else if (c != 3) {
                tr60.u(parcel, i);
            } else {
                zL2 = tr60.l(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new LocationSettingsRequest(arrayListJ, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
