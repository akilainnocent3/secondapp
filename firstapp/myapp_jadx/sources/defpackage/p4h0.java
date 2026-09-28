package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$refresh$1", f = "TxDetailsV2ViewModel.kt", l = {377}, m = "invokeSuspend", v = 2)
public final class p4h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r4h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4h0(v1b v1bVar, r4h0 r4h0Var) {
        super(2, v1bVar);
        this.b = r4h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p4h0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p4h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        r4h0 r4h0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            r4h0Var.y1().setValue(t3h0.a(r4h0Var.y1().getValue(), null, tzs.b.a, null, null, null, 29));
            List<c9p> listZ1 = r4h0Var.z1();
            this.a = 1;
            if (up1.c(listZ1, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        r4h0Var.y1().setValue(t3h0.a(r4h0Var.y1().getValue(), null, tzs.a.a, null, null, null, 29));
        return Unit.a;
    }
}
