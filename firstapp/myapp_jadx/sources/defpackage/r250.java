package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class r250 {
    public final int a;
    public final yja b;
    public float c;

    public r250(int i, yja yjaVar) {
        this.a = i;
        this.b = yjaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(float f, x1b x1bVar) {
        q250 q250Var;
        if (x1bVar instanceof q250) {
            q250Var = (q250) x1bVar;
            int i = q250Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q250Var.c = i - Integer.MIN_VALUE;
            } else {
                q250Var = new q250(this, x1bVar);
            }
        } else {
            q250Var = new q250(this, x1bVar);
        }
        Object objInvoke = q250Var.a;
        y5b y5bVar = y5b.a;
        int i2 = q250Var.c;
        if (i2 == 0) {
            uj50.b(objInvoke);
            Float f2 = new Float(f);
            q250Var.c = 1;
            objInvoke = this.b.invoke(f2, q250Var);
            if (objInvoke == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objInvoke);
        }
        this.c += ((Number) objInvoke).floatValue();
        return Unit.a;
    }
}
