package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.sportybet.android.instantwin.presentation.widget.RoundTicketDetailContent;

/* JADX INFO: loaded from: classes.dex */
public abstract class b2m extends LinearLayout implements j1k {
    public t6i0 a;
    public boolean b;

    public b2m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.b) {
            return;
        }
        this.b = true;
        ((c060) generatedComponent()).x((RoundTicketDetailContent) this);
    }

    @Override // defpackage.j1k
    public final i1k componentManager() {
        t6i0 t6i0Var = this.a;
        if (t6i0Var != null) {
            return t6i0Var;
        }
        t6i0 t6i0Var2 = new t6i0(this);
        this.a = t6i0Var2;
        return t6i0Var2;
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        t6i0 t6i0Var = this.a;
        if (t6i0Var == null) {
            t6i0Var = new t6i0(this);
            this.a = t6i0Var;
        }
        return t6i0Var.generatedComponent();
    }
}
