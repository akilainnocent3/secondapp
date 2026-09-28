package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class itl0 extends x3l {
    @Override // defpackage.r12, sl0.f
    public final int l() {
        return 12451000;
    }

    @Override // defpackage.r12
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterfaceQueryLocalInterface instanceof o5l0 ? (o5l0) iInterfaceQueryLocalInterface : new o5l0(iBinder);
    }

    @Override // defpackage.r12
    public final Feature[] s() {
        return dnk0.b;
    }

    @Override // defpackage.r12
    public final String w() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // defpackage.r12
    public final String x() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
