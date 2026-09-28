package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class dme implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final Button c;
    public final ProgressButton d;
    public final Button e;
    public final TextView f;

    public dme(ConstraintLayout constraintLayout, TextView textView, Button button, ProgressButton progressButton, Button button2, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = button;
        this.d = progressButton;
        this.e = button2;
        this.f = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
