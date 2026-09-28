package defpackage;

import android.view.View;
import android.widget.ImageButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.user.LineTextViewPanel;

/* JADX INFO: loaded from: classes5.dex */
public final class owi implements g6i0 {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final ComposeView c;
    public final ImageButton d;
    public final ComposeView e;
    public final LineTextViewPanel f;
    public final ComposeView i;
    public final ComposeView v;

    public owi(ConstraintLayout constraintLayout, ImageButton imageButton, ComposeView composeView, ImageButton imageButton2, ComposeView composeView2, LineTextViewPanel lineTextViewPanel, ComposeView composeView3, ComposeView composeView4) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = composeView;
        this.d = imageButton2;
        this.e = composeView2;
        this.f = lineTextViewPanel;
        this.i = composeView3;
        this.v = composeView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
