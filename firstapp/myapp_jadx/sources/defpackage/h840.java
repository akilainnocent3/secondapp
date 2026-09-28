package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h840 implements dyo.a {
    public final nan a;
    public final List<dyo> b;
    public final int c;
    public final nan d;
    public final ww90 e;
    public final rpg f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public h840(nan nanVar, List<? extends dyo> list, int i, nan nanVar2, ww90 ww90Var, rpg rpgVar, boolean z) {
        this.a = nanVar;
        this.b = list;
        this.c = i;
        this.d = nanVar2;
        this.e = ww90Var;
        this.f = rpgVar;
        this.g = z;
    }

    @Override // dyo.a
    public final nan a() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        g840 g840Var;
        dyo dyoVar;
        if (x1bVar instanceof g840) {
            g840Var = (g840) x1bVar;
            int i = g840Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                g840Var.d = i - Integer.MIN_VALUE;
            } else {
                g840Var = new g840(this, x1bVar);
            }
        } else {
            g840Var = new g840(this, x1bVar);
        }
        Object obj = g840Var.b;
        y5b y5bVar = y5b.a;
        int i2 = g840Var.d;
        nan nanVar = this.a;
        if (i2 == 0) {
            uj50.b(obj);
            List<dyo> list = this.b;
            int i3 = this.c;
            dyo dyoVar2 = list.get(i3);
            rpg rpgVar = this.f;
            boolean z = this.g;
            h840 h840Var = new h840(nanVar, this.b, i3 + 1, this.d, this.e, rpgVar, z);
            g840Var.a = dyoVar2;
            g840Var.d = 1;
            Object objA = dyoVar2.a(h840Var, g840Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
            obj = objA;
            dyoVar = dyoVar2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dyoVar = g840Var.a;
            uj50.b(obj);
        }
        dbn dbnVar = (dbn) obj;
        nan nanVarA = dbnVar.a();
        if (nanVarA.a != nanVar.a) {
            i0b.b(dyoVar, "Interceptor '", "' cannot modify the request's context.");
            return null;
        }
        if (nanVarA.b == h5y.a) {
            i0b.b(dyoVar, "Interceptor '", "' cannot set the request's data to null.");
            return null;
        }
        if (nanVarA.c != nanVar.c) {
            i0b.b(dyoVar, "Interceptor '", "' cannot modify the request's target.");
            return null;
        }
        if (nanVarA.q == nanVar.q) {
            return dbnVar;
        }
        i0b.b(dyoVar, "Interceptor '", "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        return null;
    }
}
