package defpackage;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class bjd0 implements g6i0 {
    public final TextView a;
    public final TextView b;

    public bjd0(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
