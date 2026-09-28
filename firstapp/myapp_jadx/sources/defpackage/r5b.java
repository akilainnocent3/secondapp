package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class r5b<T> extends jlv<T> {
    public tf4<T> m;

    @Override // defpackage.jlv, defpackage.njs
    public final void h() {
        super.h();
        tf4<T> tf4Var = this.m;
        if (tf4Var != null) {
            jvd0 jvd0Var = tf4Var.f;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            tf4Var.f = null;
            if (tf4Var.e != null) {
                return;
            }
            tf4Var.e = ej5.c(tf4Var.c, null, null, new sf4(tf4Var, null), 3);
        }
    }

    @Override // defpackage.jlv, defpackage.njs
    public final void i() {
        super.i();
        tf4<T> tf4Var = this.m;
        if (tf4Var != null) {
            if (tf4Var.f != null) {
                ib5.a("Cancel call cannot happen without a maybeRun");
                return;
            }
            j1b j1bVar = tf4Var.c;
            pfd pfdVar = fse.a;
            tf4Var.f = ej5.c(j1bVar, gku.a.h0(), null, new rf4(tf4Var, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Unit o(x1b x1bVar) {
        q5b q5bVar;
        if (x1bVar instanceof q5b) {
            q5bVar = (q5b) x1bVar;
            int i = q5bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q5bVar.c = i - Integer.MIN_VALUE;
            } else {
                q5bVar = new q5b(this, x1bVar);
            }
        } else {
            q5bVar = new q5b(this, x1bVar);
        }
        Object obj = q5bVar.a;
        y5b y5bVar = y5b.a;
        int i2 = q5bVar.c;
        if (i2 == 0 || i2 == 1) {
            uj50.b(obj);
            return Unit.a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
