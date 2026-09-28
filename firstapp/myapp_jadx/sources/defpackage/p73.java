package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.OrderWithFailUpdate;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$proceedPlaceBetResponseWithLiabilityCheckFailed$1", f = "BetSlipViewModel.kt", l = {1261}, m = "invokeSuspend", v = 2)
public final class p73 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ q73 b;
    public final /* synthetic */ BaseResponse<OrderWithFailUpdate> c;
    public final /* synthetic */ ArrayList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p73(q73 q73Var, BaseResponse baseResponse, ArrayList arrayList, v1b v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
        this.c = baseResponse;
        this.d = arrayList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p73(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        i8s i8sVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            q73 q73Var = this.b;
            j8s j8sVarE = q73Var.I.e(this.c, this.d);
            wwd0 wwd0Var = q73Var.w0;
            if (j8sVarE instanceof j8s.c) {
                i8sVar = i8s.c;
            } else {
                i8sVar = j8sVarE instanceof j8s.b ? i8s.b : i8s.a;
            }
            wwd0Var.getClass();
            wwd0Var.k(null, i8sVar);
            this.a = 1;
            if (q73Var.a2(j8sVarE, true, this) == y5bVar) {
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
