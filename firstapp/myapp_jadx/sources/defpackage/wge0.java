package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wge0 implements Runnable {
    public final /* synthetic */ ehe0 a;

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledExecutorService scheduledExecutorServiceA = mku.a();
        final ehe0 ehe0Var = this.a;
        ((adl) scheduledExecutorServiceA).execute(new Runnable() { // from class: bhe0
            @Override // java.lang.Runnable
            public final void run() {
                ehe0 ehe0Var2 = ehe0Var;
                if (ehe0Var2.n) {
                    return;
                }
                ehe0Var2.d();
            }
        });
    }
}
