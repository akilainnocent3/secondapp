package defpackage;

import com.sportybet.plugin.realsports.data.Tournament;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.quickmarket.QuickMarketUseCase$addQuickMarketData$2", f = "QuickMarketUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ti30 extends tje0 implements Function2<lk50<? extends List<? extends Tournament>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ h1j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti30(h1j h1jVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = h1jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ti30 ti30Var = new ti30(this.b, v1bVar);
        ti30Var.a = obj;
        return ti30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends Tournament>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((ti30) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
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
