package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.plugin.realsports.widget.OddsFilterSettingView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kyl extends ConstraintLayout implements j1k {
    public t6i0 F;
    public boolean G;

    public final void E() {
        if (this.G) {
            return;
        }
        this.G = true;
        ((siy) generatedComponent()).m((OddsFilterSettingView) this);
    }

    @Override // defpackage.j1k
    public final i1k componentManager() {
        t6i0 t6i0Var = this.F;
        if (t6i0Var != null) {
            return t6i0Var;
        }
        t6i0 t6i0Var2 = new t6i0(this);
        this.F = t6i0Var2;
        return t6i0Var2;
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        t6i0 t6i0Var = this.F;
        if (t6i0Var == null) {
            t6i0Var = new t6i0(this);
            this.F = t6i0Var;
        }
        return t6i0Var.generatedComponent();
    }
}
