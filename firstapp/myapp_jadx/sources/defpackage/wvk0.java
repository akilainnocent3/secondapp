package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class wvk0 extends mtk0 implements zvk0 {
    public wvk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.zvk0
    public final void O(Bundle bundle) {
        Parcel parcelB = b();
        ptk0.b(parcelB, bundle);
        d(parcelB, 1);
    }
}
