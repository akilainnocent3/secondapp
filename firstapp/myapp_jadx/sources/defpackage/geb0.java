package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class geb0 implements g6i0 {
    public final ConstraintLayout a;
    public final CheckBox b;
    public final TextView c;

    public geb0(ConstraintLayout constraintLayout, CheckBox checkBox, LinearLayout linearLayout, TextView textView) {
        this.a = constraintLayout;
        this.b = checkBox;
        this.c = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
