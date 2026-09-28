package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.sportybet.android.gp.tz.R;
import com.sportygames.redblack.remote.models.PlaceBetResponse;
import com.sportygames.redblack.remote.models.RoundInitializeResponse;
import com.sportygames.redblack.remote.models.RoundRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class sn40 implements Animator.AnimatorListener {
    public final /* synthetic */ nn40 a;
    public final /* synthetic */ PlaceBetResponse b;

    public sn40(nn40 nn40Var, PlaceBetResponse placeBetResponse) {
        this.a = nn40Var;
        this.b = placeBetResponse;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Vibrator defaultVibrator;
        xo40 xo40Var;
        animator.getClass();
        final nn40 nn40Var = this.a;
        AnimatorSet animatorSet = nn40Var.K;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        PlaceBetResponse placeBetResponse = this.b;
        if (placeBetResponse.getWinStatus()) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    Object systemService = nn40Var.requireContext().getSystemService("vibrator_manager");
                    systemService.getClass();
                    defaultVibrator = ((VibratorManager) systemService).getDefaultVibrator();
                } else {
                    Object systemService2 = nn40Var.requireContext().getSystemService("vibrator");
                    systemService2.getClass();
                    defaultVibrator = (Vibrator) systemService2;
                }
                defaultVibrator.getClass();
                if (i >= 26) {
                    defaultVibrator.vibrate(VibrationEffect.createOneShot(200L, -1));
                } else {
                    defaultVibrator.vibrate(200L);
                }
            } catch (Exception unused) {
            }
        }
        xo40 xo40Var2 = (xo40) nn40Var.b;
        if (xo40Var2 != null) {
            xo40Var2.b0.setVisibility(0);
        }
        xo40 xo40Var3 = (xo40) nn40Var.b;
        if (xo40Var3 != null) {
            xo40Var3.C.setVisibility(4);
        }
        xo40 xo40Var4 = (xo40) nn40Var.b;
        if (xo40Var4 != null) {
            xo40Var4.z.setVisibility(8);
        }
        xo40 xo40Var5 = (xo40) nn40Var.b;
        if (xo40Var5 != null) {
            xo40Var5.X.setVisibility(8);
        }
        xo40 xo40Var6 = (xo40) nn40Var.b;
        if (xo40Var6 != null) {
            xo40Var6.f.setVisibility(8);
        }
        xo40 xo40Var7 = (xo40) nn40Var.b;
        if (xo40Var7 != null) {
            xo40Var7.c0.setVisibility(8);
        }
        xo40 xo40Var8 = (xo40) nn40Var.b;
        if (xo40Var8 != null) {
            xo40Var8.d0.setVisibility(8);
        }
        int i2 = nn40Var.M;
        B b = nn40Var.b;
        if (i2 != 5) {
            xo40 xo40Var9 = (xo40) b;
            if (xo40Var9 != null) {
                xo40Var9.N.setVisibility(0);
            }
            xo40 xo40Var10 = (xo40) nn40Var.b;
            if (xo40Var10 != null) {
                xo40Var10.c.setVisibility(8);
            }
        } else {
            xo40 xo40Var11 = (xo40) b;
            if (xo40Var11 != null) {
                xo40Var11.c.setVisibility(0);
            }
            xo40 xo40Var12 = (xo40) nn40Var.b;
            if (xo40Var12 != null) {
                xo40Var12.N.setVisibility(8);
            }
        }
        xo40 xo40Var13 = (xo40) nn40Var.b;
        if (xo40Var13 != null) {
            xo40Var13.D.a(0);
        }
        if (placeBetResponse.getMaxPayoutMessage() == null) {
            nn40Var.K0();
            double d = nn40Var.v;
            if (d < 0.0d) {
                xo40 xo40Var14 = (xo40) nn40Var.b;
                if (xo40Var14 != null) {
                    xo40Var14.i0.a(Math.abs(d));
                    return;
                }
                return;
            }
            if (d <= 0.0d || (xo40Var = (xo40) nn40Var.b) == null) {
                return;
            }
            xo40Var.i0.b(Math.abs(d));
            return;
        }
        Context context = nn40Var.getContext();
        if (context != null) {
            xbg xbgVar = nn40Var.S;
            if (xbgVar == null) {
                Intrinsics.n("errorDialog");
                throw null;
            }
            String string = nn40Var.getString(R.string.redblack_err_max_payout);
            string.getClass();
            String string2 = nn40Var.getString(R.string.new_round);
            string2.getClass();
            xbg.c(xbgVar, string, string2, new Function0() { // from class: qn40
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    nn40 nn40Var2 = nn40Var;
                    if (nn40Var2.w0) {
                        nn40Var2.J0();
                    }
                    nn40Var2.Z = 1;
                    nn40Var2.V = 0;
                    xo40 xo40Var15 = (xo40) nn40Var2.b;
                    if (xo40Var15 != null) {
                        xo40Var15.b0.setVisibility(8);
                    }
                    xo40 xo40Var16 = (xo40) nn40Var2.b;
                    if (xo40Var16 != null) {
                        xo40Var16.z.setVisibility(0);
                    }
                    xo40 xo40Var17 = (xo40) nn40Var2.b;
                    if (xo40Var17 != null) {
                        xo40Var17.X.setVisibility(0);
                    }
                    xo40 xo40Var18 = (xo40) nn40Var2.b;
                    if (xo40Var18 != null) {
                        xo40Var18.f.setVisibility(0);
                    }
                    xo40 xo40Var19 = (xo40) nn40Var2.b;
                    if (xo40Var19 != null) {
                        xo40Var19.d0.setVisibility(0);
                    }
                    xo40 xo40Var20 = (xo40) nn40Var2.b;
                    if (xo40Var20 != null) {
                        xo40Var20.c0.setVisibility(0);
                    }
                    xo40 xo40Var21 = (xo40) nn40Var2.b;
                    if (xo40Var21 != null) {
                        xo40Var21.N.setVisibility(8);
                    }
                    xo40 xo40Var22 = (xo40) nn40Var2.b;
                    if (xo40Var22 != null) {
                        xo40Var22.c.setVisibility(8);
                    }
                    xo40 xo40Var23 = (xo40) nn40Var2.b;
                    if (xo40Var23 != null) {
                        xo40Var23.C.setVisibility(4);
                    }
                    xo40 xo40Var24 = (xo40) nn40Var2.b;
                    if (xo40Var24 != null) {
                        nn40Var2.F0(xo40Var24.A, nn40Var2.g0, 1);
                    }
                    xo40 xo40Var25 = (xo40) nn40Var2.b;
                    if (xo40Var25 != null) {
                        xo40Var25.L.setVisibility(8);
                    }
                    xo40 xo40Var26 = (xo40) nn40Var2.b;
                    if (xo40Var26 != null) {
                        xo40Var26.e.setGravity(1);
                    }
                    fph0 fph0Var = nn40Var2.F;
                    fph0Var.getClass();
                    fph0Var.i(null, false);
                    g060 g060VarC0 = nn40Var2.C0();
                    RoundInitializeResponse roundInitializeResponseD = nn40Var2.C0().c.d();
                    g060VarC0.x1(new RoundRequest(roundInitializeResponseD != null ? Long.valueOf(roundInitializeResponseD.getRoundId()) : null));
                    nn40Var2.C0().z1();
                    return Unit.a;
                }
            }, new rn40(), context.getColor(R.color.try_again_color), 224);
            xbgVar.a();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }
}
