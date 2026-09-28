package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchTodayEvents$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pim extends tje0 implements Function2<List<? extends Event>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ iim b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pim(iim iimVar, v1b<? super pim> v1bVar) {
        super(2, v1bVar);
        this.b = iimVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pim pimVar = new pim(this.b, v1bVar);
        pimVar.a = obj;
        return pimVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends Event> list, v1b<? super Unit> v1bVar) {
        return ((pim) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.q0.m(new UIState.Success(list));
        return Unit.a;
    }
}
