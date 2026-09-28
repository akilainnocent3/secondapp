package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class djk0 extends x3l {
    public final mcf0 B;

    public djk0(Context context, Looper looper, hs7 hs7Var, mcf0 mcf0Var, kgk0 kgk0Var, kgk0 kgk0Var2) {
        super(context, looper, 270, hs7Var, kgk0Var, kgk0Var2);
        this.B = mcf0Var;
    }

    @Override // defpackage.r12, sl0.f
    public final int l() {
        return 203400000;
    }

    @Override // defpackage.r12
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof mik0 ? (mik0) iInterfaceQueryLocalInterface : new mik0(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // defpackage.r12
    public final Feature[] s() {
        return bik0.b;
    }

    @Override // defpackage.r12
    public final Bundle t() {
        mcf0 mcf0Var = this.B;
        mcf0Var.getClass();
        Bundle bundle = new Bundle();
        String str = mcf0Var.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.r12
    public final String w() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.r12
    public final String x() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.r12
    public final boolean y() {
        return true;
    }
}
