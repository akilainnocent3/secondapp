package defpackage;

import android.os.BadParcelableException;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class gs0 {
    public final p1l0 a;

    public interface a extends rbl0 {
    }

    public gs0(p1l0 p1l0Var) {
        this.a = p1l0Var;
    }

    public final void a(a aVar) {
        p1l0 p1l0Var = this.a;
        ArrayList arrayList = p1l0Var.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (aVar.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            k0l0 k0l0Var = new k0l0(aVar);
            arrayList.add(new Pair(aVar, k0l0Var));
            if (p1l0Var.f != null) {
                try {
                    p1l0Var.f.registerOnMeasurementEventListener(k0l0Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            p1l0Var.c(new c0l0(p1l0Var, k0l0Var));
        }
    }
}
