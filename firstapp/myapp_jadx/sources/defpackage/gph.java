package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class gph {
    public final qsb a;

    public gph(qsb qsbVar) {
        this.a = qsbVar;
    }

    public static gph a() {
        gph gphVar = (gph) yoh.c().b(gph.class);
        if (gphVar != null) {
            return gphVar;
        }
        bmy.a("FirebaseCrashlytics component is not present.");
        return null;
    }

    public final void b(Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        Map map = Collections.EMPTY_MAP;
        qsb qsbVar = this.a;
        qsbVar.o.a.a(new jsb(qsbVar, th, map));
    }
}
