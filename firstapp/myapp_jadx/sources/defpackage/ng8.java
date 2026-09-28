package defpackage;

import com.sporty.android.core.model.common.Range;
import java.math.BigDecimal;
import java.net.ConnectException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawViewModel$getDrawConfig$1", f = "CommonMobileMoneyWithdrawViewModel.kt", l = {508}, m = "invokeSuspend", v = 2)
public final class ng8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qg8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng8(qg8 qg8Var, v1b<? super ng8> v1bVar) {
        super(2, v1bVar);
        this.b = qg8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ng8(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ng8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        qg8 qg8Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            xj8 xj8Var = qg8Var.d;
            this.a = 1;
            obj = xj8Var.c(this);
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
        ng50 ng50Var = (ng50) obj;
        if (ng50Var instanceof ng50.b) {
            wj8 wj8Var = (wj8) ((ng50.b) ng50Var).a;
            if (wj8Var != null) {
                List<Range> list = wj8Var.a;
                if (list != null) {
                    qg8Var.d0 = list;
                }
                BigDecimal bigDecimal = wj8Var.b;
                if (bigDecimal != null) {
                    qg8Var.b0 = bigDecimal;
                }
                BigDecimal bigDecimal2 = wj8Var.c;
                if (bigDecimal2 != null) {
                    qg8Var.c0 = bigDecimal2;
                }
            }
        } else {
            if (!(ng50Var instanceof ng50.a)) {
                uhc.a();
                return null;
            }
            boolean z = ((ng50.a) ng50Var).c instanceof ConnectException;
            ssw<c0w> sswVar = qg8Var.R;
            if (z) {
                sswVar.m(new c0w.a(3));
            } else {
                sswVar.m(new c0w.a(1));
            }
        }
        return Unit.a;
    }
}
