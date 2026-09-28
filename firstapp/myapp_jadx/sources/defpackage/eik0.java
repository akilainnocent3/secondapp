package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class eik0 extends rgk0 {
    public final jhk0 b;
    public final TaskCompletionSource c;
    public final om0 d;

    public eik0(int i, jhk0 jhk0Var, TaskCompletionSource taskCompletionSource, om0 om0Var) {
        super(i);
        this.c = taskCompletionSource;
        this.b = jhk0Var;
        this.d = om0Var;
        if (i == 2 && jhk0Var.b) {
            hb5.a("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.nik0
    public final void a(Status status) {
        this.d.getClass();
        this.c.trySetException(status.c != null ? new ag50(status) : new nm0(status));
    }

    @Override // defpackage.nik0
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // defpackage.nik0
    public final void c(kgk0 kgk0Var) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            jhk0 jhk0Var = this.b;
            jhk0Var.d.a.accept(kgk0Var.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(nik0.e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    @Override // defpackage.nik0
    public final void d(tfk0 tfk0Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = tfk0Var.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new sfk0(tfk0Var, taskCompletionSource));
    }

    @Override // defpackage.rgk0
    public final boolean f(kgk0 kgk0Var) {
        return this.b.b;
    }

    @Override // defpackage.rgk0
    public final Feature[] g(kgk0 kgk0Var) {
        return this.b.a;
    }
}
