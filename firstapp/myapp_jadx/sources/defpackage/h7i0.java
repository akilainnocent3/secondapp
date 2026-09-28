package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.DoubleTextViewWithSeparator;

/* JADX INFO: loaded from: classes4.dex */
public final class h7i0 implements g6i0 {
    public final DoubleTextViewWithSeparator a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public h7i0(DoubleTextViewWithSeparator doubleTextViewWithSeparator, TextView textView, TextView textView2, TextView textView3) {
        this.a = doubleTextViewWithSeparator;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
