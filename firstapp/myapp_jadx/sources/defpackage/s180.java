package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.presentation.SearchViewModel$1", f = "SearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s180 extends tje0 implements Function2<List<? extends String>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ l280 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s180(l280 l280Var, v1b<? super s180> v1bVar) {
        super(2, v1bVar);
        this.b = l280Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s180 s180Var = new s180(this.b, v1bVar);
        s180Var.a = obj;
        return s180Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, v1b<? super Unit> v1bVar) {
        return ((s180) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.N;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, q080.a((q080) value, null, null, CollectionsKt.t0(list, 3), null, null, 27)));
        return Unit.a;
    }
}
