package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.common.AZMenuViewModel$loadAzMenuData$2", f = "AZMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i1 extends tje0 implements Function2<myh<? super fq1>, v1b<? super Unit>, Object> {
    public final /* synthetic */ c1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(c1 c1Var, v1b<? super i1> v1bVar) {
        super(2, v1bVar);
        this.a = c1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i1(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super fq1> myhVar, v1b<? super Unit> v1bVar) {
        return ((i1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.D.m(new UIState.Loading(null, 1, null));
        return Unit.a;
    }
}
