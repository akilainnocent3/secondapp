package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes6.dex */
public final class b9h implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ClearEditText c;
    public final TextView d;
    public final ConstraintLayout e;
    public final ProgressButton f;

    public b9h(ConstraintLayout constraintLayout, ImageView imageView, ClearEditText clearEditText, TextView textView, ConstraintLayout constraintLayout2, ProgressButton progressButton) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = clearEditText;
        this.d = textView;
        this.e = constraintLayout2;
        this.f = progressButton;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
