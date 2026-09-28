package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.sportybet.android.widget.ErrorView;

/* JADX INFO: loaded from: classes6.dex */
public final class ddg implements g6i0 {
    public final ErrorView a;
    public final Button b;

    public ddg(ErrorView errorView, Button button, TextView textView) {
        this.a = errorView;
        this.b = button;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
