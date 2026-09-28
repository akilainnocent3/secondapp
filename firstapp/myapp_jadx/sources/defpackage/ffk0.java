package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ffk0 extends bfk0 {
    public final /* synthetic */ odk0 i;

    public ffk0(odk0 odk0Var) {
        Objects.requireNonNull(odk0Var);
        this.i = odk0Var;
    }

    @Override // defpackage.bfk0
    public final void b() {
        odk0 odk0Var = this.i;
        synchronized (odk0Var.f) {
            try {
                if (odk0Var.l.get() > 0 && odk0Var.l.decrementAndGet() > 0) {
                    odk0Var.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                if (odk0Var.n != null) {
                    odk0Var.b.c("Unbind from service.", new Object[0]);
                    odk0Var.a.unbindService(odk0Var.m);
                    odk0Var.g = false;
                    odk0Var.n = null;
                    odk0Var.m = null;
                }
                HashSet hashSet = odk0Var.e;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(odk0Var.c).concat(" : Binder has died.")));
                }
                hashSet.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
