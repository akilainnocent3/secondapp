package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class xkk0 {
    public static final mgt a = new mgt("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        zkk0.a(context).b();
        Set set = x4l.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((x4l) it.next()).getClass();
            bl0.a();
            return;
        }
        synchronized (y4l.G) {
            try {
                y4l y4lVar = y4l.H;
                if (y4lVar != null) {
                    y4lVar.w.incrementAndGet();
                    ljk0 ljk0Var = y4lVar.C;
                    ljk0Var.sendMessageAtFrontOfQueue(ljk0Var.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
