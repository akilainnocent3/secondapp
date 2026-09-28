package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.PayMethodsViewModel$refresh$1", f = "PayMethodsViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
public final class b400 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ e400 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b400(e400 e400Var, v1b<? super b400> v1bVar) {
        super(2, v1bVar);
        this.b = e400Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b400(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b400) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        e400 e400Var = this.b;
        wwd0 wwd0Var = e400Var.y;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var.setValue(tzs.b.a);
            List<c9p> listY1 = e400Var.y1();
            this.a = 1;
            if (up1.c(listY1, this) == y5bVar) {
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
