package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.presentation.SearchViewModel$loadSuggestedQueries$1", f = "SearchViewModel.kt", l = {277}, m = "invokeSuspend", v = 2)
public final class f280 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ l280 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f280(l280 l280Var, v1b<? super f280> v1bVar) {
        super(2, v1bVar);
        this.b = l280Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f280(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f280) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        q080 q080Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        l280 l280Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            dfk dfkVar = l280Var.e;
            this.a = 1;
            objA = dfkVar.a(this);
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
            l280Var.H = (List) objA;
            wwd0 wwd0Var = l280Var.N;
            do {
                value = wwd0Var.getValue();
                q080Var = (q080) value;
            } while (!wwd0Var.g(value, q080.a(q080Var, null, l280Var.z1(q080Var.a), null, null, null, 29)));
        }
        return Unit.a;
    }
}
