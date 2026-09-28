package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;

/* JADX INFO: loaded from: classes4.dex */
public final class mgk0 implements Runnable {
    public final /* synthetic */ ConnectionResult a;
    public final /* synthetic */ ngk0 b;

    public mgk0(ngk0 ngk0Var, ConnectionResult connectionResult) {
        this.b = ngk0Var;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        ngk0 ngk0Var = this.b;
        sl0.f fVar = ngk0Var.a;
        kgk0 kgk0Var = (kgk0) ngk0Var.f.y.get(ngk0Var.b);
        if (kgk0Var == null) {
            return;
        }
        ConnectionResult connectionResult = this.a;
        if (connectionResult.b != 0) {
            kgk0Var.p(connectionResult, null);
            return;
        }
        ngk0Var.e = true;
        if (fVar.f()) {
            if (!ngk0Var.e || (bVar = ngk0Var.c) == null) {
                return;
            }
            fVar.i(bVar, ngk0Var.d);
            return;
        }
        try {
            fVar.i(null, fVar.h());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            fVar.b("Failed to get service from broker.");
            kgk0Var.p(new ConnectionResult(10), null);
        }
    }
}
