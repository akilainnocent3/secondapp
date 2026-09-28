package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pingpong.views.PingPongFragment$showCampaignToast$1", f = "PingPongFragment.kt", l = {5738}, m = "invokeSuspend", v = 1)
public final class k510 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m410 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k510(m410 m410Var, v1b<? super k510> v1bVar) {
        super(2, v1bVar);
        this.b = m410Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k510(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k510) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(1800L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        m410 m410Var = this.b;
        if (m410Var.getActivity() != null) {
            ixi ixiVar = (ixi) m410Var.b;
            if (ixiVar != null) {
                ixiVar.J.setVisibility(8);
            }
            ixi ixiVar2 = (ixi) m410Var.b;
            if (ixiVar2 != null) {
                ixiVar2.J.setClickable(false);
            }
        }
        return Unit.a;
    }
}
