package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.presentation.SearchViewModel$uiState$1", f = "SearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m280 extends tje0 implements Function2<myh<? super q080>, v1b<? super Unit>, Object> {
    public final /* synthetic */ l280 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m280(l280 l280Var, v1b<? super m280> v1bVar) {
        super(2, v1bVar);
        this.a = l280Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m280(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super q080> myhVar, v1b<? super Unit> v1bVar) {
        return ((m280) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.y1();
        return Unit.a;
    }
}
