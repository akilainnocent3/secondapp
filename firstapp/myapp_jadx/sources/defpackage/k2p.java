package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class k2p implements g6i0 {
    public final ConstraintLayout a;
    public final m2p b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;

    public k2p(ConstraintLayout constraintLayout, m2p m2pVar, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = m2pVar;
        this.c = textView;
        this.d = imageView;
        this.e = textView2;
        this.f = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
