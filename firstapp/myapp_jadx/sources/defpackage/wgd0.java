package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.CashOutLoadingButton;

/* JADX INFO: loaded from: classes4.dex */
public final class wgd0 implements g6i0 {
    public final CashOutLoadingButton a;
    public final TextView b;
    public final ProgressBar c;

    public wgd0(CashOutLoadingButton cashOutLoadingButton, TextView textView, ProgressBar progressBar) {
        this.a = cashOutLoadingButton;
        this.b = textView;
        this.c = progressBar;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
