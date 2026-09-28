package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes7.dex */
public final class c920 implements g6i0 {
    public final LinearLayoutCompat a;
    public final TextView b;
    public final LinearLayoutCompat c;
    public final TextView d;
    public final ConstraintLayout e;
    public final MaterialButton f;

    public c920(LinearLayoutCompat linearLayoutCompat, TextView textView, LinearLayoutCompat linearLayoutCompat2, TextView textView2, ConstraintLayout constraintLayout, MaterialButton materialButton) {
        this.a = linearLayoutCompat;
        this.b = textView;
        this.c = linearLayoutCompat2;
        this.d = textView2;
        this.e = constraintLayout;
        this.f = materialButton;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
