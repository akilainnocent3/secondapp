package defpackage;

import com.sportybet.plugin.event.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel$setBetBuilderTabTooltipCount$1", f = "EventViewModel.kt", l = {612}, m = "invokeSuspend", v = 2)
public final class psg extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psg(e eVar, int i, v1b<? super psg> v1bVar) {
        super(2, v1bVar);
        this.b = eVar;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new psg(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((psg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        e eVar = this.b;
        ssw<Integer> sswVar = eVar.q0;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Integer numD = sswVar.d();
            sswVar.m(numD != null ? new Integer(numD.intValue() + this.c) : null);
            m2l m2lVar = eVar.i;
            Integer numD2 = sswVar.d();
            Integer num = new Integer(numD2 != null ? numD2.intValue() : 0);
            this.a = 1;
            if (m2lVar.a.putInt("show_bet_builder_tab_tooltip_count", num, this) == y5bVar) {
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
