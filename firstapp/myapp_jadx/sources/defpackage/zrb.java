package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zrb {
    public final /* synthetic */ esb a;

    public zrb(esb esbVar) {
        this.a = esbVar;
    }

    public final void a(fk80 fk80Var, Thread thread, Throwable th) {
        Task taskContinueWithTask;
        esb esbVar = this.a;
        synchronized (esbVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                w390 w390VarA = v8b.a;
                if (w390VarA == null) {
                    w390VarA = ((msh) yoh.c().b(msh.class)).a();
                    w390VarA.getClass();
                    v8b.a = w390VarA;
                }
                if (w390VarA.a()) {
                    w390 w390Var = v8b.a;
                    if (w390Var == null) {
                        Intrinsics.n("sharedSessionRepository");
                        throw null;
                    }
                    w390Var.b();
                }
            } catch (Exception unused) {
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            iub iubVar = esbVar.e.a;
            final bsb bsbVar = new bsb(esbVar, jCurrentTimeMillis, th, thread, fk80Var);
            synchronized (iubVar.b) {
                taskContinueWithTask = iubVar.c.continueWithTask(iubVar.a, new Continuation() { // from class: gub
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return bsbVar.call();
                    }
                });
                iubVar.c = taskContinueWithTask;
            }
            try {
                try {
                    vrh0.a(taskContinueWithTask);
                } catch (TimeoutException unused2) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }
}
