package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes8.dex */
public final class jw80 implements g6i0 {
    public final FrameLayout a;
    public final TextView b;
    public final LinearLayoutCompat c;
    public final TextView d;
    public final ConstraintLayout e;
    public final MaterialButton f;
    public final ImageButton i;
    public final View v;
    public final FrameLayout w;

    public jw80(FrameLayout frameLayout, TextView textView, LinearLayoutCompat linearLayoutCompat, TextView textView2, ConstraintLayout constraintLayout, MaterialButton materialButton, ImageButton imageButton, View view, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = textView;
        this.c = linearLayoutCompat;
        this.d = textView2;
        this.e = constraintLayout;
        this.f = materialButton;
        this.i = imageButton;
        this.v = view;
        this.w = frameLayout2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
