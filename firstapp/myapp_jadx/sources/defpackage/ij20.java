package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getLeagueFilterOptions$1", f = "PreMatchSectionUseCase.kt", l = {74}, m = "invokeSuspend", v = 2)
public final class ij20 extends tje0 implements Function2<myh<? super List<? extends String>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ij20 ij20Var = new ij20(2, v1bVar);
        ij20Var.b = obj;
        return ij20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends String>> myhVar, v1b<? super Unit> v1bVar) {
        return ((ij20) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            m2g m2gVar = m2g.a;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(m2gVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
