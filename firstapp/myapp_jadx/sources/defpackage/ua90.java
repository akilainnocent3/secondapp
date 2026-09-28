package defpackage;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$special$$inlined$flatMapLatest$2", f = "ShowMissionViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class ua90 extends tje0 implements gaj<myh<? super krv>, Pair<? extends nsv, ? extends Integer>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sa90 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua90(v1b v1bVar, sa90 sa90Var) {
        super(3, v1bVar);
        this.d = sa90Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super krv> myhVar, Pair<? extends nsv, ? extends Integer> pair, v1b<? super Unit> v1bVar) {
        ua90 ua90Var = new ua90(v1bVar, this.d);
        ua90Var.b = myhVar;
        ua90Var.c = pair;
        return ua90Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            Pair pair = (Pair) this.c;
            nsv nsvVar = (nsv) pair.a;
            Integer num = (Integer) pair.b;
            sa90 sa90Var = this.d;
            or60 or60Var = new or60(new qa90(nsvVar, sa90Var, num, null));
            ka90 ka90Var = new ka90(null, sa90Var);
            this.b = null;
            this.c = null;
            this.a = 1;
            h99.a(myhVar);
            Object objCollect = or60Var.collect(new g1i.a(myhVar, ka90Var), this);
            if (objCollect != y5bVar) {
                objCollect = Unit.a;
            }
            if (objCollect != y5bVar) {
                objCollect = Unit.a;
            }
            if (objCollect == y5bVar) {
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
