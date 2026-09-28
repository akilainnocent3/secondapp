package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ok10 {
    public static final qyd0 a = new qyd0(a.a);

    public static final class a extends qlr implements Function0<ow6> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ow6 invoke() {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(nk10 nk10Var, m80 m80Var, x1b x1bVar) {
        pk10 pk10Var;
        if (x1bVar instanceof pk10) {
            pk10Var = (pk10) x1bVar;
            int i = pk10Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pk10Var.b = i - Integer.MIN_VALUE;
            } else {
                pk10Var = new pk10(x1bVar);
            }
        } else {
            pk10Var = new pk10(x1bVar);
        }
        Object obj = pk10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = pk10Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return;
        }
        uj50.b(obj);
        if (!nk10Var.i().C) {
            hb5.a("establishTextInputSession called from an unattached node");
            return;
        }
        wgz wgzVarG = pkd.g(nk10Var);
        ow6 ow6Var = (ow6) pkd.f(nk10Var).Q.b(a);
        pk10Var.b = 1;
        b(wgzVarG, ow6Var, m80Var, pk10Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(wgz wgzVar, ow6 ow6Var, Function2 function2, x1b x1bVar) {
        qk10 qk10Var;
        if (x1bVar instanceof qk10) {
            qk10Var = (qk10) x1bVar;
            int i = qk10Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qk10Var.b = i - Integer.MIN_VALUE;
            } else {
                qk10Var = new qk10(x1bVar);
            }
        } else {
            qk10Var = new qk10(x1bVar);
        }
        Object obj = qk10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = qk10Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l80.a(obj);
            }
            if (i2 == 2) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return;
        }
        uj50.b(obj);
        if (ow6Var == null) {
            qk10Var.b = 1;
            wgzVar.v(function2, qk10Var);
        } else {
            qk10Var.b = 2;
            ow6Var.a(wgzVar, function2, qk10Var);
        }
    }
}
