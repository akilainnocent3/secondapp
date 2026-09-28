package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class pe20 implements u8z.a {
    public final /* synthetic */ te20 a;

    public pe20(te20 te20Var) {
        this.a = te20Var;
    }

    @Override // u8z.a
    public final void b(OutcomeButton outcomeButton) {
        ag20 ag20Var = this.a.b;
        boolean zIsChecked = outcomeButton.isChecked();
        Object tag = outcomeButton.getTag();
        tag.getClass();
        ag20Var.d(outcomeButton, zIsChecked, (Selection) tag);
    }
}
