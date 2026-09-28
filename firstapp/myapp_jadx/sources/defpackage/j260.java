package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class j260 implements g6i0 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final TextView c;

    public j260(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
