package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.CommonDepositViewModel$refreshAssetsInfo$1", f = "CommonDepositViewModel.kt", l = {187}, m = "invokeSuspend", v = 2)
public final class bd8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zc8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd8(zc8 zc8Var, v1b<? super bd8> v1bVar) {
        super(2, v1bVar);
        this.b = zc8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bd8(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bd8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        zc8 zc8Var = this.b;
        wwd0 wwd0Var = zc8Var.F;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var.setValue(lk50.b.a);
            lyh<lk50<AssetsInfo>> lyhVarH = zc8Var.d.h(pu0.c.a);
            this.a = 1;
            obj = bm50.p(lyhVarH, this);
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
        wwd0Var.setValue(bm50.l((lk50) obj, new ad8()));
        return Unit.a;
    }
}
