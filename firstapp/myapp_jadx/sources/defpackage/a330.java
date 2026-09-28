package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes4.dex */
public final class a330 implements g6i0 {
    public final ProgressButton a;
    public final ProgressBar b;

    public a330(ProgressButton progressButton, ProgressBar progressBar, ProgressBar progressBar2, TextView textView) {
        this.a = progressButton;
        this.b = progressBar2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
