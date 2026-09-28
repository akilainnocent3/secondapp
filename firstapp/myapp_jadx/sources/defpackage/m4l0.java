package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class m4l0 extends r12 {
    @Override // defpackage.r12, sl0.f
    public final int l() {
        return 12451000;
    }

    @Override // defpackage.r12
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof o3l0 ? (o3l0) iInterfaceQueryLocalInterface : new w2l0(iBinder);
    }

    @Override // defpackage.r12
    public final String w() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.r12
    public final String x() {
        return "com.google.android.gms.measurement.START";
    }
}
