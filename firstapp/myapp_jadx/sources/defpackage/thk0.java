package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class thk0 extends nik0 {
    public final vkk0 b;

    public thk0(vkk0 vkk0Var) {
        super(1);
        this.b = vkk0Var;
    }

    @Override // defpackage.nik0
    public final void a(Status status) {
        try {
            this.b.i(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.nik0
    public final void b(Exception exc) {
        try {
            this.b.i(new Status(10, tug.a(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.nik0
    public final void c(kgk0 kgk0Var) throws DeadObjectException {
        try {
            vkk0 vkk0Var = this.b;
            try {
                try {
                    vkk0Var.h(kgk0Var.b);
                } catch (DeadObjectException e) {
                    vkk0Var.i(new Status(8, e.getLocalizedMessage(), null, null));
                    throw e;
                }
            } catch (RemoteException e2) {
                vkk0Var.i(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }

    @Override // defpackage.nik0
    public final void d(tfk0 tfk0Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = tfk0Var.a;
        vkk0 vkk0Var = this.b;
        map.put(vkk0Var, boolValueOf);
        vkk0Var.a(new rfk0(tfk0Var, vkk0Var));
    }
}
