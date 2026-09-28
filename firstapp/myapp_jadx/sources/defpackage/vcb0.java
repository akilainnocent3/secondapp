package defpackage;

import com.sportybet.android.instantwin.presentation.widget.OutcomeButton;
import com.sportybet.android.instantwin.presentation.widget.OutcomeSpinnerLayout;
import com.sportybet.android.instantwin.presentation.widget.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vcb0 implements Runnable {
    public final /* synthetic */ OutcomeButton a;
    public final /* synthetic */ ucb0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public vcb0(int i, int i2, ucb0 ucb0Var, OutcomeButton outcomeButton) {
        this.a = outcomeButton;
        this.b = ucb0Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutcomeSpinnerLayout.d<bs3> dVar;
        bs3 bs3Var;
        OutcomeButton outcomeButton = this.a;
        outcomeButton.setSelected(!outcomeButton.isSelected());
        ucb0 ucb0Var = this.b;
        List<? extends OutcomeSpinnerLayout.d<bs3>> list = ucb0Var.b;
        if (list == null || (dVar = list.get(this.c)) == null || (bs3Var = (bs3) dVar.a.get(this.d)) == null) {
            return;
        }
        boolean zIsSelected = outcomeButton.isSelected();
        b bVar = ucb0Var.c;
        if (zIsSelected) {
            if (bVar != null) {
                bVar.a(bs3Var);
            }
        } else if (bVar != null) {
            bVar.b(bs3Var);
        }
    }
}
