package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kmk0 extends bvk0 {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ r12 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmk0(r12 r12Var, int i, Bundle bundle) {
        super(r12Var);
        this.f = r12Var;
        this.d = i;
        this.e = bundle;
    }

    @Override // defpackage.bvk0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        r12 r12Var = this.f;
        int i = this.d;
        if (i != 0) {
            r12Var.C(1, null);
            Bundle bundle = this.e;
            c(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (d()) {
                return;
            }
            r12Var.C(1, null);
            c(new ConnectionResult(8, null));
        }
    }

    public abstract void c(ConnectionResult connectionResult);

    public abstract boolean d();
}
