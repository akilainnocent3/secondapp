package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class r90 implements tk10, v5b {
    public final View a;
    public final ujf0 b;
    public final v5b c;
    public final AtomicReference d = new AtomicReference(null);

    public r90(View view, ujf0 ujf0Var, v5b v5bVar) {
        this.a = view;
        this.b = ujf0Var;
        this.c = v5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sk10
    public final void a(p6s p6sVar, x1b x1bVar) {
        n90 n90Var;
        if (x1bVar instanceof n90) {
            n90Var = (n90) x1bVar;
            int i = n90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n90Var.c = i - Integer.MIN_VALUE;
            } else {
                n90Var = new n90(this, x1bVar);
            }
        } else {
            n90Var = new n90(this, x1bVar);
        }
        Object obj = n90Var.a;
        y5b y5bVar = y5b.a;
        int i2 = n90Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            p90 p90Var = new p90(p6sVar, this);
            q90 q90Var = new q90(this, null);
            n90Var.c = 1;
            if (w5b.d(new ug80(p90Var, this.d, q90Var, null), n90Var) == y5bVar) {
                return;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            uj50.b(obj);
        }
        fkd.a();
    }

    @Override // defpackage.v5b
    public final CoroutineContext getCoroutineContext() {
        return this.c.getCoroutineContext();
    }

    @Override // defpackage.sk10
    public final View getView() {
        return this.a;
    }
}
