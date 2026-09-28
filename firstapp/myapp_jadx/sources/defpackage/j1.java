package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.common.AZMenuViewModel$loadAzMenuData$3", f = "AZMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j1 extends tje0 implements Function2<fq1, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ c1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(c1 c1Var, v1b<? super j1> v1bVar) {
        super(2, v1bVar);
        this.b = c1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j1 j1Var = new j1(this.b, v1bVar);
        j1Var.a = obj;
        return j1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(fq1 fq1Var, v1b<? super Unit> v1bVar) {
        return ((j1) create(fq1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        fq1 fq1Var = (fq1) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.D.m(new UIState.Success(fq1Var));
        return Unit.a;
    }
}
