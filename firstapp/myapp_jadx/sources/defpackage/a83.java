package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$setOutcomesData$1", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a83 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ q73 a;
    public final /* synthetic */ List<Event> b;
    public final /* synthetic */ List<Selection> c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a83(q73 q73Var, List list, List list2, long j, long j2, v1b v1bVar) {
        super(2, v1bVar);
        aak aakVar = aak.a;
        this.a = q73Var;
        this.b = list;
        this.c = list2;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        aak aakVar = aak.a;
        return new a83(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a83) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.s0.m(new t7z.c(this.b, aak.f, this.c, this.d, this.e));
        return Unit.a;
    }
}
