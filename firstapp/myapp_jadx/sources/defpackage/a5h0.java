package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txdetails.TxDetailsViewModel$refresh$1", f = "TxDetailsViewModel.kt", l = {275}, m = "invokeSuspend", v = 2)
public final class a5h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ e5h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5h0(e5h0 e5h0Var, v1b<? super a5h0> v1bVar) {
        super(2, v1bVar);
        this.b = e5h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a5h0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a5h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        e5h0 e5h0Var = this.b;
        wwd0 wwd0Var = e5h0Var.A;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var.setValue(tzs.b.a);
            List listK = b.k(ej5.c(o8i0.d(e5h0Var), null, null, new z4h0(e5h0Var, null), 3), kzh.d(e5h0Var.b.a(pu0.c.a), o8i0.d(e5h0Var)));
            this.a = 1;
            if (up1.c(listK, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wwd0Var.setValue(tzs.a.a);
        return Unit.a;
    }
}
