package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.WDViewModel$getOldCMSPagesFlow$2", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class kvi0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ yui0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvi0(yui0 yui0Var, v1b<? super kvi0> v1bVar) {
        super(2, v1bVar);
        this.a = yui0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kvi0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kvi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.f.setLanguageCode(((b5) sjj.b().c.d.a(jq40.a(b5.class), null, null)).getLanguageCode());
        return Unit.a;
    }
}
