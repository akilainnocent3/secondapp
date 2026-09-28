package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes6.dex */
public final class m9h implements g6i0 {
    public final ConstraintLayout a;
    public final CheckBox b;
    public final ImageView c;
    public final TextView d;
    public final ConstraintLayout e;
    public final ProgressButton f;
    public final TextView i;

    public m9h(ConstraintLayout constraintLayout, CheckBox checkBox, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2, ProgressButton progressButton, TextView textView2) {
        this.a = constraintLayout;
        this.b = checkBox;
        this.c = imageView;
        this.d = textView;
        this.e = constraintLayout2;
        this.f = progressButton;
        this.i = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
