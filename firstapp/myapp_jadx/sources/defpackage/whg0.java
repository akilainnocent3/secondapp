package defpackage;

import com.sportygames.campaign.data.model.TournamentRankListResponse;
import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.viewmodel.TournamentViewModel$fetchTournamentRankList$1", f = "TournamentViewModel.kt", l = {38}, m = "invokeSuspend", v = 1)
public final class whg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ aig0 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whg0(aig0 aig0Var, long j, v1b<? super whg0> v1bVar) {
        super(2, v1bVar);
        this.b = aig0Var;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new whg0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((whg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        aig0 aig0Var = this.b;
        ssw<gzs<HTTPResponse<TournamentRankListResponse>>> sswVar = aig0Var.e;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sswVar.j(new gzs<>(wzd0.a, null, null, null, 16));
            uzm uzmVar = aig0Var.c;
            this.a = 1;
            obj = uzmVar.b(this.c, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        hk50 hk50Var = (hk50) obj;
        if (hk50Var instanceof hk50.c) {
            sswVar.j(new gzs<>(wzd0.b, ((hk50.c) hk50Var).a, null, null, 16));
        } else if (hk50Var instanceof hk50.b) {
            sswVar.j(new gzs<>(wzd0.c, null, null, (hk50.b) hk50Var, 16));
        } else {
            sswVar.j(new gzs<>(wzd0.c, null, hk50Var instanceof hk50.a ? (hk50.a) hk50Var : null, null, 16));
        }
        return Unit.a;
    }
}
