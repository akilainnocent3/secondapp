package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.compose.betbuilder.handler.BetBuilderMarketHandlerImpl$init$2", f = "BetBuilderMarketHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eh2 extends tje0 implements Function2<Map<String, ? extends gh2>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ fh2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh2(fh2 fh2Var, v1b<? super eh2> v1bVar) {
        super(2, v1bVar);
        this.b = fh2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        eh2 eh2Var = new eh2(this.b, v1bVar);
        eh2Var.a = obj;
        return eh2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Map<String, ? extends gh2> map, v1b<? super Unit> v1bVar) {
        return ((eh2) create(map, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.a.setValue(map);
        return Unit.a;
    }
}
