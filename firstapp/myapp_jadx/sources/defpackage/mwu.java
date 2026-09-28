package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.sportyherov2.components.RangeComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mwu implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mwu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rv80 binding;
        rv80 binding2;
        rv80 binding3;
        rv80 binding4;
        rv80 binding5;
        rv80 binding6;
        rv80 binding7;
        rv80 binding8;
        rv80 binding9;
        rv80 binding10;
        rv80 binding11;
        rv80 binding12;
        rv80 binding13;
        rv80 binding14;
        rv80 binding15;
        rv80 binding16;
        int i = this.a;
        RangeComponent rangeComponent = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                MatchEventActivity matchEventActivity = (MatchEventActivity) obj2;
                long jLongValue = ((Long) obj).longValue();
                int i2 = MatchEventActivity.a0;
                matchEventActivity.U1(new a5o.v(((n4p) matchEventActivity.C1()).c(), jLongValue, System.currentTimeMillis() / 1000));
                z5v z5vVarI1 = matchEventActivity.I1();
                ej5.c(o8i0.d(z5vVarI1), null, null, new y5v(null, z5vVarI1), 3);
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                ((View) obj).getClass();
                q1c0Var.r1 = q1c0Var.o1;
                q1c0Var.K0();
                q1c0Var.L0();
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var == null || (binding14 = w3c0Var.j0.getBinding()) == null || !binding14.d.getBetIsPlaced()) {
                    w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                    if (w3c0Var2 != null && (binding = w3c0Var2.j0.getBinding()) != null && binding.d.getBetIsWaiting()) {
                        w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                        if (w3c0Var3 != null && (binding3 = w3c0Var3.j0.getBinding()) != null) {
                            binding3.e.f.setEnabled(true);
                        }
                        w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                        if (w3c0Var4 != null && (binding2 = w3c0Var4.j0.getBinding()) != null) {
                            binding2.e.f.setVisibility(0);
                        }
                    }
                } else {
                    w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                    if (w3c0Var5 != null && (binding16 = w3c0Var5.j0.getBinding()) != null) {
                        binding16.e.f.setEnabled(false);
                    }
                    w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                    if (w3c0Var6 != null && (binding15 = w3c0Var6.j0.getBinding()) != null) {
                        binding15.e.f.setVisibility(0);
                    }
                }
                GameDetails gameDetails = q1c0Var.W1;
                wz.a("SwitchBet1toBet2Click", gameDetails != null ? gameDetails.getName() : null, "RANGE");
                w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                if (w3c0Var7 != null && (binding13 = w3c0Var7.j0.getBinding()) != null) {
                    binding13.e.c.setVisibility(8);
                }
                w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                if (w3c0Var8 != null && (binding12 = w3c0Var8.j0.getBinding()) != null) {
                    binding12.e.d.setEnabled(false);
                }
                boolean z = q1c0Var.Y0;
                B b = q1c0Var.b;
                if (z) {
                    w3c0 w3c0Var9 = (w3c0) b;
                    if (w3c0Var9 != null && (binding11 = w3c0Var9.j0.getBinding()) != null) {
                        binding11.e.b.setTextColor(q1c0Var.requireContext().getColor(R.color.valentine));
                    }
                } else {
                    w3c0 w3c0Var10 = (w3c0) b;
                    if (w3c0Var10 != null && (binding4 = w3c0Var10.j0.getBinding()) != null) {
                        binding4.e.b.setTextColor(q1c0Var.requireContext().getColor(R.color.sh_bet_text_enable_color));
                    }
                }
                w3c0 w3c0Var11 = (w3c0) q1c0Var.b;
                if (w3c0Var11 != null && (binding10 = w3c0Var11.j0.getBinding()) != null) {
                    binding10.e.e.setTextColor(q1c0Var.requireContext().getColor(R.color.sh_bet_text_disable_color));
                }
                w3c0 w3c0Var12 = (w3c0) q1c0Var.b;
                if (w3c0Var12 != null && (binding9 = w3c0Var12.j0.getBinding()) != null) {
                    binding9.e.i.setEnabled(true);
                }
                w3c0 w3c0Var13 = (w3c0) q1c0Var.b;
                if (w3c0Var13 != null && (binding8 = w3c0Var13.j0.getBinding()) != null) {
                    binding8.d.setVisibility(8);
                }
                w3c0 w3c0Var14 = (w3c0) q1c0Var.b;
                if (w3c0Var14 != null && (binding7 = w3c0Var14.j0.getBinding()) != null) {
                    binding7.c.setVisibility(0);
                }
                w3c0 w3c0Var15 = (w3c0) q1c0Var.b;
                if (w3c0Var15 != null && (binding6 = w3c0Var15.j0.getBinding()) != null) {
                    binding6.c.c();
                }
                w3c0 w3c0Var16 = (w3c0) q1c0Var.b;
                if (w3c0Var16 != null && (binding5 = w3c0Var16.j0.getBinding()) != null) {
                    rangeComponent = binding5.c;
                }
                q1c0Var.s1(rangeComponent);
                break;
        }
        return Unit.a;
    }
}
