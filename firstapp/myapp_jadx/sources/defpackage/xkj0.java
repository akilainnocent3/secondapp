package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xkj0 extends n000 {
    public final mmj0.a G;
    public final w9e H;
    public final ha00 I;
    public final bmj0 J;
    public final dhj0.a K;
    public final ku90<okj0> L;
    public final ku90 M;
    public final ga00 N;
    public String O;
    public final mpe0 P;
    public final mpe0 Q;
    public rkj0 R;
    public jvd0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkj0(vu60 vu60Var, uqm uqmVar, psm psmVar, v800 v800Var, mmj0.a aVar, w9e w9eVar, ha00 ha00Var, bmj0 bmj0Var, dhj0.a aVar2) {
        super(vu60Var, psmVar, uqmVar, w9eVar, v800Var);
        v4c v4cVar = v4c.a;
        vu60Var.getClass();
        uqmVar.getClass();
        psmVar.getClass();
        v800Var.getClass();
        w9eVar.getClass();
        bmj0Var.getClass();
        this.G = aVar;
        this.H = w9eVar;
        this.I = ha00Var;
        this.J = bmj0Var;
        this.K = aVar2;
        ku90<okj0> ku90Var = new ku90<>();
        this.L = ku90Var;
        this.M = ku90Var;
        this.N = ga00.WITHDRAW;
        this.P = hwr.b(new Function0() { // from class: qkj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                xkj0 xkj0Var = this.a;
                mmj0.a aVar3 = xkj0Var.G;
                qxd0<gtp> qxd0VarJ1 = xkj0Var.J1();
                et7 et7VarD = o8i0.d(xkj0Var);
                h400 h400Var = (h400) xkj0Var.A.getValue();
                c100 c100VarN1 = xkj0Var.N1();
                aVar3.getClass();
                h400Var.getClass();
                c100VarN1.getClass();
                jak jakVar = aVar3.a;
                v4c v4cVar2 = v4c.a;
                return new mmj0(qxd0VarJ1, et7VarD, h400Var, c100VarN1, jakVar, aVar3.b, aVar3.c, aVar3.d, aVar3.f, aVar3.e);
            }
        });
        this.Q = hwr.b(new rup(this, 1));
        bmj0Var.e = (bag) this.y.getValue();
    }

    public static UiText j2(xoj0 xoj0Var) {
        String message = xoj0Var.getMessage();
        return message != null ? new StringUiText(message) : new ResourceUiText(R.string.common_feedback__something_went_wrong_tip);
    }

    @Override // defpackage.n000
    public final ga00 P1() {
        return this.N;
    }

    @Override // defpackage.n000
    public final void U1() {
        super.U1();
        jvd0 jvd0Var = this.S;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.S = ej5.c(o8i0.d(this), null, null, new wkj0(this, null), 3);
        kzh.d(new g1i((lyh) ((dhj0) this.Q.getValue()).d.getValue(), new tkj0(this, null)), o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new ukj0(this, null), 3);
    }

    @Override // defpackage.n000
    public final void Y1() {
        if (!q8d0.b) {
            q2();
        } else {
            ej5.c(o8i0.d(this), null, null, new skj0(this, okj0.a.a, null), 3);
        }
    }

    @Override // defpackage.n000
    public final void g2() {
        super.g2();
        this.I.b(o8i0.d(this), new x62(this, 3));
    }

    public qxd0<il8> i2() {
        return null;
    }

    @Override // defpackage.n000
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public final mmj0 O1() {
        return (mmj0) this.P.getValue();
    }

    public qxd0<uxs> l2() {
        return null;
    }

    public abstract msj0 m2();

    public qxd0<rrj0> n2() {
        return null;
    }

    public final void p2(hl8 hl8Var) {
        if (hl8Var.equals(hl8.b.a)) {
            qxd0<il8> qxd0VarI2 = i2();
            if (qxd0VarI2 != null) {
                qxd0VarI2.a.invoke().getClass();
                qxd0VarI2.a(new il8(null));
            }
            x1(h000.d.a);
            return;
        }
        if (hl8Var instanceof hl8.a) {
            vnj0.a.d dVar = ((hl8.a) hl8Var).a;
            qxd0<il8> qxd0VarI3 = i2();
            if (qxd0VarI3 != null) {
                qxd0VarI3.a.invoke().getClass();
                qxd0VarI3.a(new il8(null));
            }
            int iOrdinal = dVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return;
                }
                if (iOrdinal == 2) {
                    x1(new h000.f(Boolean.FALSE, aqg0.j.c, true));
                    return;
                } else if (iOrdinal != 3) {
                    uhc.a();
                    return;
                }
            }
            x1(h000.b.a);
            return;
        }
        if (!(hl8Var instanceof hl8.c)) {
            uhc.a();
            return;
        }
        vnj0.a aVar = ((hl8.c) hl8Var).a;
        qxd0<il8> qxd0VarI4 = i2();
        if (qxd0VarI4 != null) {
            qxd0VarI4.a.invoke().getClass();
            qxd0VarI4.a(new il8(null));
        }
        if (aVar instanceof vnj0.a.b) {
            q2();
            return;
        }
        if ((aVar instanceof vnj0.a.h) || (aVar instanceof vnj0.a.g)) {
            x1(new h000.c(wae.HOME));
        } else {
            if (Intrinsics.g(aVar, vnj0.a.c.b) || Intrinsics.g(aVar, vnj0.a.e.b) || Intrinsics.g(aVar, vnj0.a.C1217a.b) || Intrinsics.g(aVar, vnj0.a.f.b)) {
                return;
            }
            uhc.a();
        }
    }

    public final void q2() {
        ej5.c(o8i0.d(this), null, null, new vkj0(this, null), 3);
    }

    public final void r2(boolean z) {
        qxd0<uxs> qxd0VarL2;
        this.i = z;
        qxd0<uxs> qxd0VarL3 = l2();
        if ((qxd0VarL3 != null ? qxd0VarL3.a.invoke() : null) == uxs.LOADING || (qxd0VarL2 = l2()) == null) {
            return;
        }
        qxd0VarL2.a(z ? uxs.ENABLE : uxs.DISABLE);
    }

    public final void s2() {
        qxd0<uxs> qxd0VarL2 = l2();
        if (qxd0VarL2 != null) {
            qxd0VarL2.a(this.i ? uxs.ENABLE : uxs.DISABLE);
        }
    }

    public final void t2(vnj0 vnj0Var) {
        qxd0<il8> qxd0VarI2 = i2();
        if (qxd0VarI2 != null) {
            qxd0VarI2.a.invoke().getClass();
            qxd0VarI2.a(new il8(vnj0Var));
        }
    }

    public final void u2(String str) {
        h2(null, bjb0.U(new BigDecimal(z1().a.b).multiply(BigDecimal.valueOf(10000L)).longValue(), Locale.US), null, str, null);
    }

    public final boolean v2(String str) {
        str.getClass();
        if (this.C) {
            O1().h(str);
        }
        this.D = null;
        mmj0 mmj0VarO1 = O1();
        mmj0VarO1.getClass();
        g0l g0lVarF = mmj0VarO1.c().f(str);
        if (Intrinsics.g(g0lVarF, g0l.a.a)) {
            qxd0<z900> qxd0VarY1 = y1();
            if (qxd0VarY1 != null) {
                z900 z900VarInvoke = qxd0VarY1.a.invoke();
                z900VarInvoke.getClass();
                qxd0VarY1.a(z900.a(z900VarInvoke, vch0.a));
                return false;
            }
        } else {
            if (!(g0lVarF instanceof g0l.b)) {
                if (!Intrinsics.g(g0lVarF, g0l.c.a)) {
                    uhc.a();
                    return false;
                }
                qxd0<z900> qxd0VarY2 = y1();
                if (qxd0VarY2 != null) {
                    qxd0VarY2.a.invoke().getClass();
                    StringUiText stringUiText = vch0.a;
                    stringUiText.getClass();
                    qxd0VarY2.a(new z900((UiText) stringUiText, false));
                }
                return true;
            }
            qxd0<z900> qxd0VarY3 = y1();
            if (qxd0VarY3 != null) {
                qxd0VarY3.a.invoke().getClass();
                g0l.b bVar = (g0l.b) g0lVarF;
                UiText uiText = bVar.a;
                boolean z = bVar.b != null;
                uiText.getClass();
                qxd0VarY3.a(new z900(uiText, z));
            }
            final wae waeVar = ((g0l.b) g0lVarF).b;
            if (waeVar != null) {
                this.D = new Function0() { // from class: pkj0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.a.x1(new h000.c(waeVar));
                        return Unit.a;
                    }
                };
            }
        }
        return false;
    }

    public void o2(xoj0.b.e eVar) {
    }
}
