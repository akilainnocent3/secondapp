package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public final class ahl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrD = null;
        int[] iArrD2 = null;
        boolean zL = false;
        boolean zL2 = false;
        int iP = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) tr60.e(parcel, i, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zL = tr60.l(parcel, i);
                    break;
                case 3:
                    zL2 = tr60.l(parcel, i);
                    break;
                case 4:
                    iArrD = tr60.d(parcel, i);
                    break;
                case 5:
                    iP = tr60.p(parcel, i);
                    break;
                case 6:
                    iArrD2 = tr60.d(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zL, zL2, iArrD, iP, iArrD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
