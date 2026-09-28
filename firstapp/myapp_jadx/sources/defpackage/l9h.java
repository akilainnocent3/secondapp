package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CountdownButton;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes6.dex */
public final class l9h implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final ClearEditText d;
    public final TextView e;
    public final ConstraintLayout f;
    public final ProgressButton i;
    public final CountdownButton v;

    public l9h(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ClearEditText clearEditText, TextView textView2, ConstraintLayout constraintLayout2, ProgressButton progressButton, CountdownButton countdownButton) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = clearEditText;
        this.e = textView2;
        this.f = constraintLayout2;
        this.i = progressButton;
        this.v = countdownButton;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
