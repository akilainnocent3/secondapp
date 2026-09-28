package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes7.dex */
public final class df implements g6i0 {
    public final ConstraintLayout A;
    public final ClearEditText B;
    public final ConstraintLayout a;
    public final ImageButton b;
    public final TextView c;
    public final ProgressButton d;
    public final ImageView e;
    public final TextView f;
    public final TextView i;
    public final ImageView v;
    public final TextView w;
    public final ImageButton y;
    public final TextView z;

    public df(ConstraintLayout constraintLayout, ImageButton imageButton, TextView textView, ProgressButton progressButton, ImageView imageView, TextView textView2, TextView textView3, ImageView imageView2, TextView textView4, ImageButton imageButton2, TextView textView5, ConstraintLayout constraintLayout2, ClearEditText clearEditText) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = textView;
        this.d = progressButton;
        this.e = imageView;
        this.f = textView2;
        this.i = textView3;
        this.v = imageView2;
        this.w = textView4;
        this.y = imageButton2;
        this.z = textView5;
        this.A = constraintLayout2;
        this.B = clearEditText;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
