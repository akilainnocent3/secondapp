package defpackage;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.b;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class d660 implements MotionLayout.h {
    public final /* synthetic */ l560 a;

    public d660(l560 l560Var) {
        this.a = l560Var;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void c(int i, MotionLayout motionLayout) {
        b bVarK;
        b bVarK2;
        b bVarK3;
        b bVarK4;
        b bVarK5;
        b bVarK6;
        int currentState = motionLayout.getCurrentState();
        int endState = motionLayout.getEndState();
        l560 l560Var = this.a;
        if (currentState == endState) {
            eo80 eo80Var = l560Var.l0;
            if (eo80Var != null && (bVarK6 = eo80Var.n0.K(R.id.end)) != null) {
                bVarK6.A(R.id.place_bet_btn, 4);
                eo80 eo80Var2 = l560Var.l0;
                bVarK6.b(eo80Var2 != null ? eo80Var2.n0 : null);
            }
            eo80 eo80Var3 = l560Var.l0;
            if (eo80Var3 != null && (bVarK5 = eo80Var3.n0.K(R.id.end)) != null) {
                bVarK5.A(R.id.auto_bet_btn, 4);
                eo80 eo80Var4 = l560Var.l0;
                bVarK5.b(eo80Var4 != null ? eo80Var4.n0 : null);
            }
            eo80 eo80Var5 = l560Var.l0;
            if (eo80Var5 == null || (bVarK4 = eo80Var5.n0.K(R.id.end)) == null) {
                return;
            }
            bVarK4.A(R.id.auto_bet_red_btn, 0);
            eo80 eo80Var6 = l560Var.l0;
            bVarK4.b(eo80Var6 != null ? eo80Var6.n0 : null);
            return;
        }
        if (motionLayout.getCurrentState() == motionLayout.getStartState()) {
            eo80 eo80Var7 = l560Var.l0;
            if (eo80Var7 != null && (bVarK3 = eo80Var7.n0.K(R.id.start)) != null) {
                bVarK3.A(R.id.place_bet_btn, 0);
                eo80 eo80Var8 = l560Var.l0;
                bVarK3.b(eo80Var8 != null ? eo80Var8.n0 : null);
            }
            eo80 eo80Var9 = l560Var.l0;
            if (eo80Var9 != null && (bVarK2 = eo80Var9.n0.K(R.id.start)) != null) {
                bVarK2.A(R.id.auto_bet_btn, 0);
                eo80 eo80Var10 = l560Var.l0;
                bVarK2.b(eo80Var10 != null ? eo80Var10.n0 : null);
            }
            eo80 eo80Var11 = l560Var.l0;
            if (eo80Var11 == null || (bVarK = eo80Var11.n0.K(R.id.start)) == null) {
                return;
            }
            bVarK.A(R.id.auto_bet_red_btn, 4);
            eo80 eo80Var12 = l560Var.l0;
            bVarK.b(eo80Var12 != null ? eo80Var12.n0 : null);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void a(MotionLayout motionLayout) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void b(MotionLayout motionLayout) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void d(MotionLayout motionLayout) {
    }
}
