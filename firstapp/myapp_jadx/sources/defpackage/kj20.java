package defpackage;

import com.sportybet.plugin.realsports.data.Categories;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getLeagueFilterOptions$3", f = "PreMatchSectionUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kj20 extends tje0 implements Function2<lk50<? extends List<Categories>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ k4b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj20(k4b k4bVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = k4bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kj20 kj20Var = new kj20(this.b, v1bVar);
        kj20Var.a = obj;
        return kj20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<Categories>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((kj20) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.invoke(lk50Var);
        return Unit.a;
    }
}
