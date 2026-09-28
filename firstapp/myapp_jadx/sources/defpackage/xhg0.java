package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.viewmodel.TournamentViewModel$initialise$1", f = "TournamentViewModel.kt", l = {112}, m = "invokeSuspend", v = 1)
public final class xhg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ aig0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhg0(aig0 aig0Var, v1b<? super xhg0> v1bVar) {
        super(2, v1bVar);
        this.b = aig0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xhg0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xhg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            aig0 aig0Var = this.b;
            if (!aig0Var.v) {
                aig0Var.v = true;
                this.a = 1;
                Object objCollect = new yzh(aig0Var.a.a(new mbc0(1), new shg0(aig0Var, null)).a, new thg0(3, null)).collect(new uhg0(aig0Var), this);
                if (objCollect != y5bVar) {
                    objCollect = Unit.a;
                }
                if (objCollect == y5bVar) {
                    return y5bVar;
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
