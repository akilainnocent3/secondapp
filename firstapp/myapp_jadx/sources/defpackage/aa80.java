package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.viewmodel.SelfExclusionConfirmViewModel$onConfirmButtonClick$1", f = "SelfExclusionConfirmViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class aa80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ z980 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa80(z980 z980Var, v1b<? super aa80> v1bVar) {
        super(2, v1bVar);
        this.a = z980Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new aa80(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((aa80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.c.m(z980.a.C1380a.a);
        return Unit.a;
    }
}
