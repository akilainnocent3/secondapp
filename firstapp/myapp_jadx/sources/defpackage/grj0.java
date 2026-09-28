package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawVerifyNINViewModel$initAuditStatus$2", f = "WithdrawVerifyNINViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class grj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ irj0 b;
    public final /* synthetic */ Function0<Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grj0(irj0 irj0Var, Function0<Unit> function0, v1b<? super grj0> v1bVar) {
        super(2, v1bVar);
        this.b = irj0Var;
        this.c = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new grj0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((grj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        final irj0 irj0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            lyh lyhVarH = irj0Var.b.h(new pu0.a(0));
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
        final Function0<Unit> function0 = this.c;
        bm50.l((lk50) obj, new Function1() { // from class: frj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object value;
                AssetsInfo assetsInfo = (AssetsInfo) obj2;
                wwd0 wwd0Var = irj0Var.f;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, k41.a(assetsInfo)));
                function0.invoke();
                return Unit.a;
            }
        });
        return Unit.a;
    }
}
