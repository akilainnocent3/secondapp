package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$onShareCode$2", f = "PersonalCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bl00 extends tje0 implements Function2<uha0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ el00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl00(v1b v1bVar, el00 el00Var) {
        super(2, v1bVar);
        this.b = el00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bl00 bl00Var = new bl00(v1bVar, this.b);
        bl00Var.a = obj;
        return bl00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(uha0 uha0Var, v1b<? super Unit> v1bVar) {
        return ((bl00) create(uha0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        uha0 uha0Var = (uha0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wuw<z7a0> wuwVar = this.b.z;
        z7a0.d dVar = new z7a0.d(uha0Var.a, uha0Var.c, uha0Var.b, new Integer(10000), null, null, 48);
        wuwVar.getClass();
        wuwVar.a.c(dVar);
        return Unit.a;
    }
}
