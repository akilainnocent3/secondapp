package defpackage;

import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$initShowGiftRedDot$2", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {245}, m = "invokeSuspend", v = 2)
public final class eki0 extends tje0 implements Function2<Pair<? extends Set<? extends Integer>, ? extends Set<? extends Integer>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gki0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eki0(v1b v1bVar, gki0 gki0Var) {
        super(2, v1bVar);
        this.c = gki0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        eki0 eki0Var = new eki0(v1bVar, this.c);
        eki0Var.b = obj;
        return eki0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Set<? extends Integer>, ? extends Set<? extends Integer>> pair, v1b<? super Unit> v1bVar) {
        return ((eki0) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Set set = (Set) pair.a;
            Set set2 = (Set) pair.b;
            if (set != null) {
                gki0 gki0Var = this.c;
                if (gki0Var.d.isLogin() && set.isEmpty() && !set2.isEmpty()) {
                    yho yhoVar = gki0Var.e;
                    wm20 wm20VarA = yhoVar.k.a(yhoVar, yho.o[10]);
                    this.b = null;
                    this.a = 1;
                    if (wm20VarA.a(this) == y5bVar) {
                        return y5bVar;
                    }
                }
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
