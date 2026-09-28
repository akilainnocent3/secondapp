package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class qrr implements g6i0 {
    public final EditText A;
    public final ImageView B;
    public final ImageButton C;
    public final ConstraintLayout D;
    public final ConstraintLayout E;
    public final n2p F;
    public final View G;
    public final ProgressBar H;
    public final TextView I;
    public final View J;
    public final ConstraintLayout a;
    public final n2p b;
    public final m2p c;
    public final ConstraintLayout d;
    public final ImageButton e;
    public final ImageButton f;
    public final ImageButton i;
    public final RecyclerView v;
    public final ImageButton w;
    public final ConstraintLayout y;
    public final ImageView z;

    public qrr(ConstraintLayout constraintLayout, n2p n2pVar, m2p m2pVar, ConstraintLayout constraintLayout2, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, RecyclerView recyclerView, ImageButton imageButton4, ConstraintLayout constraintLayout3, ImageView imageView, EditText editText, ImageView imageView2, ImageButton imageButton5, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, n2p n2pVar2, View view, ProgressBar progressBar, TextView textView, View view2) {
        this.a = constraintLayout;
        this.b = n2pVar;
        this.c = m2pVar;
        this.d = constraintLayout2;
        this.e = imageButton;
        this.f = imageButton2;
        this.i = imageButton3;
        this.v = recyclerView;
        this.w = imageButton4;
        this.y = constraintLayout3;
        this.z = imageView;
        this.A = editText;
        this.B = imageView2;
        this.C = imageButton5;
        this.D = constraintLayout4;
        this.E = constraintLayout5;
        this.F = n2pVar2;
        this.G = view;
        this.H = progressBar;
        this.I = textView;
        this.J = view2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
