package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.presentation.LastHeroStandingBottomSheetKt$LastHeroStandingBottomSheet$5$1", f = "LastHeroStandingBottomSheet.kt", l = {}, m = "invokeSuspend", v = 1)
public final class pnr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Long a;
    public final /* synthetic */ lei0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnr(Long l, lei0 lei0Var, v1b<? super pnr> v1bVar) {
        super(2, v1bVar);
        this.a = l;
        this.b = lei0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pnr(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pnr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String strValueOf;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Long l = this.a;
        if (l != null && (strValueOf = String.valueOf(l.longValue())) != null) {
            lei0 lei0Var = this.b;
            ej5.c(o8i0.d(lei0Var), null, null, new dei0(lei0Var, strValueOf, null), 3);
        }
        return Unit.a;
    }
}
