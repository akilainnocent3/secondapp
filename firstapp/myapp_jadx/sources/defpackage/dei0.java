package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.vip.data.LastHeroStandingListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.viewmodel.VipViewModel$fetchLastHeroStandingList$1", f = "VipViewModel.kt", l = {117}, m = "invokeSuspend", v = 1)
public final class dei0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lei0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dei0(lei0 lei0Var, String str, v1b<? super dei0> v1bVar) {
        super(2, v1bVar);
        this.b = lei0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dei0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dei0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lei0 lei0Var = this.b;
        ssw<izs<HTTPResponse<List<LastHeroStandingListResponse>>>> sswVar = lei0Var.y;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sswVar.j(new izs<>(uzd0.a, null, null, null, 30));
            f0n f0nVar = lei0Var.c;
            this.a = 1;
            obj = f0nVar.e(this.c, this);
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
        kk50 kk50Var = (kk50) obj;
        if (kk50Var instanceof kk50.c) {
            sswVar.j(new izs<>(uzd0.b, ((kk50.c) kk50Var).a, null, null, 28));
        } else if (kk50Var instanceof kk50.a) {
            sswVar.j(new izs<>(uzd0.c, null, (kk50.a) kk50Var, null, 26));
        } else {
            kk50.b bVar = kk50.b.a;
            if (!Intrinsics.g(kk50Var, bVar)) {
                uhc.a();
                return null;
            }
            sswVar.j(new izs<>(uzd0.c, null, null, bVar, 22));
        }
        return Unit.a;
    }
}
