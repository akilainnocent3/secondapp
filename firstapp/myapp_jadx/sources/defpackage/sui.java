package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class sui implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;

    public sui(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = imageView;
        this.e = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
