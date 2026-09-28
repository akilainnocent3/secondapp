package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class bsb implements Callable<Task<Void>> {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ fk80 d;
    public final /* synthetic */ esb e;

    public bsb(esb esbVar, long j, Throwable th, Thread thread, fk80 fk80Var) {
        this.e = esbVar;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = fk80Var;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() {
        long j = this.a;
        long j2 = j / 1000;
        esb esbVar = this.e;
        String strD = esbVar.d();
        if (strD == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        esbVar.c.a();
        ah80 ah80Var = esbVar.m;
        String strConcat = "Persisting fatal event for session ".concat(strD);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        ah80Var.f(this.b, this.c, "crash", new bqg(strD, j2, o2gVar), true);
        try {
            if (!new File(esbVar.g.c, ".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        fk80 fk80Var = this.d;
        esbVar.a(false, fk80Var, false);
        esbVar.b(Boolean.FALSE, new km5().a);
        return !esbVar.b.a() ? Tasks.forResult(null) : fk80Var.h.get().getTask().onSuccessTask(esbVar.e.a, new asb(this, strD));
    }
}
