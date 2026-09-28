package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes4.dex */
public final class asb implements SuccessContinuation<aj80, Void> {
    public final /* synthetic */ bsb a;

    public asb(bsb bsbVar, String str) {
        this.a = bsbVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> then(aj80 aj80Var) {
        aj80 aj80Var2 = aj80Var;
        esb esbVar = this.a.e;
        if (aj80Var2 == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        yrb yrbVar = esb.r;
        return Tasks.whenAll((Task<?>[]) new Task[]{esbVar.f(), esbVar.m.g(esbVar.e.a, null)});
    }
}
