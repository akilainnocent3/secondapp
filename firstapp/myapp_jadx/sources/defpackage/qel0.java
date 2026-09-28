package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;

/* JADX INFO: loaded from: classes4.dex */
public final class qel0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        Bundle bundleB = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iP = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                bundleB = tr60.b(parcel, i);
            } else if (c == 2) {
                featureArr = (Feature[]) tr60.i(parcel, i, Feature.CREATOR);
            } else if (c == 3) {
                iP = tr60.p(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) tr60.e(parcel, i, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        zzk zzkVar = new zzk();
        zzkVar.a = bundleB;
        zzkVar.b = featureArr;
        zzkVar.c = iP;
        zzkVar.d = connectionTelemetryConfiguration;
        return zzkVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
