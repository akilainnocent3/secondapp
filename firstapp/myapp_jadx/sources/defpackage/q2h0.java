package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.compose.txDetails.TxDetailsCommonWidgetKt$TxDetailsStatusContent$5$1", f = "TxDetailsCommonWidget.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q2h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ytw<Boolean> b;
    public final /* synthetic */ Function0<Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2h0(v1b v1bVar, ytw ytwVar, Function0 function0, boolean z) {
        super(2, v1bVar);
        this.a = z;
        this.b = ytwVar;
        this.c = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q2h0(v1bVar, this.b, this.c, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q2h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a) {
            ytw<Boolean> ytwVar = this.b;
            if (!ytwVar.getValue().booleanValue()) {
                ytwVar.setValue(Boolean.TRUE);
                this.c.invoke();
            }
        }
        return Unit.a;
    }
}
