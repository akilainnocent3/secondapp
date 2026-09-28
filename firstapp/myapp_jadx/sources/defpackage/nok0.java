package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationSettingsStates;

/* JADX INFO: loaded from: classes4.dex */
public final class nok0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        boolean zL5 = false;
        boolean zL6 = false;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zL = tr60.l(parcel, i);
                    break;
                case 2:
                    zL2 = tr60.l(parcel, i);
                    break;
                case 3:
                    zL3 = tr60.l(parcel, i);
                    break;
                case 4:
                    zL4 = tr60.l(parcel, i);
                    break;
                case 5:
                    zL5 = tr60.l(parcel, i);
                    break;
                case 6:
                    zL6 = tr60.l(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new LocationSettingsStates(zL, zL2, zL3, zL4, zL5, zL6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
