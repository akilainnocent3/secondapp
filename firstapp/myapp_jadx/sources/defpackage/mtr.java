package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class mtr implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final TextView c;

    public mtr(TextView textView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
