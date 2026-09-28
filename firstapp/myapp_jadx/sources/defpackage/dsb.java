package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes4.dex */
public final class dsb implements SuccessContinuation<aj80, Void> {
    public final /* synthetic */ esb.a a;

    public dsb(esb.a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> then(aj80 aj80Var) {
        if (aj80Var == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        esb esbVar = esb.this;
        yrb yrbVar = esb.r;
        esbVar.f();
        esbVar.m.g(esbVar.e.a, null);
        esbVar.q.trySetResult(null);
        return Tasks.forResult(null);
    }
}
