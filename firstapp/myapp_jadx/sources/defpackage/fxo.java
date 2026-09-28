package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class fxo implements g6i0 {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final ImageButton c;
    public final ClearEditText d;
    public final TextView e;
    public final ProgressButton f;

    public fxo(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, ClearEditText clearEditText, TextView textView, ProgressButton progressButton) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = imageButton2;
        this.d = clearEditText;
        this.e = textView;
        this.f = progressButton;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
