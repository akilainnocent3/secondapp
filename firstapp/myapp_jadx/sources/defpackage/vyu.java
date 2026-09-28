package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vyu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vyu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                MatchEventDetailActivity matchEventDetailActivity = (MatchEventDetailActivity) obj;
                int i2 = MatchEventDetailActivity.U;
                matchEventDetailActivity.W1(new a5o.i(((n4p) matchEventDetailActivity.C1()).c()));
                m3v m3vVarI1 = matchEventDetailActivity.I1();
                String str = matchEventDetailActivity.G;
                str.getClass();
                ej5.c(o8i0.d(m3vVarI1), null, null, new d3v(m3vVarI1, str, null), 3);
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj;
                int i3 = q1c0Var.s1;
                if (i3 == q1c0Var.t1) {
                    w3c0 w3c0Var = (w3c0) q1c0Var.b;
                    if (w3c0Var != null) {
                        w3c0Var.d.setBetDone();
                    }
                } else if (i3 == q1c0Var.u1) {
                    w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                    if (w3c0Var2 != null) {
                        w3c0Var2.e.setBetDone();
                    }
                } else if (i3 == q1c0Var.v1) {
                    boolean z = q1c0Var.r0;
                    B b = q1c0Var.b;
                    if (z) {
                        w3c0 w3c0Var3 = (w3c0) b;
                        if (w3c0Var3 != null) {
                            w3c0Var3.d.setDone();
                        }
                    } else {
                        w3c0 w3c0Var4 = (w3c0) b;
                        if (w3c0Var4 != null) {
                            w3c0Var4.e.setDone();
                        }
                    }
                } else if (i3 == q1c0Var.w1) {
                    boolean z2 = q1c0Var.r0;
                    B b2 = q1c0Var.b;
                    if (z2) {
                        w3c0 w3c0Var5 = (w3c0) b2;
                        if (w3c0Var5 != null) {
                            w3c0Var5.d.setDone();
                        }
                    } else {
                        w3c0 w3c0Var6 = (w3c0) b2;
                        if (w3c0Var6 != null) {
                            w3c0Var6.e.setDone();
                        }
                    }
                }
                w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                if (w3c0Var7 != null) {
                    w3c0Var7.R.setVisibility(8);
                }
                break;
        }
        return Unit.a;
    }
}
