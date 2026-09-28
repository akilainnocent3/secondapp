package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedViewModel$onShareCode$2", f = "ForYouFeedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gsi extends tje0 implements Function2<uha0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bsi b;
    public final /* synthetic */ kl00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsi(bsi bsiVar, kl00 kl00Var, v1b<? super gsi> v1bVar) {
        super(2, v1bVar);
        this.b = bsiVar;
        this.c = kl00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gsi gsiVar = new gsi(this.b, this.c, v1bVar);
        gsiVar.a = obj;
        return gsiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(uha0 uha0Var, v1b<? super Unit> v1bVar) {
        return ((gsi) create(uha0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        uha0 uha0Var = (uha0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wuw<qqi> wuwVar = this.b.B;
        qqi.h hVar = new qqi.h(this.c.g, new z7a0.d(uha0Var.a, uha0Var.c, uha0Var.b, new Integer(10000), null, null, 48));
        wuwVar.getClass();
        wuwVar.a.c(hVar);
        return Unit.a;
    }
}
