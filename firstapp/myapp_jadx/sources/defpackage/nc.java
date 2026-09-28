package defpackage;

import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class nc implements g6i0 {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final ImageButton c;
    public final ImageButton d;

    public nc(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = imageButton2;
        this.d = imageButton3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
