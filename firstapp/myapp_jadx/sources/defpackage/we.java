package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class we implements g6i0 {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final TextView c;
    public final ImageButton d;

    public we(ConstraintLayout constraintLayout, ImageButton imageButton, TextView textView, ImageButton imageButton2) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = textView;
        this.d = imageButton2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
