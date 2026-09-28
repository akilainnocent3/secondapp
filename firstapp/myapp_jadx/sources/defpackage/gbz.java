package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class gbz implements g6i0 {
    public final ConstraintLayout a;
    public final OutcomeButton b;
    public final TextView c;

    public gbz(ConstraintLayout constraintLayout, OutcomeButton outcomeButton, TextView textView) {
        this.a = constraintLayout;
        this.b = outcomeButton;
        this.c = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
