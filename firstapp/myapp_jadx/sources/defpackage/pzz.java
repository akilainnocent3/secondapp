package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class pzz extends k5b {
    public final xre b = new xre();

    @Override // defpackage.k5b
    public final void d0(CoroutineContext coroutineContext, final Runnable runnable) {
        coroutineContext.getClass();
        runnable.getClass();
        final xre xreVar = this.b;
        xreVar.getClass();
        pfd pfdVar = fse.a;
        vcl vclVarH0 = gku.a.h0();
        if (vclVarH0.f0(coroutineContext) || xreVar.b || !xreVar.a) {
            vclVarH0.d0(coroutineContext, new Runnable() { // from class: wre
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    xre xreVar2 = xreVar;
                    if (xreVar2.d.offer(runnable2)) {
                        xreVar2.a();
                    } else {
                        ib5.a("cannot enqueue any more runnables");
                    }
                }
            });
        } else if (xreVar.d.offer(runnable)) {
            xreVar.a();
        } else {
            ib5.a("cannot enqueue any more runnables");
        }
    }

    @Override // defpackage.k5b
    public final boolean f0(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        pfd pfdVar = fse.a;
        if (gku.a.h0().f0(coroutineContext)) {
            return true;
        }
        xre xreVar = this.b;
        return !(xreVar.b || !xreVar.a);
    }
}
