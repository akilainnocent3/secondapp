package defpackage;

import android.os.CancellationSignal;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class gc6 {
    public boolean a;
    public syi b;
    public CancellationSignal c;
    public boolean d;

    public final void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.d = true;
                syi syiVar = this.b;
                CancellationSignal cancellationSignal = this.c;
                if (syiVar != null) {
                    try {
                        Runnable runnable = syiVar.a;
                        Transition transition = syiVar.b;
                        Runnable runnable2 = syiVar.c;
                        if (runnable == null) {
                            transition.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
