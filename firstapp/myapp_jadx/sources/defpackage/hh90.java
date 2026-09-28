package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.SidePanelViewModel$initData$1", f = "SidePanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hh90 extends tje0 implements gaj<uf00<? extends zg90.c>, List<? extends x690>, v1b<? super Pair<? extends List<? extends x690>, ? extends uf00<? extends zg90.c>>>, Object> {
    public /* synthetic */ uf00 a;
    public /* synthetic */ List b;

    @Override // defpackage.gaj
    public final Object invoke(uf00<? extends zg90.c> uf00Var, List<? extends x690> list, v1b<? super Pair<? extends List<? extends x690>, ? extends uf00<? extends zg90.c>>> v1bVar) {
        hh90 hh90Var = new hh90(3, v1bVar);
        hh90Var.a = uf00Var;
        hh90Var.b = list;
        return hh90Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        uf00 uf00Var = this.a;
        List list = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(list, uf00Var);
    }
}
