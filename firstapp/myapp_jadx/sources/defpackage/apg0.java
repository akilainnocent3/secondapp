package defpackage;

import android.content.Intent;
import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity$initViewModel$7", f = "TradingActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class apg0 extends tje0 implements Function2<h7l, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TradingActivity b;

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((irj0) this.receiver).y1();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apg0(TradingActivity tradingActivity, v1b<? super apg0> v1bVar) {
        super(2, v1bVar);
        this.b = tradingActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        apg0 apg0Var = new apg0(this.b, v1bVar);
        apg0Var.a = obj;
        return apg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h7l h7lVar, v1b<? super Unit> v1bVar) {
        return ((apg0) create(h7lVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        h7l h7lVar = (h7l) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        final TradingActivity tradingActivity = this.b;
        k7l k7lVar = tradingActivity.A;
        if (k7lVar != null) {
            k7lVar.a(tradingActivity, h7lVar, new Function1() { // from class: zog0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    String str = (String) obj2;
                    TradingActivity tradingActivity2 = tradingActivity;
                    ee<Intent> eeVar = tradingActivity2.W;
                    q900 q900Var = tradingActivity2.v;
                    if (q900Var != null) {
                        eeVar.b(q900Var.a(tradingActivity2, str));
                        return Unit.a;
                    }
                    Intrinsics.n("paymentSecurityUtil");
                    throw null;
                }
            }, new a(0, (irj0) tradingActivity.D.getValue(), irj0.class, "showNINDialog", "showNINDialog()V", 0));
            return Unit.a;
        }
        Intrinsics.n("grayListSideFlowActionHandler");
        throw null;
    }
}
