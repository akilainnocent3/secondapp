package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class u9i0 implements la50, rdd {
    public final a840 a;
    public final nan b;
    public final vbn c;
    public final s9s d;
    public final c9p e;

    public u9i0(a840 a840Var, nan nanVar, vbn vbnVar, s9s s9sVar, c9p c9pVar) {
        this.a = a840Var;
        this.b = nanVar;
        this.c = vbnVar;
        this.d = s9sVar;
        this.e = c9pVar;
    }

    @Override // defpackage.la50
    public final Object a(a840.d dVar) {
        s9s s9sVar = this.d;
        if (s9sVar == null) {
            return Unit.a;
        }
        Object objA = sbs.a(s9sVar, dVar);
        return objA == y5b.a ? objA : Unit.a;
    }

    @Override // defpackage.la50
    public final void b() {
        vbn vbnVar = this.c;
        if (vbnVar.getView().isAttachedToWindow()) {
            return;
        }
        w9i0 w9i0VarA = x9i0.a(vbnVar.getView());
        u9i0 u9i0Var = w9i0VarA.d;
        if (u9i0Var != null) {
            u9i0Var.d();
        }
        w9i0VarA.d = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    public final void d() {
        this.e.cancel((CancellationException) null);
        vbn vbnVar = this.c;
        boolean z = vbnVar instanceof hbs;
        s9s s9sVar = this.d;
        if (z && s9sVar != null) {
            s9sVar.d(vbnVar);
        }
        if (s9sVar != null) {
            s9sVar.d(this);
        }
    }

    @Override // defpackage.rdd
    public final void onDestroy(ibs ibsVar) {
        w9i0 w9i0VarA = x9i0.a(this.c.getView());
        synchronized (w9i0VarA) {
            try {
                jvd0 jvd0Var = w9i0VarA.c;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
                q2l q2lVar = q2l.a;
                pfd pfdVar = fse.a;
                w9i0VarA.c = ej5.c(q2lVar, gku.a.h0(), null, new v9i0(w9i0VarA, null), 2);
                w9i0VarA.b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.la50
    public final void start() {
        s9s s9sVar = this.d;
        if (s9sVar != null) {
            s9sVar.a(this);
        }
        vbn vbnVar = this.c;
        if ((vbnVar instanceof hbs) && s9sVar != null) {
            vbn vbnVar2 = vbnVar;
            s9sVar.d(vbnVar2);
            s9sVar.a(vbnVar2);
        }
        w9i0 w9i0VarA = x9i0.a(vbnVar.getView());
        u9i0 u9i0Var = w9i0VarA.d;
        if (u9i0Var != null) {
            u9i0Var.d();
        }
        w9i0VarA.d = this;
    }
}
