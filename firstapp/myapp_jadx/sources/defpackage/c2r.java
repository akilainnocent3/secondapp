package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$6", f = "LNPlaceBetViewModel.kt", l = {674}, m = "invokeSuspend", v = 2)
public final class c2r extends tje0 implements Function2<fgr, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f2r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2r(v1b v1bVar, f2r f2rVar) {
        super(2, v1bVar);
        this.c = f2rVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        c2r c2rVar = new c2r(v1bVar, this.c);
        c2rVar.b = obj;
        return c2rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(fgr fgrVar, v1b<? super Unit> v1bVar) {
        return ((c2r) create(fgrVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        fgr fgrVar = (fgr) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<r0r> ku90Var = this.c.m0;
            r0r.e eVar = new r0r.e(fgrVar);
            this.b = null;
            this.a = 1;
            if (ku90Var.a.emit(eVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
