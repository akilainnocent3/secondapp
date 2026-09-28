package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes6.dex */
public final class i9h implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ClearEditText c;
    public final TextView d;
    public final ConstraintLayout e;
    public final ImageView f;
    public final TextView i;
    public final ProgressButton v;

    public i9h(ConstraintLayout constraintLayout, ImageView imageView, ClearEditText clearEditText, TextView textView, ConstraintLayout constraintLayout2, ImageView imageView2, TextView textView2, ProgressButton progressButton) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = clearEditText;
        this.d = textView;
        this.e = constraintLayout2;
        this.f = imageView2;
        this.i = textView2;
        this.v = progressButton;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
