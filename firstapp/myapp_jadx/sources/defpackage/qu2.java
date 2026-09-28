package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.domain.betitem.BetItemImpl$clearSelectionFromCache$1", f = "BetItemImpl.kt", l = {522}, m = "invokeSuspend", v = 2)
public final class qu2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pu2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu2(pu2 pu2Var, v1b<? super qu2> v1bVar) {
        super(2, v1bVar);
        this.c = pu2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qu2 qu2Var = new qu2(this.c, v1bVar);
        qu2Var.b = obj;
        return qu2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qu2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                pu2 pu2Var = this.c;
                zi50.a aVar = zi50.b;
                hv2 hv2Var = pu2Var.e;
                this.b = null;
                this.a = 1;
                if (hv2Var.b(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.a(a320.a("clearSelectionFromCache failed: ", thA), new Object[0]);
        }
        return Unit.a;
    }
}
