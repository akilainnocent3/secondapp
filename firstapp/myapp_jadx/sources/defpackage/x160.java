package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class x160 {
    public final tuw a = uuw.a();
    public final dm8 b = em8.a();

    public abstract Object a(x1b x1bVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) throws Throwable {
        w160 w160Var;
        quw quwVar;
        Throwable th;
        quw quwVar2;
        x160 x160Var;
        if (x1bVar instanceof w160) {
            w160Var = (w160) x1bVar;
            int i = w160Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                w160Var.e = i - Integer.MIN_VALUE;
            } else {
                w160Var = new w160(this, x1bVar);
            }
        } else {
            w160Var = new w160(this, x1bVar);
        }
        Object obj = w160Var.c;
        y5b y5bVar = y5b.a;
        int i2 = w160Var.e;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                if (this.b.isCompleted()) {
                    return Unit.a;
                }
                w160Var.a = this;
                quwVar = this.a;
                w160Var.b = quwVar;
                w160Var.e = 1;
                if (quwVar.d(w160Var) != y5bVar) {
                }
                return y5bVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quwVar2 = w160Var.b;
                x160Var = w160Var.a;
                try {
                    uj50.b(obj);
                    dm8 dm8Var = x160Var.b;
                    Unit unit = Unit.a;
                    dm8Var.R(unit);
                    quwVar2.f(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    quwVar2.f(null);
                    throw th;
                }
            }
            quw quwVar3 = w160Var.b;
            x160 x160Var2 = w160Var.a;
            uj50.b(obj);
            quwVar = quwVar3;
            this = x160Var2;
            if (this.b.isCompleted()) {
                Unit unit2 = Unit.a;
                quwVar.f(null);
                return unit2;
            }
            w160Var.a = this;
            w160Var.b = quwVar;
            w160Var.e = 2;
            if (this.a(w160Var) != y5bVar) {
                x160Var = this;
                quwVar2 = quwVar;
                dm8 dm8Var2 = x160Var.b;
                Unit unit3 = Unit.a;
                dm8Var2.R(unit3);
                quwVar2.f(null);
                return unit3;
            }
            return y5bVar;
        } catch (Throwable th3) {
            quw quwVar4 = quwVar;
            th = th3;
            quwVar2 = quwVar4;
            quwVar2.f(null);
            throw th;
        }
    }
}
