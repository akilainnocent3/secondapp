package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.bookingcode.presentation.widget.BookingCodePanel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class inl extends ConstraintLayout implements j1k {
    public t6i0 F;
    public boolean G;

    public inl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        E();
    }

    public final void E() {
        if (this.G) {
            return;
        }
        this.G = true;
        ((r05) generatedComponent()).v((BookingCodePanel) this);
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
