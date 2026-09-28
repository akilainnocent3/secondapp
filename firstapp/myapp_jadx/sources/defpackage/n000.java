package defpackage;

import androidx.compose.runtime.m;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n000 extends j8i0 {
    public final mpe0 A;
    public final boolean B;
    public final boolean C;
    public Function0<Unit> D;
    public final mpe0 E;
    public boolean F;
    public final xsm a;
    public final psm b;
    public final uqm c;
    public final w9e d;
    public final v800 e;
    public final ytw f;
    public boolean i;
    public final ku90<h000> v;
    public final ku90 w;
    public final mpe0 y;
    public final mpe0 z;

    public static final class a {
        public final c100 a;
        public final h400 b;
        public final String c;
        public final String d;

        public a(c100 c100Var, h400 h400Var, String str, String str2) {
            str2.getClass();
            this.a = c100Var;
            this.b = h400Var;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PayConfig(payChannel=");
            sb.append(this.a);
            sb.append(", payProvider=");
            sb.append(this.b);
            sb.append(", hintAlertMethodId=");
            return kwi.a(sb, this.c, ", hintsMethodId=", this.d, ")");
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.base.PayBaseViewModel$emitSideEffect$1", f = "PayBaseViewModel.kt", l = {248}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ h000 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h000 h000Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = h000Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return n000.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<h000> ku90Var = n000.this.v;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.globalpay.base.PayBaseViewModel$startPullingConfig$1", f = "PayBaseViewModel.kt", l = {291}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return n000.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            n000 n000Var = n000.this;
            if (i == 0) {
                uj50.b(obj);
                n000Var.e2();
                x200 x200VarO1 = n000Var.O1();
                boolean z = n000Var.C;
                this.a = 1;
                obj = x200VarO1.g(z, this);
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
            if (((Boolean) obj).booleanValue()) {
                qxd0<UiText> qxd0VarA1 = n000Var.A1();
                if (qxd0VarA1 != null) {
                    qxd0VarA1.a(new ResourceUiText(R.string.page_payment__min_vnum, kotlin.collections.a.c(n000Var.O1().c().c())));
                }
            } else {
                n000Var.x1(h000.a.a);
            }
            n000Var.T1();
            return Unit.a;
        }
    }

    public n000(final vu60 vu60Var, psm psmVar, uqm uqmVar, w9e w9eVar, v800 v800Var) {
        v4c v4cVar = v4c.a;
        vu60Var.getClass();
        psmVar.getClass();
        uqmVar.getClass();
        w9eVar.getClass();
        v800Var.getClass();
        this.a = v4cVar;
        this.b = psmVar;
        this.c = uqmVar;
        this.d = w9eVar;
        this.e = v800Var;
        this.f = m.b(new ijf0((String) null, 0L, 7));
        ku90<h000> ku90Var = new ku90<>();
        this.v = ku90Var;
        this.w = ku90Var;
        this.y = hwr.b(new Function0() { // from class: i000
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (bag) vu60Var.b("ENTRANCE_ARG");
            }
        });
        this.z = hwr.b(new Function0() { // from class: j000
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.H1().a;
            }
        });
        this.A = hwr.b(new Function0() { // from class: k000
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.H1().b;
            }
        });
        this.B = true;
        this.C = true;
        this.E = hwr.b(new l000(this, 0));
        hwr.b(new m000(this, 0));
        w9eVar.a = o8i0.d(this);
    }

    public static void d2(n000 n000Var) {
        r700 r700Var;
        qxd0<wg8> qxd0VarG1 = n000Var.G1();
        if (qxd0VarG1 != null) {
            wg8 wg8VarInvoke = qxd0VarG1.a.invoke();
            wg8VarInvoke.getClass();
            UiText uiTextF1 = n000Var.F1();
            int iOrdinal = n000Var.P1().ordinal();
            if (iOrdinal == 0) {
                r700Var = r700.a;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return;
                }
                r700Var = r700.b;
            }
            qxd0VarG1.a(wg8.a(wg8VarInvoke, false, null, new k9h(uiTextF1, r700Var, null), null, null, 59));
        }
    }

    public qxd0<UiText> A1() {
        return null;
    }

    public qxd0<UiText> B1() {
        return null;
    }

    public qxd0<UiText> C1() {
        return null;
    }

    public qxd0<UiText> D1() {
        return null;
    }

    public final String E1() {
        return (String) this.E.getValue();
    }

    public UiText F1() {
        return vch0.d(N1().b);
    }

    public qxd0<wg8> G1() {
        return null;
    }

    public abstract a H1();

    public abstract qxd0<List<String>> I1();

    public qxd0<gtp> J1() {
        return null;
    }

    public qxd0<Integer> K1() {
        return null;
    }

    public abstract Integer L1();

    public final String M1() {
        String phoneNumber = this.c.getPhoneNumber();
        phoneNumber.getClass();
        return vtu.a(phoneNumber);
    }

    public final c100 N1() {
        return (c100) this.z.getValue();
    }

    public abstract x200 O1();

    public abstract ga00 P1();

    public qxd0<UiText> Q1() {
        return null;
    }

    public qxd0<UiText> R1() {
        return null;
    }

    public abstract qxd0<UiText> S1();

    public final void T1() {
        qxd0<wg8> qxd0VarG1 = G1();
        if (qxd0VarG1 != null) {
            wg8 wg8VarInvoke = qxd0VarG1.a.invoke();
            wg8VarInvoke.getClass();
            qxd0VarG1.a(wg8.a(wg8VarInvoke, false, null, null, null, null, 62));
        }
    }

    public void U1() {
        qxd0<UiText> qxd0VarQ1 = Q1();
        if (qxd0VarQ1 != null) {
            qxd0VarQ1.a(vch0.d(this.b.M()));
        }
        qxd0<UiText> qxd0VarR1 = R1();
        if (qxd0VarR1 != null) {
            qxd0VarR1.a(vch0.d(M1()));
        }
        qxd0<UiText> qxd0VarB1 = B1();
        xsm xsmVar = this.a;
        if (qxd0VarB1 != null) {
            qxd0VarB1.a(new ResourceUiText(R.string.common_functions__amount_label, kotlin.collections.a.c(xsmVar.f())));
        }
        qxd0<UiText> qxd0VarC1 = C1();
        if (qxd0VarC1 != null) {
            qxd0VarC1.a(new ResourceUiText(R.string.common_functions__balance_label, kotlin.collections.a.c(xsmVar.f())));
        }
        Integer numL1 = L1();
        if (numL1 != null) {
            int iIntValue = numL1.intValue();
            qxd0<Integer> qxd0VarK1 = K1();
            if (qxd0VarK1 != null) {
                qxd0VarK1.a(Integer.valueOf(iIntValue));
            }
        }
        ej5.c(o8i0.d(this), null, null, new o000(this, null), 3);
        O1().h("0");
    }

    public final void V1(vg8 vg8Var) {
        aqg0 aqg0Var;
        vg8Var.getClass();
        if (vg8Var.equals(vg8.g.a)) {
            qxd0<wg8> qxd0VarG1 = G1();
            if (qxd0VarG1 != null) {
                wg8 wg8VarInvoke = qxd0VarG1.a.invoke();
                wg8VarInvoke.getClass();
                qxd0VarG1.a(wg8.a(wg8VarInvoke, false, null, null, null, null, 61));
                return;
            }
            return;
        }
        if (vg8Var.equals(vg8.d.a)) {
            W1();
            return;
        }
        if (vg8Var.equals(vg8.e.a)) {
            x1(new h000.f(0));
            return;
        }
        if (vg8Var.equals(vg8.f.a)) {
            v800 v800Var = this.e;
            et7 et7Var = v800Var.m;
            if (et7Var != null) {
                ej5.c(et7Var, null, null, new t800(v800Var, null), 3);
                return;
            }
            return;
        }
        if (vg8Var.equals(vg8.c.a)) {
            qxd0<wg8> qxd0VarG2 = G1();
            if (qxd0VarG2 != null) {
                wg8 wg8VarInvoke2 = qxd0VarG2.a.invoke();
                wg8VarInvoke2.getClass();
                qxd0VarG2.a(wg8.a(wg8VarInvoke2, false, null, null, null, null, 59));
                return;
            }
            return;
        }
        if (vg8Var.equals(vg8.i.a)) {
            Z1();
            x1(new h000.c(wae.HOME));
            return;
        }
        if (vg8Var.equals(vg8.j.a)) {
            Z1();
            Boolean boolValueOf = Boolean.valueOf(P1() == ga00.DEPOSIT);
            int iOrdinal = P1().ordinal();
            if (iOrdinal == 0) {
                aqg0Var = aqg0.e.c;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return;
                }
                aqg0Var = aqg0.j.c;
            }
            x1(new h000.f(boolValueOf, aqg0Var, true));
            return;
        }
        if (vg8Var.equals(vg8.h.a)) {
            Z1();
            return;
        }
        if (vg8Var.equals(vg8.a.a)) {
            Y1();
            return;
        }
        if (vg8Var.equals(vg8.b.a)) {
            qxd0<wg8> qxd0VarG3 = G1();
            if (qxd0VarG3 != null) {
                wg8 wg8VarInvoke3 = qxd0VarG3.a.invoke();
                wg8VarInvoke3.getClass();
                qxd0VarG3.a(wg8.a(wg8VarInvoke3, false, null, null, null, null, 47));
                return;
            }
            return;
        }
        if (vg8Var.equals(vg8.l.a)) {
            qxd0<wg8> qxd0VarG4 = G1();
            if (qxd0VarG4 != null) {
                wg8 wg8VarInvoke4 = qxd0VarG4.a.invoke();
                wg8VarInvoke4.getClass();
                qxd0VarG4.a(wg8.a(wg8VarInvoke4, false, null, null, null, null, 31));
                return;
            }
            return;
        }
        if (!vg8Var.equals(vg8.k.a)) {
            uhc.a();
            return;
        }
        qxd0<wg8> qxd0VarG5 = G1();
        if (qxd0VarG5 != null) {
            wg8 wg8VarInvoke5 = qxd0VarG5.a.invoke();
            wg8VarInvoke5.getClass();
            qxd0VarG5.a(wg8.a(wg8VarInvoke5, false, null, null, null, null, 31));
        }
        x1(new h000.c(wae.CONTACT_US));
    }

    public final void X1() {
        x1(h000.d.a);
    }

    public final void Z1() {
        qxd0<wg8> qxd0VarG1 = G1();
        if (qxd0VarG1 != null) {
            wg8 wg8VarInvoke = qxd0VarG1.a.invoke();
            wg8VarInvoke.getClass();
            qxd0VarG1.a(wg8.a(wg8VarInvoke, false, null, null, null, null, 55));
        }
    }

    public void a2() {
        if (this.B) {
            g2();
        }
    }

    public abstract UiText b2(BankTradeData bankTradeData);

    public final void c2(r700 r700Var, String str, UiText uiText, String str2) {
        str.getClass();
        psm psmVar = this.b;
        String strF = psmVar.O() ? psmVar.f() : psmVar.B();
        qxd0<wg8> qxd0VarG1 = G1();
        if (qxd0VarG1 != null) {
            wg8 wg8VarInvoke = qxd0VarG1.a.invoke();
            wg8VarInvoke.getClass();
            qxd0VarG1.a(wg8.a(wg8VarInvoke, false, null, null, new rsa(r700Var, uiText, str, str2, strF), null, 47));
        }
    }

    public final void e2() {
        qxd0<wg8> qxd0VarG1 = G1();
        if (qxd0VarG1 != null) {
            wg8 wg8VarInvoke = qxd0VarG1.a.invoke();
            wg8VarInvoke.getClass();
            qxd0VarG1.a(wg8.a(wg8VarInvoke, true, null, null, null, null, 62));
        }
    }

    public final void f2(ResourceUiText resourceUiText) {
        qxd0<wg8> qxd0VarG1 = G1();
        if (qxd0VarG1 != null) {
            wg8 wg8VarInvoke = qxd0VarG1.a.invoke();
            wg8VarInvoke.getClass();
            qxd0VarG1.a(wg8.a(wg8VarInvoke, false, null, null, null, new vs00(resourceUiText), 31));
        }
    }

    public void g2() {
        ej5.c(o8i0.d(this), null, null, new c(null), 3);
    }

    public final void h2(BankTradeData bankTradeData, String str, String str2, String str3, String str4) {
        UiText uiTextB2 = b2(bankTradeData);
        int iOrdinal = P1().ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            i = 2;
        }
        x1(new h000.e(str, uiTextB2, str2, str3, str4, i));
    }

    public final void x1(h000 h000Var) {
        h000Var.getClass();
        ej5.c(o8i0.d(this), null, null, new b(h000Var, null), 3);
    }

    public qxd0<z900> y1() {
        return null;
    }

    public final ijf0 z1() {
        return (ijf0) ((x5a0) this.f).getValue();
    }

    public void W1() {
    }

    public void Y1() {
    }
}
