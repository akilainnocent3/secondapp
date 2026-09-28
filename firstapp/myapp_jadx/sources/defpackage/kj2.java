package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.betbuilder.BetBuilderViewModel$toggleExpanded$1", f = "BetBuilderViewModel.kt", l = {114}, m = "invokeSuspend", v = 2)
public final class kj2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fj2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj2(fj2 fj2Var, v1b<? super kj2> v1bVar) {
        super(2, v1bVar);
        this.b = fj2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kj2(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kj2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(150L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fj2 fj2Var = this.b;
        ((x5a0) fj2Var.c).setValue(Boolean.valueOf(!((Boolean) ((x5a0) fj2Var.c).getValue()).booleanValue()));
        return Unit.a;
    }
}
