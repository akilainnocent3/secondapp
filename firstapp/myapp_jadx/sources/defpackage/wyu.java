package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wyu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wyu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = MatchEventDetailActivity.U;
                ((MatchEventDetailActivity) obj).I1().y1(x2v.b.C1270b.a);
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj;
                int i3 = q1c0Var.s1;
                if (i3 == q1c0Var.t1) {
                    w3c0 w3c0Var = (w3c0) q1c0Var.b;
                    if (w3c0Var != null) {
                        w3c0Var.d.setBetCross();
                    }
                } else if (i3 == q1c0Var.u1) {
                    w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                    if (w3c0Var2 != null) {
                        w3c0Var2.e.setBetCross();
                    }
                } else if (i3 == q1c0Var.v1) {
                    boolean z = q1c0Var.r0;
                    B b = q1c0Var.b;
                    if (z) {
                        w3c0 w3c0Var3 = (w3c0) b;
                        if (w3c0Var3 != null) {
                            w3c0Var3.d.setCross();
                        }
                    } else {
                        w3c0 w3c0Var4 = (w3c0) b;
                        if (w3c0Var4 != null) {
                            w3c0Var4.e.setCross();
                        }
                    }
                } else if (i3 == q1c0Var.w1) {
                    boolean z2 = q1c0Var.r0;
                    B b2 = q1c0Var.b;
                    if (z2) {
                        w3c0 w3c0Var5 = (w3c0) b2;
                        if (w3c0Var5 != null) {
                            w3c0Var5.d.setCross();
                        }
                    } else {
                        w3c0 w3c0Var6 = (w3c0) b2;
                        if (w3c0Var6 != null) {
                            w3c0Var6.e.setCross();
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
