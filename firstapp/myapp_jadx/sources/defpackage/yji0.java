package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$initMissionContentStatus$1", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {148}, m = "invokeSuspend", v = 2)
public final class yji0 extends tje0 implements jaj<lk50<? extends List<? extends osv>>, Map<Integer, ? extends uxs>, Set<? extends Integer>, Set<? extends Integer>, v1b<? super vji0>, Object> {
    public int a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ Map c;
    public /* synthetic */ Set d;
    public /* synthetic */ Set e;
    public final /* synthetic */ gki0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yji0(v1b v1bVar, gki0 gki0Var) {
        super(5, v1bVar);
        this.f = gki0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.b;
        Map map = this.c;
        Set set = this.d;
        Set set2 = this.e;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.a = 1;
        Object objA = this.f.a(lk50Var, map, set, set2, this);
        return objA == y5bVar ? y5bVar : objA;
    }

    @Override // defpackage.jaj
    public final Object l(lk50<? extends List<? extends osv>> lk50Var, Map<Integer, ? extends uxs> map, Set<? extends Integer> set, Set<? extends Integer> set2, v1b<? super vji0> v1bVar) {
        yji0 yji0Var = new yji0(v1bVar, this.f);
        yji0Var.b = lk50Var;
        yji0Var.c = map;
        yji0Var.d = set;
        yji0Var.e = set2;
        return yji0Var.invokeSuspend(Unit.a);
    }
}
