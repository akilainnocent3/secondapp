package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.presentation.SearchViewModel$loadTrendingQueries$1", f = "SearchViewModel.kt", l = {302}, m = "invokeSuspend", v = 2)
public final class g280 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ l280 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g280(l280 l280Var, v1b<? super g280> v1bVar) {
        super(2, v1bVar);
        this.b = l280Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g280(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g280) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        l280 l280Var = this.b;
        wwd0 wwd0Var = l280Var.N;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, q080.a((q080) value, null, null, null, null, wt70.e.a, 15)));
            xfk xfkVar = l280Var.d;
            this.a = 1;
            objA = xfkVar.a(this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objA instanceof zi50.b)) {
            List list = (List) objA;
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, q080.a((q080) value2, null, null, null, list, null, 23)));
        }
        return Unit.a;
    }
}
