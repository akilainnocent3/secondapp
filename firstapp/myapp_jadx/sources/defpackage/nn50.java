package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class nn50 implements ve {
    public final HashSet a = new HashSet();

    public final void a() {
        if (fpf0.a == null) {
            fpf0.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != fpf0.a) {
            ib5.a("Must be called on the Main thread.");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((mn50) it.next()).a();
        }
    }
}
