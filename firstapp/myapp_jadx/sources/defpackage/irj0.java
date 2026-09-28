package defpackage;

import androidx.compose.runtime.m;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lirj0;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class irj0 extends j8i0 {
    public final lyz a;
    public final uy0 b;
    public final ytw c;
    public final wwd0 d;
    public final v340 e;
    public final wwd0 f;
    public final v340 i;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawVerifyNINViewModel$withdrawVerifyNINState$2", f = "WithdrawVerifyNINViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<crj0, ijf0, v1b<? super crj0>, Object> {
        public /* synthetic */ crj0 a;
        public /* synthetic */ ijf0 b;

        @Override // defpackage.gaj
        public final Object invoke(crj0 crj0Var, ijf0 ijf0Var, v1b<? super crj0> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = crj0Var;
            aVar.b = ijf0Var;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x002b  */
        /* JADX WARN: Code duplicated, block: B:16:0x002f  */
        /* JADX WARN: Code duplicated, block: B:17:0x0031  */
        /* JADX WARN: Code duplicated, block: B:20:0x0036  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            crj0 crj0Var;
            crj0.b bVar;
            crj0 crj0Var2 = this.a;
            ijf0 ijf0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String str = ijf0Var.a.b;
            if (str.length() < 11) {
                if (crj0Var2 instanceof crj0.b) {
                    crj0Var = crj0Var2;
                } else {
                    crj0Var = null;
                }
                bVar = (crj0.b) crj0Var;
                if (bVar != null) {
                    return crj0.b.a(bVar, uxs.DISABLE, null, 14);
                }
            } else {
                crj0.b bVar2 = (crj0.b) (!(crj0Var2 instanceof crj0.b) ? null : crj0Var2);
                if (str.equals(bVar2 != null ? bVar2.b : null)) {
                    if (crj0Var2 instanceof crj0.b) {
                        crj0Var = null;
                    } else {
                        crj0Var = crj0Var2;
                    }
                    bVar = (crj0.b) crj0Var;
                    if (bVar != null) {
                        return crj0.b.a(bVar, uxs.DISABLE, null, 14);
                    }
                }
            }
            return crj0Var2;
        }
    }

    public irj0(lyz lyzVar, uy0 uy0Var, final vu60 vu60Var) {
        lyzVar.getClass();
        uy0Var.getClass();
        vu60Var.getClass();
        this.a = lyzVar;
        this.b = uy0Var;
        this.c = m.b(new w4x());
        crj0.e eVar = crj0.e.a;
        wwd0 wwd0VarA = xwd0.a(eVar);
        this.d = wwd0VarA;
        this.e = e1i.e(new n1i(wwd0VarA, n95.c(new y8f0(this, 1)), new a(3, null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), eVar);
        wwd0 wwd0VarA2 = xwd0.a(i41.d.a);
        this.f = wwd0VarA2;
        this.i = e1i.b(wwd0VarA2);
        ej5.c(o8i0.d(this), null, null, new grj0(this, new Function0() { // from class: erj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Integer num;
                Object value;
                TxSuccessParams txSuccessParams = (TxSuccessParams) vu60Var.b("EXTRA_KEY_TX_SUCCESS_PARAMS");
                if (txSuccessParams != null) {
                    if (!(txSuccessParams instanceof TxSuccessParams.Bank)) {
                        txSuccessParams = null;
                    }
                    TxSuccessParams.Bank bank = (TxSuccessParams.Bank) txSuccessParams;
                    if (bank != null && (num = bank.A) != null && num.intValue() == 91) {
                        wwd0 wwd0Var = this.d;
                        do {
                            value = wwd0Var.getValue();
                        } while (!wwd0Var.g(value, crj0.f.a));
                        f00 f00Var = vgb0.a;
                        vgb0.a(AnalyticsEvent.WITHDRAWAL_REVIEW_POPUP_VIEWED);
                    }
                }
                return Unit.a;
            }
        }, null), 3);
    }

    public final void x1() {
        wwd0 wwd0Var;
        Object value;
        w4x w4xVar = (w4x) ((x5a0) this.c).getValue();
        w4xVar.getClass();
        ((x5a0) w4xVar.c).setValue(new ijf0("", 0L, 6));
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, crj0.e.a));
    }

    public final void y1() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new crj0.b(0)));
    }
}
