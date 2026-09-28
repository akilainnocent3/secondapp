package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportypicks.presentation.SportyPicksViewModel$loadMarkets$1", f = "SportyPicksViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
public final class a8d0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c8d0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8d0(c8d0 c8d0Var, v1b<? super a8d0> v1bVar) {
        super(2, v1bVar);
        this.c = c8d0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a8d0 a8d0Var = new a8d0(this.c, v1bVar);
        a8d0Var.b = obj;
        return a8d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a8d0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objY1;
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        c8d0 c8d0Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            this.b = v5bVar;
            this.a = 1;
            objY1 = c8d0Var.y1(1, this);
            if (objY1 == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objY1 = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objY1 instanceof zi50.b)) {
            ht00 ht00Var = (ht00) objY1;
            if (w5b.e(v5bVar)) {
                wwd0 wwd0Var = c8d0Var.w;
                wwd0Var.k(null, w7d0.a((w7d0) wwd0Var.getValue(), null, null, c8d0Var.x1(ht00Var), 3));
            }
        }
        Throwable thA = zi50.a(objY1);
        if (thA != null && w5b.e(v5bVar)) {
            itf0.a.f(thA, "Failed to load Sporty Picks data", new Object[0]);
            wwd0 wwd0Var2 = c8d0Var.w;
            wwd0Var2.k(null, w7d0.a((w7d0) wwd0Var2.getValue(), null, null, e0b.b.a, 3));
        }
        return Unit.a;
    }
}
