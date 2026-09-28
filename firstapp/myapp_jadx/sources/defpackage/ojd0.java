package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class ojd0 implements g6i0 {
    public final ConstraintLayout a;
    public final OutcomeButton b;
    public final TextView c;
    public final ListenableSpinner d;
    public final TextView e;

    public ojd0(ConstraintLayout constraintLayout, OutcomeButton outcomeButton, TextView textView, ListenableSpinner listenableSpinner, TextView textView2) {
        this.a = constraintLayout;
        this.b = outcomeButton;
        this.c = textView;
        this.d = listenableSpinner;
        this.e = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
