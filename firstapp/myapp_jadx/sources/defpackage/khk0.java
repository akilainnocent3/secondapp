package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public abstract class khk0 extends rgk0 {
    public final TaskCompletionSource b;

    public khk0(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    @Override // defpackage.nik0
    public final void a(Status status) {
        this.b.trySetException(new nm0(status));
    }

    @Override // defpackage.nik0
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // defpackage.nik0
    public final void c(kgk0 kgk0Var) throws DeadObjectException {
        try {
            h(kgk0Var);
        } catch (DeadObjectException e) {
            a(nik0.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(nik0.e(e2));
        } catch (RuntimeException e3) {
            this.b.trySetException(e3);
        }
    }

    public abstract void h(kgk0 kgk0Var);
}
