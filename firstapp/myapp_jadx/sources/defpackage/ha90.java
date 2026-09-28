package defpackage;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$1", f = "ShowMissionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ha90 extends tje0 implements gaj<nsv, i53, v1b<? super Pair<? extends nsv, ? extends i53>>, Object> {
    public /* synthetic */ nsv a;
    public /* synthetic */ i53 b;

    @Override // defpackage.gaj
    public final Object invoke(nsv nsvVar, i53 i53Var, v1b<? super Pair<? extends nsv, ? extends i53>> v1bVar) {
        ha90 ha90Var = new ha90(3, v1bVar);
        ha90Var.a = nsvVar;
        ha90Var.b = i53Var;
        return ha90Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        nsv nsvVar = this.a;
        i53 i53Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(nsvVar, i53Var);
    }
}
