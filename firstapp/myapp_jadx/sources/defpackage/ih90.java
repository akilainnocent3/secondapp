package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.SidePanelViewModel$initData$2", f = "SidePanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ih90 extends tje0 implements gaj<Pair<? extends List<? extends x690>, ? extends uf00<? extends zg90.c>>, List<? extends x690>, v1b<? super zg90.a>, Object> {
    public /* synthetic */ Pair a;
    public /* synthetic */ List b;
    public final /* synthetic */ zg90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih90(zg90 zg90Var, v1b<? super ih90> v1bVar) {
        super(3, v1bVar);
        this.c = zg90Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(Pair<? extends List<? extends x690>, ? extends uf00<? extends zg90.c>> pair, List<? extends x690> list, v1b<? super zg90.a> v1bVar) {
        ih90 ih90Var = new ih90(this.c, v1bVar);
        ih90Var.a = pair;
        ih90Var.b = list;
        return ih90Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Pair pair = this.a;
        List list = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List list2 = (List) pair.a;
        uf00 uf00Var = (uf00) pair.b;
        zg90 zg90Var = this.c;
        wwd0 wwd0Var = zg90Var.v;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, list));
        return new zg90.a(a4h.f(CollectionsKt.t0(list2, 5)), zg90.z1(uf00Var, a4h.f(list), ((ae90) zg90Var.w.getValue()).a));
    }
}
