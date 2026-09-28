package defpackage;

import android.util.Log;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jsb implements Runnable {
    public final /* synthetic */ qsb a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Map c;

    public /* synthetic */ jsb(qsb qsbVar, Throwable th, Map map) {
        this.a = qsbVar;
        this.b = th;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        esb esbVar = this.a.g;
        Thread threadCurrentThread = Thread.currentThread();
        esbVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        fub fubVar = esbVar.n;
        if (fubVar == null || !fubVar.e.get()) {
            long j = jCurrentTimeMillis / 1000;
            String strD = esbVar.d();
            if (strD == null) {
                Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                return;
            }
            bqg bqgVar = new bqg(strD, j, this.c);
            ah80 ah80Var = esbVar.m;
            String strConcat = "Persisting non-fatal event for session ".concat(strD);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strConcat, null);
            }
            ah80Var.f(this.b, threadCurrentThread, AnalyticsEvent.BI_TRACKING_KIND_ERROR, bqgVar, false);
        }
    }
}
