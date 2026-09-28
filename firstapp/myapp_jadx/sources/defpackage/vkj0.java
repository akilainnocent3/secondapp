package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.withdraw.WithdrawBaseViewModel$makeWithdraw$1", f = "WithdrawBaseViewModel.kt", l = {245}, m = "invokeSuspend", v = 2)
public final class vkj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xkj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkj0(xkj0 xkj0Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = xkj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vkj0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vkj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        r700 r700Var;
        List listC;
        y5b y5bVar = y5b.a;
        int i = this.a;
        xkj0 xkj0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            qxd0<uxs> qxd0VarL2 = xkj0Var.l2();
            if (qxd0VarL2 != null) {
                qxd0VarL2.a(uxs.LOADING);
            }
            bmj0 bmj0Var = xkj0Var.J;
            msj0 msj0VarM2 = xkj0Var.m2();
            this.a = 1;
            objA = bmj0Var.a(msj0VarM2, this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        if (zi50.a(objA) != null) {
            n000.d2(xkj0Var);
        }
        if (!(objA instanceof zi50.b)) {
            xoj0 xoj0Var = (xoj0) objA;
            if (xoj0Var instanceof xoj0.d.j) {
                xoj0.d.j jVar = (xoj0.d.j) xoj0Var;
                String str = jVar.c;
                xkj0Var.O = str;
                int iOrdinal = jVar.b.ordinal();
                if (iOrdinal == 0) {
                    xkj0Var.u2(str);
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    xkj0Var.t2(vnj0.a.f.b);
                }
            } else if (xoj0Var instanceof xoj0.b.e) {
                xoj0.b.e eVar = (xoj0.b.e) xoj0Var;
                xkj0Var.O = eVar.c;
                xkj0Var.o2(eVar);
            } else if (xoj0Var instanceof xoj0.d.h) {
                xkj0Var.O = ((xoj0.d.h) xoj0Var).b;
                xkj0Var.t2(vnj0.a.f.b);
            } else if (xoj0Var instanceof xoj0.d.f) {
                xkj0Var.t2(vnj0.a.c.b);
            } else if (xoj0Var instanceof xoj0.d.y) {
                xkj0Var.O1().j(xkj0Var.z1().a.b);
                String strValueOf = String.valueOf(xkj0Var.O1().j);
                listC = strValueOf != null ? a.c(strValueOf) : null;
                if (listC == null) {
                    listC = m2g.a;
                }
                xkj0Var.t2(new vnj0.b(new ResourceUiText(R.string.page_payment__you_will_need_tier_vnum_verification_for_this_withdraw_tip, listC)));
            } else if (xoj0Var instanceof xoj0.d.z) {
                xkj0Var.O1().j(xkj0Var.z1().a.b);
                String strValueOf2 = String.valueOf(xkj0Var.O1().j);
                listC = strValueOf2 != null ? a.c(strValueOf2) : null;
                if (listC == null) {
                    listC = m2g.a;
                }
                xkj0Var.t2(new vnj0.b(new ResourceUiText(R.string.page_payment__too_low_tier_for_period_withdraw_tip, listC)));
            } else if (xoj0Var instanceof xoj0.d.a0) {
                xkj0Var.t2(new vnj0.b(new ResourceUiText(R.string.page_payment__max_tier_must_wait_withdraw_tip, m2g.a)));
            } else if (xoj0Var instanceof xoj0.d.w) {
                xkj0Var.t2(new vnj0.b(new ResourceUiText(R.string.page_payment__max_tier_lifetime_limit_withdraw_tip, m2g.a)));
            } else if (xoj0Var instanceof xoj0.b.a) {
                xkj0Var.t2(new vnj0.a.b(xkj0.j2(xoj0Var)));
            } else if (xoj0Var instanceof xoj0.d.v) {
                xkj0Var.t2(new vnj0.a.h(xkj0.j2(xoj0Var)));
            } else if (xoj0Var instanceof xoj0.d.t) {
                xkj0Var.t2(new vnj0.a.g(xkj0.j2(xoj0Var)));
            } else {
                UiText uiTextJ2 = xkj0.j2(xoj0Var);
                qxd0<wg8> qxd0VarG1 = xkj0Var.G1();
                if (qxd0VarG1 != null) {
                    wg8 wg8VarInvoke = qxd0VarG1.a.invoke();
                    wg8VarInvoke.getClass();
                    UiText uiTextF1 = xkj0Var.F1();
                    int iOrdinal2 = xkj0Var.P1().ordinal();
                    if (iOrdinal2 == 0) {
                        r700Var = r700.a;
                    } else {
                        if (iOrdinal2 != 1) {
                            uhc.a();
                            return null;
                        }
                        r700Var = r700.b;
                    }
                    qxd0VarG1.a(wg8.a(wg8VarInvoke, false, null, new k9h(uiTextF1, r700Var, uiTextJ2), null, null, 59));
                }
            }
        }
        xkj0Var.s2();
        return Unit.a;
    }
}
