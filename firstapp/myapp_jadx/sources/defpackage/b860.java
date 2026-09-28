package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.mapper.SBBallPoolMapper$serveBallsFlow$1", f = "SBBallPoolMapper.kt", l = {}, m = "invokeSuspend", v = 1)
public final class b860 extends tje0 implements kaj<tx60, ia60, Boolean, fg60, xc60, v1b<? super w760.a>, Object> {
    public /* synthetic */ tx60 a;
    public /* synthetic */ ia60 b;
    public /* synthetic */ boolean c;
    public /* synthetic */ fg60 d;
    public /* synthetic */ xc60 e;

    public b860(v1b<? super b860> v1bVar) {
        super(6, v1bVar);
    }

    @Override // defpackage.kaj
    public final Object f(tx60 tx60Var, ia60 ia60Var, Boolean bool, fg60 fg60Var, xc60 xc60Var, v1b<? super w760.a> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        b860 b860Var = new b860(v1bVar);
        b860Var.a = tx60Var;
        b860Var.b = ia60Var;
        b860Var.c = zBooleanValue;
        b860Var.d = fg60Var;
        b860Var.e = xc60Var;
        return b860Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tx60 tx60Var = this.a;
        ia60 ia60Var = this.b;
        boolean z = this.c;
        fg60 fg60Var = this.d;
        xc60 xc60Var = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (ia60Var.c.isEmpty()) {
            return null;
        }
        return new w760.a(tx60Var, ia60Var, z, fg60Var, xc60Var);
    }
}
