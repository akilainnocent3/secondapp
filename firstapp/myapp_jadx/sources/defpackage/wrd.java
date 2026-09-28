package defpackage;

import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wrd extends n000 {
    public final l0e.a G;
    public final w9e H;
    public final iod.a I;
    public final mod J;
    public final i9e K;
    public final x0l L;
    public final hg30.a M;
    public final u290 N;
    public final ga00 O;
    public String P;
    public BankTradeResponse Q;
    public int R;
    public jvd0 S;
    public jvd0 T;
    public final mpe0 U;
    public hg30 V;
    public final mpe0 W;
    public boolean X;

    @c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseViewModel$saveSuccessfulDeposit$2", f = "DepositBaseViewModel.kt", l = {264}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return wrd.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wrd wrdVar = wrd.this;
                x0l x0lVar = wrdVar.L;
                int i2 = wrdVar.R;
                this.a = 1;
                x0lVar.getClass();
                if (x0lVar.a.putInt("last_successful_deposit_channel_id", new Integer(i2), this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrd(vu60 vu60Var, uqm uqmVar, psm psmVar, v800 v800Var, l0e.a aVar, w9e w9eVar, iod.a aVar2, mod modVar, i9e i9eVar, x0l x0lVar, hg30.a aVar3, u290 u290Var) {
        super(vu60Var, psmVar, uqmVar, w9eVar, v800Var);
        v4c v4cVar = v4c.a;
        vu60Var.getClass();
        uqmVar.getClass();
        psmVar.getClass();
        v800Var.getClass();
        w9eVar.getClass();
        u290Var.getClass();
        this.G = aVar;
        this.H = w9eVar;
        this.I = aVar2;
        this.J = modVar;
        this.K = i9eVar;
        this.L = x0lVar;
        this.M = aVar3;
        this.N = u290Var;
        this.O = ga00.DEPOSIT;
        this.U = hwr.b(new Function0() { // from class: nrd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                wrd wrdVar = this.a;
                l0e.a aVar4 = wrdVar.G;
                qxd0<gtp> qxd0VarJ1 = wrdVar.J1();
                et7 et7VarD = o8i0.d(wrdVar);
                h400 h400Var = (h400) wrdVar.A.getValue();
                c100 c100VarN1 = wrdVar.N1();
                aVar4.getClass();
                h400Var.getClass();
                c100VarN1.getClass();
                jak jakVar = aVar4.a;
                v4c v4cVar2 = v4c.a;
                return new l0e(qxd0VarJ1, et7VarD, h400Var, c100VarN1, jakVar, aVar4.b, aVar4.c, aVar4.d, aVar4.f, aVar4.e);
            }
        });
        this.W = hwr.b(new ord(this, 0));
    }

    public static void B2(wrd wrdVar, String str, BankTradeData bankTradeData, String str2, String str3, String str4, int i) {
        String strU;
        if ((i & 1) != 0) {
            str = null;
        }
        BankTradeData bankTradeData2 = (i & 2) != 0 ? null : bankTradeData;
        if ((i & 8) != 0) {
            str2 = null;
        }
        String str5 = (i & 16) != 0 ? null : str3;
        if ((i & 32) != 0) {
            str4 = null;
        }
        if (str != null) {
            strU = bjb0.U(Long.parseLong(str), Locale.US);
        } else {
            strU = bankTradeData2 != null ? bjb0.U(bankTradeData2.payAmount, Locale.US) : bjb0.U(new BigDecimal("").multiply(BigDecimal.valueOf(10000L)).longValue(), Locale.US);
        }
        String str6 = strU;
        if (str2 == null) {
            str2 = wrdVar.P;
        }
        String str7 = str2;
        if (str4 == null) {
            str4 = "0.00";
        }
        wrdVar.h2(bankTradeData2, str6, str5, str7, str4);
    }

    @Override // defpackage.n000
    public final ga00 P1() {
        return this.O;
    }

    @Override // defpackage.n000
    public void U1() {
        super.U1();
        qxd0<dh30> qxd0VarN2 = n2();
        if (qxd0VarN2 != null) {
            et7 et7VarD = o8i0.d(this);
            hg30.a aVar = this.M;
            aVar.getClass();
            hg30 hg30Var = new hg30(et7VarD, aVar.a, aVar.b);
            this.V = hg30Var;
            fg30 fg30Var = new fg30();
            String strE1 = E1();
            strE1.getClass();
            fg30Var.d = strE1;
            A2(fg30Var);
            hg30Var.e = qxd0VarN2;
            if (fg30Var.a.isEmpty()) {
                hg30Var.a(new lg30(hg30Var, fg30Var.d, fg30Var.c, null));
            } else {
                hg30Var.b(ch30.a(fg30Var, new ig30(1, hg30Var, hg30.class, "onItemSelected", "onItemSelected(Lcom/sporty/android/compose/ui/component/quick_input/QuickInputUI;)Lkotlinx/coroutines/Job;", 8)));
            }
            ej5.c(o8i0.d(this), null, null, new rrd(this, null), 3);
        }
        jvd0 jvd0Var = this.T;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.T = ej5.c(o8i0.d(this), null, null, new trd(this, null), 3);
        qxd0<String> qxd0VarJ2 = j2();
        if (qxd0VarJ2 != null) {
            ej5.c(o8i0.d(this), null, null, new urd(this, qxd0VarJ2, null), 3);
        }
        kzh.d(new g1i((lyh) ((iod) this.W.getValue()).d.getValue(), new prd(this, null)), o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new qrd(this, null), 3);
    }

    @Override // defpackage.n000
    public final void Y1() {
        r2();
    }

    @Override // defpackage.n000
    public final void a2() {
        this.X = true;
        super.a2();
        c0e c0eVar = this.J.a;
        if (c0eVar.a()) {
            return;
        }
        c0eVar.b();
    }

    public qxd0<vc8> i2() {
        return null;
    }

    public qxd0<String> j2() {
        return null;
    }

    public qxd0<uxs> k2() {
        return null;
    }

    public wvd l2(String str) {
        str.getClass();
        return new wvd.a(str, N1().a);
    }

    @Override // defpackage.n000
    /* JADX INFO: renamed from: m2, reason: merged with bridge method [inline-methods] */
    public final l0e O1() {
        return (l0e) this.U.getValue();
    }

    public qxd0<dh30> n2() {
        return null;
    }

    public final void p2(BankTradeData bankTradeData) {
        bankTradeData.getClass();
        O1().j(String.valueOf(bankTradeData.payAmount));
        qxd0<vc8> qxd0VarI2 = i2();
        if (qxd0VarI2 != null) {
            vc8 vc8VarInvoke = qxd0VarI2.a.invoke();
            vc8VarInvoke.getClass();
            qxd0VarI2.a(vc8.a(vc8VarInvoke, null, false, new mqv(O1().j), false, 11));
        }
    }

    public void q2(BankTradeData bankTradeData) {
        bankTradeData.getClass();
        qxd0<vc8> qxd0VarI2 = i2();
        if (qxd0VarI2 != null) {
            vc8 vc8VarInvoke = qxd0VarI2.a.invoke();
            vc8VarInvoke.getClass();
            qxd0VarI2.a(vc8.a(vc8VarInvoke, null, true, null, false, 13));
        }
    }

    public final void r2() {
        ej5.c(o8i0.d(this), null, null, new srd(this, null), 3);
    }

    public final void s2(ijf0 ijf0Var) {
        ((x5a0) this.f).setValue(ijf0Var);
        nk0 nk0Var = ijf0Var.a;
        hg30 hg30Var = this.V;
        if (hg30Var != null) {
            hg30Var.a(new ng30(nk0Var.b, hg30Var, null));
        }
        String str = nk0Var.b;
        jvd0 jvd0Var = this.S;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.S = ej5.c(o8i0.d(this), null, null, new vrd(str, this, null), 3);
    }

    public final void t2(uc8 uc8Var) {
        if (uc8Var.equals(uc8.a.a)) {
            qxd0<vc8> qxd0VarI2 = i2();
            if (qxd0VarI2 != null) {
                vc8 vc8VarInvoke = qxd0VarI2.a.invoke();
                vc8VarInvoke.getClass();
                qxd0VarI2.a(vc8.a(vc8VarInvoke, null, false, null, false, 14));
                return;
            }
            return;
        }
        if (uc8Var.equals(uc8.e.a)) {
            v2();
            return;
        }
        if (uc8Var.equals(uc8.f.a)) {
            v2();
            x1(new h000.f(0));
            return;
        }
        if (uc8Var.equals(uc8.d.a)) {
            qxd0<vc8> qxd0VarI3 = i2();
            if (qxd0VarI3 != null) {
                vc8 vc8VarInvoke2 = qxd0VarI3.a.invoke();
                vc8VarInvoke2.getClass();
                qxd0VarI3.a(vc8.a(vc8VarInvoke2, null, false, null, false, 11));
            }
            X1();
            return;
        }
        if (uc8Var.equals(uc8.c.a)) {
            u2();
            X1();
        } else if (uc8Var.equals(uc8.b.a)) {
            u2();
        } else {
            uhc.a();
        }
    }

    public final void u2() {
        qxd0<vc8> qxd0VarI2 = i2();
        if (qxd0VarI2 != null) {
            vc8 vc8VarInvoke = qxd0VarI2.a.invoke();
            vc8VarInvoke.getClass();
            qxd0VarI2.a(vc8.a(vc8VarInvoke, null, false, null, false, 7));
        }
    }

    public final void v2() {
        qxd0<vc8> qxd0VarI2 = i2();
        if (qxd0VarI2 != null) {
            vc8 vc8VarInvoke = qxd0VarI2.a.invoke();
            vc8VarInvoke.getClass();
            qxd0VarI2.a(vc8.a(vc8VarInvoke, null, false, null, false, 13));
        }
    }

    public final void w2(boolean z) {
        qxd0<uxs> qxd0VarK2;
        this.i = z;
        qxd0<uxs> qxd0VarK3 = k2();
        if ((qxd0VarK3 != null ? qxd0VarK3.a.invoke() : null) == uxs.LOADING || (qxd0VarK2 = k2()) == null) {
            return;
        }
        qxd0VarK2.a(z ? uxs.ENABLE : uxs.DISABLE);
    }

    public boolean x2(x7e x7eVar) {
        x7eVar.getClass();
        return false;
    }

    public final void y2() {
        qxd0<uxs> qxd0VarK2 = k2();
        if (qxd0VarK2 != null) {
            qxd0VarK2.a(this.i ? uxs.ENABLE : uxs.DISABLE);
        }
    }

    public final void z2() {
        f00 f00Var = vgb0.a;
        vgb0.a(AnalyticsEvent.DEPOSIT);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public void A2(fg30 fg30Var) {
    }

    public void o2(x7e.b.d dVar) {
    }
}
