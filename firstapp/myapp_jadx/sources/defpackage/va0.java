package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes8.dex */
public final class va0 {
    public static final bdl a;

    public static final class a {
        public static final bdl a = new bdl(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            bdl bdlVar = a.a;
            if (bdlVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = bdlVar;
        } catch (Throwable th) {
            throw otg.c(th);
        }
    }

    public static qm70 a() {
        bdl bdlVar = a;
        if (bdlVar != null) {
            return bdlVar;
        }
        bmy.a("scheduler == null");
        return null;
    }
}
