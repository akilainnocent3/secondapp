package defpackage;

import com.sportygames.redblack.remote.models.RoundInitializeResponse;
import com.sportygames.redblack.remote.models.RoundRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a44 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a44(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(new i04.j(((Boolean) obj).booleanValue()));
                break;
            default:
                nn40 nn40Var = (nn40) obj2;
                if (((Boolean) obj).booleanValue()) {
                    nn40Var.s0();
                    xo40 xo40Var = (xo40) nn40Var.b;
                    if (xo40Var != null) {
                        xo40Var.M.setClickable(true);
                    }
                    nn40Var.getParentFragmentManager().a0();
                } else {
                    if (nn40Var.w0) {
                        nn40Var.J0();
                    }
                    xo40 xo40Var2 = (xo40) nn40Var.b;
                    if (xo40Var2 != null) {
                        xo40Var2.d0.setAlpha(0.5f);
                    }
                    xo40 xo40Var3 = (xo40) nn40Var.b;
                    if (xo40Var3 != null) {
                        xo40Var3.d0.setEnabled(false);
                    }
                    xo40 xo40Var4 = (xo40) nn40Var.b;
                    if (xo40Var4 != null) {
                        xo40Var4.c0.setAlpha(0.5f);
                    }
                    xo40 xo40Var5 = (xo40) nn40Var.b;
                    if (xo40Var5 != null) {
                        xo40Var5.c0.setEnabled(false);
                    }
                    nn40Var.s0();
                    nn40Var.Z = 1;
                    nn40Var.V = 0;
                    xo40 xo40Var6 = (xo40) nn40Var.b;
                    if (xo40Var6 != null) {
                        xo40Var6.M.setClickable(true);
                    }
                    xo40 xo40Var7 = (xo40) nn40Var.b;
                    if (xo40Var7 != null) {
                        xo40Var7.L.setVisibility(8);
                    }
                    xo40 xo40Var8 = (xo40) nn40Var.b;
                    if (xo40Var8 != null) {
                        xo40Var8.e.setGravity(1);
                    }
                    fph0 fph0Var = nn40Var.F;
                    fph0Var.getClass();
                    fph0Var.i(null, false);
                    g060 g060VarC0 = nn40Var.C0();
                    RoundInitializeResponse roundInitializeResponseD = nn40Var.C0().c.d();
                    g060VarC0.x1(new RoundRequest(roundInitializeResponseD != null ? Long.valueOf(roundInitializeResponseD.getRoundId()) : null));
                    nn40Var.C0().z1();
                    nn40Var.getParentFragmentManager().a0();
                }
                break;
        }
        return Unit.a;
    }
}
