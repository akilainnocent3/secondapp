package defpackage;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$4", f = "ShowMissionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ja90 extends tje0 implements gaj<nsv, Integer, v1b<? super Pair<? extends nsv, ? extends Integer>>, Object> {
    public /* synthetic */ nsv a;
    public /* synthetic */ Integer b;

    @Override // defpackage.gaj
    public final Object invoke(nsv nsvVar, Integer num, v1b<? super Pair<? extends nsv, ? extends Integer>> v1bVar) {
        ja90 ja90Var = new ja90(3, v1bVar);
        ja90Var.a = nsvVar;
        ja90Var.b = num;
        return ja90Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        nsv nsvVar = this.a;
        Integer num = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(nsvVar, num);
    }
}
