package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class kkd implements zny, pxj0.a {
    public static final String D = jgt.g("DelayMetCommandHandler");
    public final iwd0 A;
    public final k5b B;
    public volatile jvd0 C;
    public final Context a;
    public final int b;
    public final ivj0 c;
    public final upe0 d;
    public final ouj0 e;
    public final Object f;
    public int i;
    public final wd80 v;
    public final Executor w;
    public PowerManager.WakeLock y;
    public boolean z;

    public kkd(Context context, int i, upe0 upe0Var, iwd0 iwd0Var) {
        this.a = context;
        this.b = i;
        this.d = upe0Var;
        this.c = iwd0Var.a;
        this.A = iwd0Var;
        vjg0 vjg0Var = upe0Var.e.j;
        p5f0 p5f0Var = upe0Var.b;
        this.v = p5f0Var.c();
        this.w = p5f0Var.a();
        this.B = p5f0Var.b();
        this.e = new ouj0(vjg0Var);
        this.z = false;
        this.i = 0;
        this.f = new Object();
    }

    @Override // pxj0.a
    public final void a(ivj0 ivj0Var) {
        jgt.e().a(D, "Exceeded time limits on execution for " + ivj0Var);
        ((xd80) this.v).execute(new ikd(this));
    }

    public final void b() {
        synchronized (this.f) {
            try {
                if (this.C != null) {
                    this.C.cancel((CancellationException) null);
                }
                this.d.c.a(this.c);
                PowerManager.WakeLock wakeLock = this.y;
                if (wakeLock != null && wakeLock.isHeld()) {
                    jgt.e().a(D, "Releasing wakelock " + this.y + "for WorkSpec " + this.c);
                    this.y.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        String str = this.c.a;
        this.y = ywi0.a(this.a, str + " (" + this.b + ")");
        jgt jgtVarE = jgt.e();
        String str2 = D;
        jgtVarE.a(str2, "Acquiring wakelock " + this.y + "for WorkSpec " + str);
        this.y.acquire();
        owj0 owj0VarJ = this.d.e.c.C().j(str);
        if (owj0VarJ == null) {
            ((xd80) this.v).execute(new ikd(this));
            return;
        }
        boolean zC = owj0VarJ.c();
        this.z = zC;
        if (zC) {
            this.C = quj0.a(this.e, owj0VarJ, this.B, this);
            return;
        }
        jgt.e().a(str2, "No constraints for ".concat(str));
        ((xd80) this.v).execute(new jkd(this));
    }

    @Override // defpackage.zny
    public final void d(owj0 owj0Var, rxa rxaVar) {
        boolean z = rxaVar instanceof rxa.a;
        wd80 wd80Var = this.v;
        if (z) {
            ((xd80) wd80Var).execute(new jkd(this));
        } else {
            ((xd80) wd80Var).execute(new ikd(this));
        }
    }

    public final void e(boolean z) {
        jgt jgtVarE = jgt.e();
        StringBuilder sb = new StringBuilder("onExecuted ");
        ivj0 ivj0Var = this.c;
        sb.append(ivj0Var);
        sb.append(", ");
        sb.append(z);
        jgtVarE.a(D, sb.toString());
        b();
        int i = this.b;
        upe0 upe0Var = this.d;
        Executor executor = this.w;
        Context context = this.a;
        if (z) {
            String str = k88.f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            k88.d(intent, ivj0Var);
            executor.execute(new upe0.b(i, upe0Var, intent));
        }
        if (this.z) {
            String str2 = k88.f;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor.execute(new upe0.b(i, upe0Var, intent2));
        }
    }
}
