package defpackage;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class ztj0 extends Binder {
    public final g7g.a a;

    public ztj0(g7g.a aVar) {
        this.a = aVar;
    }

    public final void a(cuj0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        g7g.this.processIntent(aVar.a).addOnCompleteListener(new liv(), new tg7(aVar));
    }
}
