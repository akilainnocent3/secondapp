package defpackage;

import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$initShowGiftRedDot$1", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dki0 extends tje0 implements gaj<Set<? extends Integer>, Set<? extends Integer>, v1b<? super Pair<? extends Set<? extends Integer>, ? extends Set<? extends Integer>>>, Object> {
    public /* synthetic */ Set a;
    public /* synthetic */ Set b;

    @Override // defpackage.gaj
    public final Object invoke(Set<? extends Integer> set, Set<? extends Integer> set2, v1b<? super Pair<? extends Set<? extends Integer>, ? extends Set<? extends Integer>>> v1bVar) {
        dki0 dki0Var = new dki0(3, v1bVar);
        dki0Var.a = set;
        dki0Var.b = set2;
        return dki0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Set set = this.a;
        Set set2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(set, set2);
    }
}
