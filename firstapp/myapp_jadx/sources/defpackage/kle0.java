package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.swipebet.viewmodel.SwipeBetViewModel$onLoadMore$2", f = "SwipeBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kle0 extends tje0 implements Function2<List<? extends Event>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ile0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kle0(ile0 ile0Var, v1b<? super kle0> v1bVar) {
        super(2, v1bVar);
        this.b = ile0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kle0 kle0Var = new kle0(this.b, v1bVar);
        kle0Var.a = obj;
        return kle0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends Event> list, v1b<? super Unit> v1bVar) {
        return ((kle0) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.e.m(new nqc(list));
        return Unit.a;
    }
}
