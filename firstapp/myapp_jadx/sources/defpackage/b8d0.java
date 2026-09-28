package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportypicks.presentation.SportyPicksViewModel$loadNextPage$1", f = "SportyPicksViewModel.kt", l = {166}, m = "invokeSuspend", v = 2)
public final class b8d0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c8d0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8d0(c8d0 c8d0Var, v1b<? super b8d0> v1bVar) {
        super(2, v1bVar);
        this.c = c8d0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b8d0 b8d0Var = new b8d0(this.c, v1bVar);
        b8d0Var.b = obj;
        return b8d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b8d0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            int i2 = c8d0Var.A + 1;
            this.b = v5bVar;
            this.a = 1;
            objY1 = c8d0Var.y1(i2, this);
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
                int i3 = c8d0Var.A;
                wwd0 wwd0Var = c8d0Var.w;
                c8d0Var.A = i3 + 1;
                e0b e0bVar = ((w7d0) wwd0Var.getValue()).c;
                e0b.c cVar = e0bVar instanceof e0b.c ? (e0b.c) e0bVar : null;
                if (cVar != null) {
                    wwd0Var.k(null, w7d0.a((w7d0) wwd0Var.getValue(), null, null, e0b.c.a(cVar, CollectionsKt.i0(gt00.a(ht00Var.a, c8d0Var.B), cVar.a), ht00Var.b, false, false, null, 16), 3));
                }
            }
        }
        Throwable thA = zi50.a(objY1);
        if (thA != null && w5b.e(v5bVar)) {
            itf0.a.f(thA, "Failed to load next Sporty Picks page", new Object[0]);
            e0b e0bVar2 = ((w7d0) c8d0Var.w.getValue()).c;
            e0b.c cVar2 = e0bVar2 instanceof e0b.c ? (e0b.c) e0bVar2 : null;
            if (cVar2 != null) {
                wwd0 wwd0Var2 = c8d0Var.w;
                wwd0Var2.k(null, w7d0.a((w7d0) wwd0Var2.getValue(), null, null, e0b.c.a(cVar2, null, false, false, true, null, 19), 3));
            }
        }
        return Unit.a;
    }
}
